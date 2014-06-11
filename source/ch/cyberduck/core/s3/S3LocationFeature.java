package ch.cyberduck.core.s3;

/*
 * Copyright (c) 2002-2013 David Kocher. All rights reserved.
 * http://cyberduck.ch/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * Bug fixes, suggestions and comments should be sent to feedback@cyberduck.ch
 */

import ch.cyberduck.core.Path;
import ch.cyberduck.core.exception.AccessDeniedException;
import ch.cyberduck.core.exception.BackgroundException;
import ch.cyberduck.core.exception.InteroperabilityException;
import ch.cyberduck.core.features.Location;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.jets3t.service.ServiceException;

import java.util.Set;

/**
 * @version $Id$
 */
public class S3LocationFeature implements Location {
    private static final Logger log = Logger.getLogger(S3LocationFeature.class);

    private S3Session session;

    public S3LocationFeature(final S3Session session) {
        this.session = session;
    }

    @Override
    public Set<String> getLocations() {
        return session.getHost().getProtocol().getRegions();
    }

    @Override
    public String getLocation(final Path file) throws BackgroundException {
        final Path container = new S3PathContainerService().getContainer(file);
        try {
            String location = session.getClient().getBucketLocation(
                    container.getName());
            if(StringUtils.isBlank(location)) {
                location = "US"; //Default location US is null
            }
            container.attributes().setRegion(location);
            return location;
        }
        catch(ServiceException e) {
            try {
                throw new ServiceExceptionMappingService().map("Cannot read bucket location", e);
            }
            catch(AccessDeniedException l) {
                log.warn(String.format("Missing permission to read location for %s %s", container, e.getMessage()));
                return null;
            }
            catch(InteroperabilityException i) {
                log.warn(String.format("Not supported to read location for %s %s", container, e.getMessage()));
                return null;
            }
        }
    }
}

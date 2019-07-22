package ch.cyberduck.core.shared;

/*
 * Copyright (c) 2002-2017 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import ch.cyberduck.core.PasswordCallback;
import ch.cyberduck.core.features.Scheduler;
import ch.cyberduck.core.pool.SessionPool;

public class DelegatingSchedulerFeature implements Scheduler<Void> {

    private final Scheduler[] features;

    public DelegatingSchedulerFeature(final Scheduler... features) {
        this.features = features;
    }

    @Override
    public Void repeat(final SessionPool pool, final PasswordCallback callback) {
        for(Scheduler scheduler : features) {
            scheduler.repeat(pool, callback);
        }
        return null;
    }

    @Override
    public void shutdown() {
        for(Scheduler scheduler : features) {
            scheduler.shutdown();
        }
    }
}

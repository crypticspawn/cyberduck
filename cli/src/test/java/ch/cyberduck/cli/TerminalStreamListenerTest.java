package ch.cyberduck.cli;

/*
 * Copyright (c) 2002-2015 David Kocher. All rights reserved.
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

import ch.cyberduck.core.Host;
import ch.cyberduck.core.TestProtocol;
import ch.cyberduck.core.transfer.DownloadTransfer;
import ch.cyberduck.core.transfer.TransferItem;
import ch.cyberduck.core.transfer.TransferSpeedometer;

import org.junit.Test;

import java.util.Collections;

public class TerminalStreamListenerTest  {

    @Test
    public void testRecv() {
        final DownloadTransfer transfer = new DownloadTransfer(new Host(new TestProtocol()), Collections.<TransferItem>emptyList());
        final TerminalStreamListener l = new TerminalStreamListener(new TransferSpeedometer(transfer));
        l.recv(1L);
        transfer.addSize(1L);
        l.recv(1L);
    }

    @Test
    public void testSent() {
        final DownloadTransfer transfer = new DownloadTransfer(new Host(new TestProtocol()), Collections.<TransferItem>emptyList());
        final TerminalStreamListener l = new TerminalStreamListener(new TransferSpeedometer(transfer));
        l.sent(1L);
        transfer.addSize(1L);
        l.sent(1L);
    }
}
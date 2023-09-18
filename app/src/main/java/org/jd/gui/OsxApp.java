/*
 * Copyright (c) 2008-2019 Emmanuel Dupuy.
 * This project is distributed under the GPLv3 license.
 * This is a Copyleft license that gives the user the right to use,
 * copy and modify the code freely for non-commercial purposes.
 */

package org.jd.gui;

import java.awt.Desktop;

public class OsxApp extends App {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Desktop application = Desktop.getDesktop();

        App.main(args);

        // Add an handle invoked when the application is asked to open a list of files
        application.setOpenFileHandler(e -> controller.openFiles(e.getFiles()));

        // Add an handle invoked when the application is asked to quit
        application.setQuitHandler((e, r) -> System.exit(0));
    }
}

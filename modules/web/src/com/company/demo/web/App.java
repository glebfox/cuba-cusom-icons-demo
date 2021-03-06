package com.company.demo.web;

import com.company.demo.web.fonts.IcoMoon;
import com.company.demo.web.fonts.VaadinIcons;
import com.haulmont.cuba.web.DefaultApp;
import com.haulmont.cuba.web.gui.components.WebComponentsHelper;

public class App extends DefaultApp {

    static {
        WebComponentsHelper.registerFontIcon("ico-moon-icon", IcoMoon.class);
        WebComponentsHelper.registerFontIcon("vaadin-icon", VaadinIcons.class);
    }
}
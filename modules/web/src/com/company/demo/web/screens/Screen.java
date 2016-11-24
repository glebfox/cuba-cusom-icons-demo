package com.company.demo.web.screens;

import com.company.demo.web.fonts.IcoMoon;
import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.FlowBoxLayout;
import com.haulmont.cuba.web.gui.components.WebComponentsHelper;
import com.vaadin.ui.AbstractLayout;

import javax.inject.Inject;
import java.util.Map;

/**
 * @author gorelov
 */
public class Screen extends AbstractWindow {

    @Inject
    protected FlowBoxLayout box;
    @Inject
    protected Button spinnerBtn;

    @Override
    public void init(Map<String, Object> params) {
        AbstractLayout layout = (AbstractLayout) WebComponentsHelper.unwrap(box);
        com.vaadin.ui.Button btn = new com.vaadin.ui.Button("Play", IcoMoon.PLAY3);
        layout.addComponent(btn);

        btn = new com.vaadin.ui.Button("Search", WebComponentsHelper.getResource("theme:icons.search.png"));
        layout.addComponent(btn);

        spinnerBtn.setIcon("ico-moon-icon:SPINNER6");
    }
}
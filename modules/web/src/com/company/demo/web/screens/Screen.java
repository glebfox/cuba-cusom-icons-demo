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
    protected FlowBoxLayout icoMoonBox;
    @Inject
    protected Button spinnerBtn;
    @Inject
    private FlowBoxLayout vaadinIconsBox;
    @Inject
    private Button walletBtn;

    @Override
    public void init(Map<String, Object> params) {
        initIconMoonBox();
        initVaadinIconsBox();
    }

    private void initIconMoonBox() {
        AbstractLayout layout = (AbstractLayout) WebComponentsHelper.unwrap(icoMoonBox);
        com.vaadin.ui.Button btn = new com.vaadin.ui.Button("Play", IcoMoon.PLAY3);
        layout.addComponent(btn);

        spinnerBtn.setIcon("ico-moon-icon:SPINNER6");
    }

    private void initVaadinIconsBox() {
        walletBtn.setIcon("vaadin-icon:WALLET");
    }
}
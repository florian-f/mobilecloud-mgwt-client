package com.florian.videoclient.client.activities.mainmenuview;

import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.widget.panel.flex.RootFlexPanel;

/**
 * Created by florian on 22.08.14.
 */
public class MainMenuViewGwtImpl implements MainMenuView {

    private RootFlexPanel main;

    public MainMenuViewGwtImpl() {
        main = new RootFlexPanel();
    }

    public Widget asWidget() {
        return main;
    }
}

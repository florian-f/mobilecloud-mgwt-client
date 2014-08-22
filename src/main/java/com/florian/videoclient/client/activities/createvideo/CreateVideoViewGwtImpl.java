package com.florian.videoclient.client.activities.createvideo;

import com.florian.videoclient.client.activities.DetailViewGwtImpl;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.widget.panel.flex.RootFlexPanel;

/**
 * Created by florian on 22.08.14.
 */
public class CreateVideoViewGwtImpl extends DetailViewGwtImpl implements CreateVideoView {

    private RootFlexPanel main;

    public CreateVideoViewGwtImpl() {
        main = new RootFlexPanel();
    }

    public Widget asWidget() {
        return main;
    }
}

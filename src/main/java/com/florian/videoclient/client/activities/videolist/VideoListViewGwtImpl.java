package com.florian.videoclient.client.activities.videolist;

import com.florian.videoclient.client.activities.DetailViewGwtImpl;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.widget.panel.flex.RootFlexPanel;

/**
 * Created by florian on 22.08.14.
 */
public class VideoListViewGwtImpl extends DetailViewGwtImpl implements VideoListView {

    private RootFlexPanel main;

    public VideoListViewGwtImpl() {
        main = new RootFlexPanel();
    }

    public Widget asWidget() {
        return main;
    }
}

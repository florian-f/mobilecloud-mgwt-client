package com.florian.videoclient.client.activities.videolist;

import com.florian.videoclient.client.activities.DetailView;
import com.google.gwt.user.client.ui.IsWidget;
import com.googlecode.mgwt.ui.client.widget.base.HasRefresh;
import com.googlecode.mgwt.ui.client.widget.panel.pull.PullArrowWidget;
import com.googlecode.mgwt.ui.client.widget.panel.pull.PullPanel;

import java.util.List;

/**
 * Created by florian on 22.08.14.
 */
public interface VideoListView extends DetailView {

    public void render(List<VideoItem> videoItems);

    public void setHeaderPullHandler(PullPanel.Pullhandler pullHandler);

    public PullArrowWidget getPullHeader();

    public void refresh();

    public HasRefresh getPullPanel();
}

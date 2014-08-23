package com.florian.videoclient.client.activities.videolist;

import com.florian.videoclient.client.BasicCell;
import com.florian.videoclient.client.activities.DetailViewGwtImpl;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.widget.base.HasRefresh;
import com.googlecode.mgwt.ui.client.widget.list.celllist.CellList;
import com.googlecode.mgwt.ui.client.widget.panel.flex.RootFlexPanel;
import com.googlecode.mgwt.ui.client.widget.panel.pull.PullArrowFooter;
import com.googlecode.mgwt.ui.client.widget.panel.pull.PullArrowHeader;
import com.googlecode.mgwt.ui.client.widget.panel.pull.PullArrowWidget;
import com.googlecode.mgwt.ui.client.widget.panel.pull.PullPanel;

import java.util.List;

/**
 * Created by florian on 22.08.14.
 */
public class VideoListViewGwtImpl extends DetailViewGwtImpl implements VideoListView {

    private PullPanel pullToRefresh;
    private CellList<VideoItem> cellList;

    private PullArrowHeader pullArrowHeader;

    public VideoListViewGwtImpl() {
        main.remove(scrollPanel);

        pullToRefresh = new PullPanel();

        pullArrowHeader = new PullArrowHeader();

        pullToRefresh.setHeader(pullArrowHeader);

        main.add(pullToRefresh);

        cellList = new CellList<VideoItem>(new BasicCell<VideoItem>() {

            @Override
            public String getDisplayString(VideoItem model) {
                return model.getName();
            }
        });

        pullToRefresh.add(cellList);

    }

    @Override
    public void render(List<VideoItem> VideoItems) {
        cellList.render(VideoItems);

    }

    @Override
    public void setHeaderPullHandler(PullPanel.Pullhandler pullHandler) {
        pullToRefresh.setHeaderPullHandler(pullHandler);

    }

    @Override
    public PullArrowWidget getPullHeader() {
        return pullArrowHeader;
    }

    @Override
    public void refresh() {
        pullToRefresh.refresh();

    }

    @Override
    public HasRefresh getPullPanel() {
        return pullToRefresh;
    }

}

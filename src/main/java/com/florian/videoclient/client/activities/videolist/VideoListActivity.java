package com.florian.videoclient.client.activities.videolist;

import com.florian.videoclient.client.ClientFactory;
import com.florian.videoclient.client.activities.DetailActivity;
import com.florian.videoclient.client.activities.DetailView;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;

/**
 * Created by florian on 22.08.14.
 */
public class VideoListActivity extends DetailActivity {

    private ClientFactory clientFactory;
    public VideoListActivity(ClientFactory clientFactory) {
        super(clientFactory.getVideoListView(), "nav");
        this.clientFactory = clientFactory;
    }
}

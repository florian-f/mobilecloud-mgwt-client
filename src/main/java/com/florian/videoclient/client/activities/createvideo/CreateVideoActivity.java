package com.florian.videoclient.client.activities.createvideo;

import com.florian.videoclient.client.ClientFactory;
import com.florian.videoclient.client.activities.DetailActivity;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;

/**
 * Created by florian on 22.08.14.
 */
public class CreateVideoActivity extends DetailActivity {

    private final ClientFactory clientFactory;

    public CreateVideoActivity(ClientFactory clientFactory) {
        super(clientFactory.getCreateVideoView(), "nav");
        this.clientFactory = clientFactory;
    }
}
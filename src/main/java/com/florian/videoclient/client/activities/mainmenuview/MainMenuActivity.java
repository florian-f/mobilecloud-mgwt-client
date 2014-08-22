package com.florian.videoclient.client.activities.mainmenuview;

import com.florian.videoclient.client.ClientFactory;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;

/**
 * Created by florian on 22.08.14.
 */
public class MainMenuActivity extends MGWTAbstractActivity {
    private final ClientFactory clientFactory;

    public MainMenuActivity(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }
}

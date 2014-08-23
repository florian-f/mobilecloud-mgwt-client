/*
 * Copyright 2010 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.florian.videoclient.client;

import com.florian.videoclient.client.activities.createvideo.CreateVideoView;
import com.florian.videoclient.client.activities.createvideo.CreateVideoViewGwtImpl;
import com.florian.videoclient.client.activities.mainmenu.MainMenuView;
import com.florian.videoclient.client.activities.mainmenu.MainMenuViewGwtImpl;
import com.florian.videoclient.client.activities.videolist.VideoListView;
import com.florian.videoclient.client.activities.videolist.VideoListViewGwtImpl;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.florian.videoclient.client.activities.about.AboutView;
import com.florian.videoclient.client.activities.about.AboutViewGwtImpl;

/**
 * @author Daniel Kurka
 * 
 */
public class ClientFactoryImpl implements ClientFactory {

    private EventBus eventBus;
    private PlaceController placeController;

    private AboutView aboutView;
    private CreateVideoView createVideoView;
    private VideoListView videoListView;
    private MainMenuView mainMenuView;


	public ClientFactoryImpl() {
		eventBus = new SimpleEventBus();

		placeController = new PlaceController(eventBus);

		mainMenuView = new MainMenuViewGwtImpl();
	}

	@Override
	public MainMenuView getHomeView() {
		if (mainMenuView == null) {
			mainMenuView = new MainMenuViewGwtImpl();
		}
		return mainMenuView;
	}

	@Override
	public EventBus getEventBus() {
		return eventBus;
	}

	@Override
	public PlaceController getPlaceController() {
		return placeController;
	}

	@Override
	public AboutView getAboutView() {
		if (aboutView == null) {
			aboutView = new AboutViewGwtImpl();
		}

		return aboutView;
	}

    @Override
    public CreateVideoView getCreateVideoView() {
        if (createVideoView == null) {
            createVideoView = new CreateVideoViewGwtImpl();
        }
        return createVideoView;
    }

    @Override
    public VideoListView getVideoListView() {
        if (videoListView == null) {
            videoListView = new VideoListViewGwtImpl();
        }

        return videoListView;
    }
}

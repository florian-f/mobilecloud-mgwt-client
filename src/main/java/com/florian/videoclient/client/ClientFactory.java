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
import com.florian.videoclient.client.activities.mainmenuview.MainMenuView;
import com.florian.videoclient.client.activities.videolist.VideoListView;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.florian.videoclient.client.activities.about.AboutView;

/**
 * @author Daniel Kurka
 * 
 */
public interface ClientFactory {
	public MainMenuView getHomeView();

	public EventBus getEventBus();

	public PlaceController getPlaceController();

	/**
	 * @return
	 */

	public AboutView getAboutView();

    public CreateVideoView getCreateVideoView();

    public VideoListView getVideoListView();
}

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
package com.florian.videoclient.client.mapper.phone;

import com.florian.videoclient.client.activities.createvideo.CreateVideoActivity;
import com.florian.videoclient.client.activities.createvideo.CreateVideoPlace;
import com.florian.videoclient.client.activities.mainmenuview.MainMenuActivity;
import com.florian.videoclient.client.activities.videolist.VideoListActivity;
import com.florian.videoclient.client.activities.videolist.VideoListPlace;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.florian.videoclient.client.ClientFactory;
import com.florian.videoclient.client.activities.about.AboutActivity;
import com.florian.videoclient.client.activities.about.AboutPlace;

import com.florian.videoclient.client.places.HomePlace;

/**
 * @author Daniel Kurka
 * 
 */
public class PhoneActivityMapper implements ActivityMapper {

	private final ClientFactory clientFactory;

	public PhoneActivityMapper(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(Place place) {
		if (place instanceof HomePlace) {
			return new MainMenuActivity(clientFactory);
		}

		if (place instanceof CreateVideoPlace) {
			return new CreateVideoActivity(clientFactory);
		}

		if (place instanceof AboutPlace) {
			return new AboutActivity(clientFactory);
		}

		if (place instanceof VideoListPlace) {
			return new VideoListActivity(clientFactory);
		}

		return new MainMenuActivity(clientFactory);
	}
}

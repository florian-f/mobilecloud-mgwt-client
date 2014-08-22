package com.florian.videoclient.client.mapper.tablet;

import com.florian.videoclient.client.activities.createvideo.CreateVideoActivity;
import com.florian.videoclient.client.activities.createvideo.CreateVideoPlace;
import com.florian.videoclient.client.activities.videolist.VideoListActivity;
import com.florian.videoclient.client.activities.videolist.VideoListPlace;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.florian.videoclient.client.ClientFactory;
import com.florian.videoclient.client.activities.about.AboutActivity;
import com.florian.videoclient.client.activities.about.AboutPlace;

import com.florian.videoclient.client.places.HomePlace;

public class TabletMainActivityMapper implements ActivityMapper {

	private final ClientFactory clientFactory;

	private Place lastPlace;

	public TabletMainActivityMapper(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;

	}

	@Override
	public Activity getActivity(Place place) {
		Activity activity = getActivity(lastPlace, place);
		lastPlace = place;
		return activity;

	}

	private AboutActivity aboutActivity;

	private AboutActivity getAboutActivity() {
		if (aboutActivity == null) {
			aboutActivity = new AboutActivity(clientFactory);
		}

		return aboutActivity;
	}

	private Activity getActivity(Place lastPlace, Place newPlace) {
		if (newPlace instanceof HomePlace) {
			return getAboutActivity();
		}

		if (newPlace instanceof AboutPlace) {
			return getAboutActivity();
		}

//		if (newPlace instanceof UIPlace) {
//			return getAboutActivity();
//		}
//
//		if (newPlace instanceof ScrollWidgetPlace) {
//			return new ScrollWidgetActivity(clientFactory);
//		}

        if (newPlace instanceof CreateVideoPlace) {
            return new CreateVideoActivity(clientFactory);
        }

        if(newPlace instanceof VideoListPlace) {
            return new VideoListActivity(clientFactory);
        }
        return null;
	}

}

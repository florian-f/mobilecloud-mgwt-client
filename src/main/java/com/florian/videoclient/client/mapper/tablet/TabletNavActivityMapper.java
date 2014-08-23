package com.florian.videoclient.client.mapper.tablet;

import com.florian.videoclient.client.activities.createvideo.CreateVideoActivity;
import com.florian.videoclient.client.activities.createvideo.CreateVideoPlace;
import com.florian.videoclient.client.activities.mainmenu.MainMenuActivity;
import com.florian.videoclient.client.activities.videolist.VideoListActivity;
import com.florian.videoclient.client.activities.videolist.VideoListPlace;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.florian.videoclient.client.ClientFactory;
import com.florian.videoclient.client.activities.about.AboutPlace;
import com.florian.videoclient.client.places.HomePlace;

public class TabletNavActivityMapper implements ActivityMapper {

	private final ClientFactory clientFactory;

	public TabletNavActivityMapper(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

    private MainMenuActivity mainMenuActivity;
    private CreateVideoActivity createVideoActivity;
    private VideoListActivity videoListActivity;

    private Activity getCreateVideoActivity() {
        if (createVideoActivity == null) {
            createVideoActivity = new CreateVideoActivity(clientFactory);
        }
        return createVideoActivity;
    }

    private Activity getVideoListActivity() {
        if (videoListActivity == null) {
            videoListActivity = new VideoListActivity(clientFactory);
        }
        return videoListActivity;
    }

    private Activity getMainMenuActivity() {
        if (mainMenuActivity == null) {
            mainMenuActivity = new MainMenuActivity(clientFactory);
        }
        return mainMenuActivity;
    }

	@Override
	public Activity getActivity(Place place) {
//		if (place instanceof HomePlace || place instanceof AboutPlace) {
//			return getMainMenuActivity();
//		}
//
//        if (place instanceof CreateVideoPlace) {
//            return getCreateVideoActivity();
//        }
//
//		if (place instanceof VideoListPlace) {
//			return getVideoListActivity();
//		}
//
//		return new MainMenuActivity(clientFactory);

        return getMainMenuActivity();
	}
}

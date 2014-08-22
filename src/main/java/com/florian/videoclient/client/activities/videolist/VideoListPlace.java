package com.florian.videoclient.client.activities.videolist;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

/**
 * Created by florian on 22.08.14.
 */
public class VideoListPlace extends Place {
    public static class VideoListPlaceTokenizer implements PlaceTokenizer<VideoListPlace> {

        @Override
        public VideoListPlace getPlace(String s) {
            return new VideoListPlace();
        }

        @Override
        public String getToken(VideoListPlace videoListPlace) {
            return "";
        }
    }
}

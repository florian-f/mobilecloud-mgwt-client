package com.florian.videoclient.client.activities.createvideo;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

/**
 * Created by florian on 22.08.14.
 */
public class CreateVideoPlace extends Place {
    public static class CreateVideoPlaceTokenizer implements PlaceTokenizer<CreateVideoPlace> {

        @Override
        public CreateVideoPlace getPlace(String token) {
            return new CreateVideoPlace();
        }

        @Override
        public String getToken(CreateVideoPlace place) {
            return "";
        }

    }
}


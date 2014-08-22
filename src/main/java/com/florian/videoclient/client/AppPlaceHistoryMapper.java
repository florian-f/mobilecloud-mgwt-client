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

import com.florian.videoclient.client.activities.createvideo.CreateVideoPlace;
import com.florian.videoclient.client.activities.videolist.VideoListPlace;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.florian.videoclient.client.activities.about.AboutPlace.AboutPlaceTokenizer;

import com.florian.videoclient.client.places.HomePlace.HomePlaceTokenizer;

/**
 * @author Daniel Kurka
 * 
 */
@WithTokenizers({ HomePlaceTokenizer.class, AboutPlaceTokenizer.class, CreateVideoPlace.CreateVideoPlaceTokenizer.class, VideoListPlace.VideoListPlaceTokenizer.class})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {
}

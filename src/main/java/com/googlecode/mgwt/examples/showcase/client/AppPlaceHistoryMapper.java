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
package com.googlecode.mgwt.examples.showcase.client;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.googlecode.mgwt.examples.showcase.client.activities.about.AboutPlace.AboutPlaceTokenizer;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.UIPlace.UIPlaceTokenizer;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.AnimationPlace.AnimationPlaceTokenizer;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationCubePlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationDissolvePlace.AnimationDissolvePlaceTokenizer;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationFadePlace.AnimationFadePlaceTokenizer;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationFlipPlace.AnimationFlipPlaceTokenizer;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationPopPlace.AnimationPopPlaceTokenizer;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationSlidePlace.AnimationSlidePlaceTokenizer;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationSlideUpPlace.AnimationSlideUpPlaceTokenizer;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationSwapPlace.AnimationSwapPlaceTokenizer;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.button.ButtonPlace.ButtonPlaceTokenizer;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.buttonbar.ButtonBarPlace.ButtonBarPlaceTokenizer;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.carousel.CarouselPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.elements.ElementsPlace.ElementsPlaceTokenizer;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.forms.FormsPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.gcell.GroupedCellListPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.popup.PopupPlace.PopupPlaceTokenizer;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.progressbar.ProgressBarPlace.ProgressBarPlaceTokenizer;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.progressindicator.ProgressIndicatorPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.pulltorefresh.PullToRefreshPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.scrollwidget.ScrollWidgetPlace.ScrollWidgetPlaceTokenizer;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.searchbox.SearchBoxPlace.SearchBoxPlaceTokenizer;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.slider.SliderPlace.SliderPlaceTokenizer;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.tabbar.TabBarPlace.TabBarPlaceTokenizer;
import com.googlecode.mgwt.examples.showcase.client.places.HomePlace.HomePlaceTokenizer;

/**
 * @author Daniel Kurka
 * 
 */
@WithTokenizers({ HomePlaceTokenizer.class, UIPlaceTokenizer.class, ScrollWidgetPlaceTokenizer.class, AboutPlaceTokenizer.class, ButtonPlaceTokenizer.class, AnimationDissolvePlaceTokenizer.class,
		AnimationFadePlaceTokenizer.class, AnimationFlipPlaceTokenizer.class, AnimationPlaceTokenizer.class, AnimationPopPlaceTokenizer.class, AnimationSlidePlaceTokenizer.class,
		AnimationSlideUpPlaceTokenizer.class, AnimationSwapPlaceTokenizer.class, ButtonBarPlaceTokenizer.class, ElementsPlaceTokenizer.class, FormsPlace.Tokenizer.class, PopupPlaceTokenizer.class,
		ProgressBarPlaceTokenizer.class, SearchBoxPlaceTokenizer.class, SliderPlaceTokenizer.class, TabBarPlaceTokenizer.class, PullToRefreshPlace.Tokenizer.class, AnimationCubePlace.Tokenizer.class,
		ProgressIndicatorPlace.Tokenizer.class, CarouselPlace.Tokenizer.class, GroupedCellListPlace.Tokenizer.class })
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {
}

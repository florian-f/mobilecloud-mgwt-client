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
package com.googlecode.mgwt.examples.showcase.client.mapper.phone;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.googlecode.mgwt.examples.showcase.client.ClientFactory;
import com.googlecode.mgwt.examples.showcase.client.activities.about.AboutActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.about.AboutPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ShowCaseListActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.UIActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.UIPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.AnimationActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.AnimationPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationDissolvePlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationDoneActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationFadePlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationFlipPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationPopPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationSlidePlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationSlideUpPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationSwapPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.button.ButtonActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.button.ButtonPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.buttonbar.ButtonBarActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.buttonbar.ButtonBarPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.carousel.CarouselActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.carousel.CarouselPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.elements.ElementsActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.elements.ElementsPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.forms.FormsActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.forms.FormsPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.gcell.GroupedCellListActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.gcell.GroupedCellListPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.popup.PopupActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.popup.PopupPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.progressbar.ProgressBarActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.progressbar.ProgressBarPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.progressindicator.ProgressIndicatorActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.progressindicator.ProgressIndicatorPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.pulltorefresh.PullToRefreshActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.pulltorefresh.PullToRefreshPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.scrollwidget.ScrollWidgetActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.scrollwidget.ScrollWidgetPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.searchbox.SearchBoxActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.searchbox.SearchBoxPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.slider.SliderActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.slider.SliderPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.tabbar.TabBarActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.tabbar.TabBarPlace;
import com.googlecode.mgwt.examples.showcase.client.places.HomePlace;

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
			return new ShowCaseListActivity(clientFactory);
		}

		if (place instanceof UIPlace) {
			return new UIActivity(clientFactory);
		}

		if (place instanceof AboutPlace) {
			return new AboutActivity(clientFactory);
		}

		if (place instanceof AnimationPlace) {
			return new AnimationActivity(clientFactory);
		}

		if (place instanceof ScrollWidgetPlace) {
			return new ScrollWidgetActivity(clientFactory);
		}

		if (place instanceof ElementsPlace) {
			return new ElementsActivity(clientFactory);
		}

		if (place instanceof FormsPlace) {
			return new FormsActivity(clientFactory);
		}

		if (place instanceof ButtonBarPlace) {
			return new ButtonBarActivity(clientFactory);
		}

		if (place instanceof SearchBoxPlace) {
			return new SearchBoxActivity(clientFactory);
		}

		if (place instanceof TabBarPlace) {
			return new TabBarActivity(clientFactory);
		}

		if (place instanceof ButtonPlace) {
			return new ButtonActivity(clientFactory);
		}

		if (place instanceof PopupPlace) {
			return new PopupActivity(clientFactory);
		}

		if (place instanceof ProgressBarPlace) {
			return new ProgressBarActivity(clientFactory);
		}

		if (place instanceof ProgressIndicatorPlace) {
			return new ProgressIndicatorActivity(clientFactory);
		}

		if (place instanceof SliderPlace) {
			return new SliderActivity(clientFactory);
		}
		if (place instanceof PullToRefreshPlace) {
			return new PullToRefreshActivity(clientFactory);
		}

		if (place instanceof CarouselPlace) {
			return new CarouselActivity(clientFactory);
		}

		if (place instanceof GroupedCellListPlace) {
			return new GroupedCellListActivity(clientFactory);
		}

		if (place instanceof AnimationSlidePlace || place instanceof AnimationSlideUpPlace || place instanceof AnimationDissolvePlace || place instanceof AnimationFadePlace
				|| place instanceof AnimationFlipPlace || place instanceof AnimationPopPlace || place instanceof AnimationSwapPlace || place instanceof AnimationSwapPlace) {
			return new AnimationDoneActivity(clientFactory);
		}
		return new ShowCaseListActivity(clientFactory);
	}
}

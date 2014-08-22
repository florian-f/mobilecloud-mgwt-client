package com.googlecode.mgwt.examples.showcase.client.mapper.tablet;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.googlecode.mgwt.examples.showcase.client.ClientFactory;
import com.googlecode.mgwt.examples.showcase.client.activities.about.AboutPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ShowCaseListActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.UIActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.UIPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.AnimationActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.AnimationPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationCubePlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationDissolvePlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationFadePlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationFlipPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationPopPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationSlidePlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationSlideUpPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationSwapPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.button.ButtonPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.buttonbar.ButtonBarPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.carousel.CarouselPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.elements.ElementsPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.forms.FormsPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.gcell.GroupedCellListPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.popup.PopupPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.progressbar.ProgressBarPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.progressindicator.ProgressIndicatorPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.pulltorefresh.PullToRefreshPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.scrollwidget.ScrollWidgetPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.searchbox.SearchBoxPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.slider.SliderPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.tabbar.TabBarPlace;
import com.googlecode.mgwt.examples.showcase.client.places.HomePlace;

public class TabletNavActivityMapper implements ActivityMapper {

	private final ClientFactory clientFactory;

	public TabletNavActivityMapper(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	private UIActivity uiActivity;
	private ShowCaseListActivity showCaseListActivity;
	private AnimationActivity animationActivity;

	private Activity getUIActivity() {
		if (uiActivity == null) {
			uiActivity = new UIActivity(clientFactory);
		}
		return uiActivity;
	}

	private Activity getShowCaseListActivity() {
		if (showCaseListActivity == null) {
			showCaseListActivity = new ShowCaseListActivity(clientFactory);
		}
		return showCaseListActivity;
	}

	private Activity getAnimationActicity() {
		if (animationActivity == null) {
			animationActivity = new AnimationActivity(clientFactory);
		}
		return animationActivity;
	}

	@Override
	public Activity getActivity(Place place) {
		if (place instanceof HomePlace || place instanceof AboutPlace) {
			return getShowCaseListActivity();
		}

		if (place instanceof PullToRefreshPlace || place instanceof GroupedCellListPlace || place instanceof CarouselPlace || place instanceof UIPlace || place instanceof ScrollWidgetPlace
				|| place instanceof ElementsPlace || place instanceof FormsPlace || place instanceof ButtonBarPlace || place instanceof SearchBoxPlace || place instanceof TabBarPlace
				|| place instanceof ButtonPlace || place instanceof PopupPlace || place instanceof ProgressBarPlace || place instanceof SliderPlace || place instanceof ProgressIndicatorPlace) {
			return getUIActivity();
		}

		if (place instanceof AnimationPlace) {
			return getAnimationActicity();
		}

		if (place instanceof AnimationSlidePlace || place instanceof AnimationSlideUpPlace || place instanceof AnimationDissolvePlace || place instanceof AnimationFadePlace
				|| place instanceof AnimationFlipPlace || place instanceof AnimationPopPlace || place instanceof AnimationSwapPlace || place instanceof AnimationCubePlace) {
			return getAnimationActicity();
		}
		return new ShowCaseListActivity(clientFactory);
	}
}

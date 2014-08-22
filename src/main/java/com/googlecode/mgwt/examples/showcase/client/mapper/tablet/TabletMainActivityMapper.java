package com.googlecode.mgwt.examples.showcase.client.mapper.tablet;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.googlecode.mgwt.examples.showcase.client.ClientFactory;
import com.googlecode.mgwt.examples.showcase.client.activities.about.AboutActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.about.AboutPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.ui.UIPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.AnimationPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.showcaselist.animation.animationdone.AnimationCubePlace;
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

		if (newPlace instanceof UIPlace) {
			return getAboutActivity();
		}

		if (newPlace instanceof ScrollWidgetPlace) {
			return new ScrollWidgetActivity(clientFactory);
		}

		if (newPlace instanceof ElementsPlace) {
			return new ElementsActivity(clientFactory);
		}

		if (newPlace instanceof FormsPlace) {
			return new FormsActivity(clientFactory);
		}

		if (newPlace instanceof ButtonBarPlace) {
			return new ButtonBarActivity(clientFactory);
		}

		if (newPlace instanceof SearchBoxPlace) {
			return new SearchBoxActivity(clientFactory);
		}

		if (newPlace instanceof TabBarPlace) {
			return new TabBarActivity(clientFactory);
		}

		if (newPlace instanceof ButtonPlace) {
			return new ButtonActivity(clientFactory);
		}

		if (newPlace instanceof PopupPlace) {
			return new PopupActivity(clientFactory);
		}

		if (newPlace instanceof ProgressBarPlace) {
			return new ProgressBarActivity(clientFactory);
		}

		if (newPlace instanceof ProgressIndicatorPlace) {
			return new ProgressIndicatorActivity(clientFactory);
		}

		if (newPlace instanceof SliderPlace) {
			return new SliderActivity(clientFactory);
		}

		if (newPlace instanceof AnimationPlace) {
			return new AboutActivity(clientFactory);
		}

		if (newPlace instanceof PullToRefreshPlace) {
			return new PullToRefreshActivity(clientFactory);
		}

		if (newPlace instanceof CarouselPlace) {
			return new CarouselActivity(clientFactory);
		}

		if (newPlace instanceof GroupedCellListPlace) {
			return new GroupedCellListActivity(clientFactory);
		}

		if (newPlace instanceof AnimationSlidePlace || newPlace instanceof AnimationSlideUpPlace || newPlace instanceof AnimationDissolvePlace || newPlace instanceof AnimationFadePlace
				|| newPlace instanceof AnimationFlipPlace || newPlace instanceof AnimationPopPlace || newPlace instanceof AnimationSwapPlace || newPlace instanceof AnimationCubePlace) {
			return new AnimationDoneActivity(clientFactory);
		}

		return null;
	}

}

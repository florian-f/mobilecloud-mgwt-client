package com.googlecode.mgwt.examples.showcase.client.mapper.tablet;

import com.google.gwt.place.shared.Place;
import com.googlecode.mgwt.examples.showcase.client.activities.ui.UIPlace;
import com.googlecode.mgwt.examples.showcase.client.places.HomePlace;
import com.googlecode.mgwt.mvp.client.AnimationMapper;
import com.googlecode.mgwt.ui.client.widget.animation.Animation;
import com.googlecode.mgwt.ui.client.widget.animation.Animations;

public class TabletNavAnimationMapper implements AnimationMapper {

	@Override
	public Animation getAnimation(Place oldPlace, Place newPlace) {
		if (oldPlace == null) {
			return Animations.FADE;
		}

		if (oldPlace instanceof HomePlace && newPlace instanceof UIPlace) {
			return Animations.SLIDE;
		}

		if (oldPlace instanceof UIPlace && newPlace instanceof HomePlace) {
			return Animations.SLIDE_REVERSE;
		}

		return Animations.SLIDE;
	}

}

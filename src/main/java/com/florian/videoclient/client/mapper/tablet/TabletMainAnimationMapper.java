package com.florian.videoclient.client.mapper.tablet;

import com.google.gwt.place.shared.Place;
import com.googlecode.mgwt.mvp.client.AnimationMapper;
import com.googlecode.mgwt.ui.client.widget.animation.Animation;
import com.googlecode.mgwt.ui.client.widget.animation.Animations;

public class TabletMainAnimationMapper implements AnimationMapper {

  @Override
  public Animation getAnimation(Place oldPlace, Place newPlace) {
    if (oldPlace == null) {
      return Animations.FADE;
    }

    // animation

//    if (oldPlace instanceof AnimationSlidePlace && newPlace instanceof AnimationPlace) {
//      return Animations.SLIDE_REVERSE;
//    }
//
//    if (newPlace instanceof AnimationSlideUpPlace) {
//      return Animations.SLIDE_UP;
//    }

    return Animations.FADE;
  }

}

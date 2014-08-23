package com.florian.videoclient.client;

import com.florian.videoclient.client.activities.createvideo.CreateVideoPlace;
import com.florian.videoclient.client.activities.mainmenu.MainMenuItemSelectedEvent;
import com.florian.videoclient.client.activities.videolist.VideoListPlace;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.History;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;
import com.googlecode.mgwt.dom.client.event.mouse.HandlerRegistrationCollection;
import com.florian.videoclient.client.activities.about.AboutPlace;
import com.florian.videoclient.client.activities.mainmenu.MainMenuItemSelectedEvent.MainMenuEntry;
import com.florian.videoclient.client.event.ActionEvent;
import com.florian.videoclient.client.event.ActionNames;
import com.florian.videoclient.client.places.HomePlace;
import com.googlecode.mgwt.mvp.client.history.HistoryHandler;
import com.googlecode.mgwt.mvp.client.history.HistoryObserver;
import com.googlecode.mgwt.ui.client.MGWT;

public class AppHistoryObserver implements HistoryObserver {

	@Override
	public void onPlaceChange(Place place, HistoryHandler handler) {

	}

	@Override
	public void onHistoryChanged(Place place, HistoryHandler handler) {

	}

	@Override
	public void onAppStarted(Place place, HistoryHandler historyHandler) {
		if (MGWT.getOsDetection().isPhone()) {
			onPhoneNav(place, historyHandler);
		} else {
			// tablet
			onTabletNav(place, historyHandler);

		}

	}

	@Override
	public HandlerRegistration bind(EventBus eventBus, final HistoryHandler historyHandler) {

        HandlerRegistration register1 = MainMenuItemSelectedEvent.register(eventBus, new MainMenuItemSelectedEvent.Handler() {

            @Override
            public void onAnimationSelected(MainMenuItemSelectedEvent event) {
                MainMenuEntry entry = event.getEntry();

                Place place = null;

                switch (entry) {
                    case ALL:
                        place = new VideoListPlace();
                        break;
                    case CREATE:
                        place = new CreateVideoPlace();
                        break;
                    default:
                        break;
                }

                if (MGWT.getFormFactor().isTablet() || MGWT.getFormFactor().isDesktop()) {

                    historyHandler.replaceCurrentPlace(place);
                    historyHandler.goTo(place, true);
                } else {
                    historyHandler.goTo(place);
                }
            }

        });

		HandlerRegistration register2 = ActionEvent.register(eventBus, ActionNames.BACK, new ActionEvent.Handler() {

			@Override
			public void onAction(ActionEvent event) {

				History.back();

			}
		});


		HandlerRegistrationCollection col = new HandlerRegistrationCollection();
        col.addHandlerRegistration(register1);
		col.addHandlerRegistration(register2);

		return col;
	}

	private void onPhoneNav(Place place, HistoryHandler historyHandler) {

        historyHandler.replaceCurrentPlace(new HomePlace());
	}

	private void onTabletNav(Place place, HistoryHandler historyHandler) {

        historyHandler.replaceCurrentPlace(new HomePlace());

    }
}

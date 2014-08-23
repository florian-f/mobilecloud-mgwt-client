package com.florian.videoclient.client.activities.mainmenu;

import com.google.web.bindery.event.shared.Event;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;

/**
 * Created by florian on 23.08.14.
 */
public class MainMenuItemSelectedEvent extends Event<MainMenuItemSelectedEvent.Handler> {

    public enum MainMenuEntry{
        ALL, CREATE
    }

    public interface Handler {
        void onAnimationSelected(MainMenuItemSelectedEvent event);
    }

    private static final Type<MainMenuItemSelectedEvent.Handler> TYPE = new Type<MainMenuItemSelectedEvent.Handler>();

    private final MainMenuEntry entry;

    public static void fire(EventBus eventBus, MainMenuEntry entry){
        eventBus.fireEvent(new MainMenuItemSelectedEvent(entry));
    }

    public static HandlerRegistration register(EventBus eventBus, Handler handler) {
        return eventBus.addHandler(TYPE, handler);
    }

    @Override
    public com.google.web.bindery.event.shared.Event.Type<Handler> getAssociatedType() {
        return TYPE;
    }

    protected MainMenuItemSelectedEvent(MainMenuEntry entry) {
        this.entry=entry;
    }

    @Override
    protected void dispatch(Handler handler) {
        handler.onAnimationSelected(this);

    }

    public MainMenuEntry getEntry() {
        return entry;
    }

    public static Type<Handler> getType() {
        return TYPE;
    }
}

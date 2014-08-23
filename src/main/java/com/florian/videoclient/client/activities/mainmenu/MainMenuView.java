package com.florian.videoclient.client.activities.mainmenu;

import com.google.gwt.user.client.ui.IsWidget;
import com.googlecode.mgwt.dom.client.event.tap.HasTapHandlers;
import com.googlecode.mgwt.ui.client.widget.list.celllist.HasCellSelectedHandler;
import com.florian.videoclient.client.activities.mainmenu.MainMenuItemSelectedEvent.MainMenuEntry;

import java.util.List;

/**
 * Created by florian on 22.08.14.
 */
public interface MainMenuView extends IsWidget {

    public void setTitle(String text);

    public HasTapHandlers getAboutButton();

    public HasCellSelectedHandler getCellSelectedHandler();

    public void setEntries(List<Item> createItemList);

    public void setSelectedIndex(int index, boolean selected);
}

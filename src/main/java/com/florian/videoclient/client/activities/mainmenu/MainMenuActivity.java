package com.florian.videoclient.client.activities.mainmenu;

import com.florian.videoclient.client.ClientFactory;
import com.florian.videoclient.client.activities.about.AboutPlace;
import com.florian.videoclient.client.activities.mainmenu.MainMenuItemSelectedEvent.MainMenuEntry;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.event.shared.EventBus;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;
import com.googlecode.mgwt.ui.client.widget.list.celllist.CellSelectedEvent;
import com.googlecode.mgwt.ui.client.widget.list.celllist.CellSelectedHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by florian on 22.08.14.
 */
public class MainMenuActivity extends MGWTAbstractActivity {

    private final ClientFactory clientFactory;

    public MainMenuActivity(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    private int oldIndex;
    private List<Item> itemList;
    @Override
    public void start(AcceptsOneWidget panel, final EventBus eventBus) {
        final MainMenuView view = clientFactory.getHomeView();
        view.setTitle("videoclient");

        itemList = createEntryList();
        view.setEntries(itemList);

//        addHandlerRegistration(view.getBackButton().addTapHandler(new TapHandler() {
//
//            @Override
//            public void onTap(TapEvent event) {
//                ActionEvent.fire(eventBus, ActionNames.BACK);
//            }
//        }));
//        items = createItems();
//        view.renderItems(items);

        addHandlerRegistration(view.getCellSelectedHandler().addCellSelectedHandler(
                new CellSelectedHandler() {

                    @Override
                    public void onCellSelected(CellSelectedEvent event) {


                        int index = event.getIndex();
                        view.setSelectedIndex(oldIndex, false);
                        view.setSelectedIndex(index, true);
                        oldIndex = index;
                        MainMenuItemSelectedEvent.fire(eventBus, itemList.get(index).getEntry());
//                        if (index == 0) {
////                            clientFactory.getPlaceController().goTo(new VideoListPlace());
//                            return;
//                        }
//                        if (index == 1) {
////                            clientFactory.getPlaceController().goTo(new CreateVideoPlace());
//
//                            return;
//                        }

                    }
                }));

        addHandlerRegistration(view.getAboutButton().addTapHandler(new TapHandler() {

            @Override
            public void onTap(TapEvent event) {
                clientFactory.getPlaceController().goTo(new AboutPlace());

            }
        }));

        panel.setWidget(view);
    }

    private List<Item> createEntryList() {
        ArrayList<Item> list = new ArrayList<Item>();
        list.add(new Item("All Videos", MainMenuEntry.ALL));
        list.add(new Item("Create Video", MainMenuEntry.CREATE));

        return list;
    }
}

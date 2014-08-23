package com.florian.videoclient.client.activities.mainmenu;

import com.florian.videoclient.client.BasicCell;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.tap.HasTapHandlers;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.widget.button.image.AboutImageButton;
import com.googlecode.mgwt.ui.client.widget.header.HeaderPanel;
import com.googlecode.mgwt.ui.client.widget.header.HeaderTitle;
import com.googlecode.mgwt.ui.client.widget.list.celllist.CellList;
import com.googlecode.mgwt.ui.client.widget.list.celllist.HasCellSelectedHandler;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FixedSpacer;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexSpacer;
import com.googlecode.mgwt.ui.client.widget.panel.flex.RootFlexPanel;
import com.googlecode.mgwt.ui.client.widget.panel.scroll.ScrollPanel;

import java.util.List;

/**
 * Created by florian on 22.08.14.
 */
public class MainMenuViewGwtImpl implements MainMenuView {

    private RootFlexPanel main;
    private AboutImageButton aboutButton;
    private HeaderPanel headerPanel;
    private CellList<Item> cellList;
    private HeaderTitle headerPanelTitle = new HeaderTitle();

    public MainMenuViewGwtImpl() {
        main = new RootFlexPanel();
        headerPanel = new HeaderPanel();

        headerPanel.add(new FixedSpacer());
        headerPanel.add(new FlexSpacer());
        headerPanel.add(headerPanelTitle);
        headerPanel.add(new FlexSpacer());

        aboutButton = new AboutImageButton();
        if (MGWT.getFormFactor().isPhone()) {
            headerPanel.add(aboutButton);
        } else {
            headerPanel.add(new FixedSpacer());
        }
        main.add(headerPanel);

        cellList = new CellList<Item>(new BasicCell<Item>() {

            @Override
            public String getDisplayString(Item model) {
                return model.getDisplayString();
            }

            @Override
            public boolean canBeSelected(Item model) {
                return true;
            }
        });


        FlowPanel container = new FlowPanel();
        container.add(cellList);


        ScrollPanel scrollPanel = new ScrollPanel();
        scrollPanel.setWidget(container);
        scrollPanel.setScrollingEnabledX(false);
        main.add(scrollPanel);

    }

    @Override
    public Widget asWidget() {
        return main;
    }

    @Override
    public void setTitle(String text) {
        headerPanelTitle.setText(text);
    }

    @Override
    public HasTapHandlers getAboutButton() {
        return aboutButton;
    }

    @Override
    public HasCellSelectedHandler getCellSelectedHandler() {
        return cellList;
    }

    @Override
    public void setEntries(List<Item> createItemList) {
        cellList.render(createItemList);
    }

    @Override
    public void setSelectedIndex(int index, boolean selected) {
        cellList.setSelectedIndex(index, selected);

    }
}

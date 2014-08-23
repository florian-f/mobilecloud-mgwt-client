package com.florian.videoclient.client.activities.createvideo;

import com.florian.videoclient.client.activities.DetailViewGwtImpl;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.widget.button.Button;
import com.googlecode.mgwt.ui.client.widget.form.Form;
import com.googlecode.mgwt.ui.client.widget.form.FormEntry;
import com.googlecode.mgwt.ui.client.widget.input.MNumberTextBox;
import com.googlecode.mgwt.ui.client.widget.input.MTextBox;
import com.googlecode.mgwt.ui.client.widget.panel.flex.RootFlexPanel;

/**
 * Created by florian on 22.08.14.
 */
public class CreateVideoViewGwtImpl extends DetailViewGwtImpl implements CreateVideoView {

//    private RootFlexPanel main;
//
//    public CreateVideoViewGwtImpl() {
//        main = new RootFlexPanel();
//    }
//
//    public Widget asWidget() {
//        return main;
//    }
    public CreateVideoViewGwtImpl() {


        FlowPanel container = new FlowPanel();

        Form widgetList = new Form();
        widgetList.setHeader(new Label("Enter Video MetaData"));

        // lets put in some widgets
        widgetList.add(new FormEntry("Title", new MTextBox()));
        widgetList.add(new FormEntry("Duration", new MNumberTextBox()));
        widgetList.add(new FormEntry("blah", new MTextBox()));

        Button uploadButton = new Button("upload");

        container.add(widgetList);
        container.add(uploadButton);

        scrollPanel.setScrollingEnabledX(false);
        scrollPanel.setWidget(container);
        // workaround for android formfields jumping around when using
        // -webkit-transform
        scrollPanel.setUsePos(MGWT.getOsDetection().isAndroid2x());
    }
}

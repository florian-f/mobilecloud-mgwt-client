package com.florian.videoclient.client.activities.createvideo;

import com.florian.videoclient.client.activities.DetailViewGwtImpl;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
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

    private MTextBox titleMTextBox;
    private MNumberTextBox durationMNumberTextBox;
    private MTextBox blah;

    private Button uploadButton;

    public CreateVideoViewGwtImpl() {


        FlowPanel container = new FlowPanel();

        Form widgetList = new Form();
        widgetList.setHeader(new Label("Enter Video MetaData"));

        titleMTextBox = new MTextBox();
        durationMNumberTextBox = new MNumberTextBox();
        blah = new MTextBox();
        // lets put in some widgets
        widgetList.add(new FormEntry("Title", titleMTextBox));
        widgetList.add(new FormEntry("Duration", durationMNumberTextBox));
        widgetList.add(new FormEntry("blah", blah));

        uploadButton = new Button("upload");

        container.add(widgetList);
        container.add(uploadButton);

        scrollPanel.setScrollingEnabledX(false);
        scrollPanel.setWidget(container);
        // workaround for android formfields jumping around when using
        // -webkit-transform
        scrollPanel.setUsePos(MGWT.getOsDetection().isAndroid2x());
    }

    @Override
    public MTextBox getTitleMTextBox() {
        return titleMTextBox;
    }

    @Override
    public MNumberTextBox getDurationMNumberTextBox() {
        return durationMNumberTextBox;
    }

    @Override
    public MTextBox getBlah() {
        return blah;
    }

    @Override
    public Button getUploadButton() {
        return uploadButton;
    }
}

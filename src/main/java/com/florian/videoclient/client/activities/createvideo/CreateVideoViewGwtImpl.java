package com.florian.videoclient.client.activities.createvideo;

import com.florian.videoclient.client.activities.DetailViewGwtImpl;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.widget.button.Button;
import com.googlecode.mgwt.ui.client.widget.form.Form;
import com.googlecode.mgwt.ui.client.widget.form.FormEntry;
import com.googlecode.mgwt.ui.client.widget.input.MNumberTextBox;
import com.googlecode.mgwt.ui.client.widget.input.MTextBox;

/**
 * Created by florian on 22.08.14.
 */
public class CreateVideoViewGwtImpl extends DetailViewGwtImpl implements CreateVideoView {

    private MTextBox titleMTextBox;
    private MNumberTextBox durationMNumberTextBox;
    private MTextBox url;

    private Button uploadButton;

    public CreateVideoViewGwtImpl() {

        FlowPanel container = new FlowPanel();

        Form widgetList = new Form();
        widgetList.setHeader(new Label("Enter Video MetaData"));

        titleMTextBox = new MTextBox();
        durationMNumberTextBox = new MNumberTextBox();
        url = new MTextBox();

        widgetList.add(new FormEntry("Title", titleMTextBox));
        widgetList.add(new FormEntry("Duration", durationMNumberTextBox));
        widgetList.add(new FormEntry("url", url));

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
    public MTextBox getUrl() {
        return url;
    }

    @Override
    public Button getUploadButton() {
        return uploadButton;
    }
}

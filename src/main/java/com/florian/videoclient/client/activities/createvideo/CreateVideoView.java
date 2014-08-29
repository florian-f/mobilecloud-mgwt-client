package com.florian.videoclient.client.activities.createvideo;

import com.florian.videoclient.client.activities.DetailView;
import com.google.gwt.user.client.ui.IsWidget;
import com.googlecode.mgwt.ui.client.widget.button.Button;
import com.googlecode.mgwt.ui.client.widget.input.MNumberTextBox;
import com.googlecode.mgwt.ui.client.widget.input.MTextBox;

/**
 * Created by florian on 22.08.14.
 */
public interface CreateVideoView extends DetailView {

    public MTextBox getTitleMTextBox();

    public MNumberTextBox getDurationMNumberTextBox();

    public MTextBox getUrl();

    public Button getUploadButton();
}

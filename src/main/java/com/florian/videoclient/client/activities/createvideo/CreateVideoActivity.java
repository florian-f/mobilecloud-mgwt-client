package com.florian.videoclient.client.activities.createvideo;

import com.florian.videoclient.client.ClientFactory;
import com.florian.videoclient.client.activities.DetailActivity;
import com.florian.videoclient.client.activities.videolist.Video;
import com.florian.videoclient.server.VideoSvcApi;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.http.client.*;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;
import com.googlecode.mgwt.ui.client.widget.button.Button;

/**
 * Created by florian on 22.08.14.
 */
public class CreateVideoActivity extends DetailActivity {

    private final String VIDEO_LIST_URL = VideoSvcApi.VIDEO_SERVICE_URL +  VideoSvcApi.VIDEO_SVC_PATH;
    private final RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, VIDEO_LIST_URL);

    private final ClientFactory clientFactory;

    public CreateVideoActivity(ClientFactory clientFactory) {
        super(clientFactory.getCreateVideoView(), "nav");
        this.clientFactory = clientFactory;
    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        super.start(panel, eventBus);
        final CreateVideoView view = clientFactory.getCreateVideoView();
        view.getHeader().setText("Create Video");

        addHandlerRegistration(view.getUploadButton().addTapHandler(new TapHandler() {
            @Override
            public void onTap(TapEvent tapEvent) {
                String title = view.getTitleMTextBox().getText();
                try{
                    Long duration = Long.parseLong(view.getDurationMNumberTextBox().getText());

                }catch (NumberFormatException e){
                    //
                }
                String blah = view.getBlah().getText();

//                JSONObject video = new JSONObject();
//                video.put("title", title);
                String req = "({\"id\":7,\"name\":\"testvideo\",\"url\":\"http://abc.com\",\"duration\":1234})";

//                UserAddJSO jso = (UserAddJSO)JavaScriptObject.createObject().cast();
                Video video = JavaScriptObject.createObject().cast();
                video.setDuration(200);
                video.setName("asdfkljsdfklj");
                video.setUrl("abc.com");

                try{
                    requestBuilder.setHeader("Content-Type", "application/json");
//                    requestBuilder.setRequestData(req);

                    Request request = requestBuilder.sendRequest(new JSONObject(video).toString(), new RequestCallback() {
                        public void onError(Request request, Throwable exception) {
                            // handle error
//                    videoItemList.add(new VideoItem("oh noes ", 3L , counter++));
                        }
                        public void onResponseReceived(Request request, Response response) {
                            if (200 == response.getStatusCode()) {
//                                updateList(response);
                            } else {
                                // handle error
//                    videoItemList.add(new VideoItem("oh noes ", 3L , counter++));
                            }
                        }
                    });
                }catch (RequestException e){

                }
//                if(validateFormData()){
//                    upload();
//                    alertOk();
//                }
            }
        }));

        panel.setWidget(view);
    }

    private void upload() {

    }

    private void alertOk(){

    }
    private boolean validateFormData() {

        return true;
    }
}

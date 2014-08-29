package com.florian.videoclient.client.activities.videolist;

import com.florian.videoclient.client.ClientFactory;
import com.florian.videoclient.client.activities.DetailActivity;
import com.florian.videoclient.server.VideoSvcApi;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.http.client.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.ui.client.widget.panel.pull.PullArrowStandardHandler;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by florian on 22.08.14.
 */
public class VideoListActivity extends DetailActivity {

    private final String VIDEO_LIST_URL = VideoSvcApi.VIDEO_SERVICE_URL +  VideoSvcApi.VIDEO_SVC_PATH;
    private final RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, VIDEO_LIST_URL);

    private final ClientFactory clientFactory;
    private List<VideoItem> videoItemList = new LinkedList<VideoItem>();
    private List<String> ids = new LinkedList<String>();

    public VideoListActivity(ClientFactory clientFactory) {
        super(clientFactory.getVideoListView(), "nav");
        this.clientFactory = clientFactory;

        try{
            Request request = requestBuilder.sendRequest(null, new RequestCallback() {
                public void onError(Request request, Throwable exception) {
                    // handle error
                }
                public void onResponseReceived(Request request, Response response) {
                    if (200 == response.getStatusCode()) {
                          updateList(response);
                    } else {
                        // handle error
                    }
                }
            });
        }catch (RequestException e){

        }
    }

    private boolean failedHeader = false;

    private boolean failedFooter = false;


    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        super.start(panel, eventBus);

        final VideoListView display = clientFactory.getVideoListView();

        display.getHeader().setText("All Videos");

        display.getPullHeader().setHTML("pull down");

        PullArrowStandardHandler headerHandler = new PullArrowStandardHandler(display.getPullHeader(), display.getPullPanel());

        headerHandler.setErrorText("Error");
        headerHandler.setLoadingText("Loading");
        headerHandler.setNormalText("pull down");
        headerHandler.setPulledText("release to load");

        headerHandler.setPullActionHandler(new PullArrowStandardHandler.PullActionHandler() {

            @Override
            public void onPullAction(final AsyncCallback<Void> callback) {

                try{
                    Request request = requestBuilder.sendRequest(null, new RequestCallback() {
                        public void onError(Request request, Throwable exception) {
                            // handle error
                            callback.onFailure(null);
                        }
                        public void onResponseReceived(Request request, Response response) {
                            if (200 == response.getStatusCode()) {
                                updateList(response);
                                callback.onSuccess(null);
                            } else {
                                // handle error
                                callback.onFailure(null);
                            }
                        }
                    });
                }catch (RequestException e){

                }
            }
        });

        display.setHeaderPullHandler(headerHandler);

        display.render(videoItemList);

        panel.setWidget(display);
    }

    private void updateList(Response response)
    {
        VideoListView display = clientFactory.getVideoListView();

        JsArray<Video> videos = JsonUtils.<JsArray<Video>>safeEval(response.getText());

        for (int i = 0; i < videos.length(); i++) {
            Video v = videos.get(i);
            String id = v.getId();
            if (!ids.contains(id)) {
                VideoItem item = new VideoItem(v.getName() + ", (" + v.getDuration()+")", v.getDuration());
                videoItemList.add(0, item);
                ids.add(id);
            }
        }

        display.render(videoItemList);
        display.refresh();
    }

}

package com.florian.videoclient.client.activities.videolist;

import com.florian.videoclient.client.ClientFactory;
import com.florian.videoclient.client.activities.DetailActivity;
import com.florian.videoclient.server.VideoSvcApi;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.http.client.*;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.ui.client.widget.panel.pull.PullArrowStandardHandler;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by florian on 22.08.14.
 */
public class VideoListActivity extends DetailActivity {

    private final String VIDEO_LIST_URL = VideoSvcApi.VIDEO_SERVICE_URL +  VideoSvcApi.VIDEO_SVC_PATH;
    private final RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, VIDEO_LIST_URL);

    private final ClientFactory clientFactory;
    private int counter;
    private List<VideoItem> videoItemList = new LinkedList<VideoItem>();

    public VideoListActivity(ClientFactory clientFactory) {
        super(clientFactory.getVideoListView(), "nav");
        this.clientFactory = clientFactory;

        videoItemList.add(new VideoItem("no ", 1L , counter++));
        videoItemList.add(new VideoItem("videos ", 2L , counter++));
        videoItemList.add(new VideoItem("here ", 3L , counter++));

        try{
            Request request = requestBuilder.sendRequest(null, new RequestCallback() {
                public void onError(Request request, Throwable exception) {
                    // handle error
                    videoItemList.add(new VideoItem("oh noes ", 3L , counter++));
                }
                public void onResponseReceived(Request request, Response response) {
                    if (200 == response.getStatusCode()) {
                        videoItemList.add(new VideoItem("fick ja! ", 3L , counter++));
//                        updateTable(JsonUtils.<JsArray<StockData>>safeEval(response.getText()));
                    } else {
                        // handle error
                        videoItemList.add(new VideoItem("fick nein! , "+ response.getStatusCode(), 3L , counter++));
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

        display.getHeader().setText("Pulldown to Refresh");

        display.getHeader().setText("PullToRefresh");

        display.getPullHeader().setHTML("pull down");

        PullArrowStandardHandler headerHandler = new PullArrowStandardHandler(display.getPullHeader(), display.getPullPanel());

        headerHandler.setErrorText("Error");
        headerHandler.setLoadingText("Loading");
        headerHandler.setNormalText("pull down");
        headerHandler.setPulledText("release to load");
        headerHandler.setPullActionHandler(new PullArrowStandardHandler.PullActionHandler() {

            @Override
            public void onPullAction(final AsyncCallback<Void> callback) {
                new Timer() {

                    @Override
                    public void run() {

                        if (failedHeader) {
                            callback.onFailure(null);

                        } else {
                            for (int i = 0; i < 5; i++) {
                                videoItemList.add(videoItemList.size(), new VideoItem("generated VideoItem ",123L, counter++));
                            }
                            display.render(videoItemList);
                            display.refresh();

                            callback.onSuccess(null);

                        }
                        failedHeader = !failedHeader;

                    }
                }.schedule(1000);

            }
        });

        display.setHeaderPullHandler(headerHandler);

        display.render(videoItemList);

        panel.setWidget(display);
    }

}

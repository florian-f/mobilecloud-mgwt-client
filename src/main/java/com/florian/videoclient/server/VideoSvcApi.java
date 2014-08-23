package com.florian.videoclient.server;

/**
 * Created by florian on 23.08.14.
 */

public interface VideoSvcApi {

    public static final String VIDEO_SERVICE_URL = "http://127.0.0.1:8080";

    public static final String TITLE_PARAMETER = "title";

    public static final String DURATION_PARAMETER = "duration";

    // The path where we expect the VideoSvc to live
    public static final String VIDEO_SVC_PATH = "/video";

    // The path to search videos by title
    public static final String VIDEO_TITLE_SEARCH_PATH = VIDEO_SVC_PATH + "/search/findByName";

    // The path to search videos by title
    public static final String VIDEO_DURATION_SEARCH_PATH = VIDEO_SVC_PATH + "/search/findByDurationLessThan";

//    @GET(VIDEO_SVC_PATH)
//    public Collection<Video> getVideoList();
//
//    @POST(VIDEO_SVC_PATH)
//    public Void addVideo(@Body Video v);
//
//    @GET(VIDEO_TITLE_SEARCH_PATH)
//    public Collection<Video> findByTitle(@Query(TITLE_PARAMETER) String title);
//
//    @GET(VIDEO_DURATION_SEARCH_PATH)
//    public Collection<Video> findByDurationLessThan(@Query(DURATION_PARAMETER) String title);

}
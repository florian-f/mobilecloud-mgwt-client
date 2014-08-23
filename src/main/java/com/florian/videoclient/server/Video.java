package com.florian.videoclient.server;

public class Video {

    private long id;

    private String name;
    private String url;
    private long duration;

    public Video() {
    }

    public Video(String name, String url, long duration) {
        super();
        this.name = name;
        this.url = url;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

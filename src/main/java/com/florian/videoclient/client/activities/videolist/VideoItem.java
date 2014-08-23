package com.florian.videoclient.client.activities.videolist;

/**
 * Created by florian on 23.08.14.
 */
public class VideoItem {

    private String name;
    private long duration;
    private int count;

    public VideoItem(String name, long duration, int count) {
        this.name = name;
        this.duration = duration;
        this.count = count;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
}

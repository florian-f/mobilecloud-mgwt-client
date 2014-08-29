package com.florian.videoclient.client.activities.videolist;

/**
 * Created by florian on 23.08.14.
 */
public class VideoItem {

    private String name;
    private int duration;
    private long id;

    public VideoItem(String name, int duration) {
        this.name = name;
        this.duration = duration;
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

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

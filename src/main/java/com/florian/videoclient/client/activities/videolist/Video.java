package com.florian.videoclient.client.activities.videolist;

import com.google.gwt.core.client.JavaScriptObject;

public class Video extends JavaScriptObject {

    protected Video(){}

    public final native String getId() /*-{ return this.id; }-*/;
    public final native String getName() /*-{ return this.name; }-*/;
    public final native String getUrl() /*-{ return this.url; }-*/;
    public final native Long getDuration() /*-{ return this.duration; }-*/;

    public final native void setName(String name) /*-{this.name = name; }-*/;
    public final native void setUrl(String url) /*-{this.url = url; }-*/;
    public final native void setDuration(Integer duration) /*-{this.duration = duration; }-*/;
}

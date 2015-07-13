package com.example.dtluc.llistview;

/**
 * Created by DTLuc on 2015/7/12.
 */
public class ItemBean {
    private String time;
    private int StyleResid,ImageResid;
    private String Contents;

    public ItemBean(String time, int styleResid, int imageResid, String contents) {
        this.time = time;
        StyleResid = styleResid;
        ImageResid = imageResid;
        Contents = contents;
    }

    public String getTime() {
        return time;
    }

    public int getStyleResid() {
        return StyleResid;
    }

    public int getImageResid() {
        return ImageResid;
    }

    public String getContents() {
        return Contents;
    }
}

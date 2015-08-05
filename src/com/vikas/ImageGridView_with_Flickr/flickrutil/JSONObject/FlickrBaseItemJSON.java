package com.vikas.ImageGridView_with_Flickr.flickrutil.JSONObject;

import java.io.Serializable;

/**
 * 
 * @author Vkas Rastogi
 * @createdDate Aug 5, 2015
 *
 */
public class FlickrBaseItemJSON implements Serializable {
    private String stat;

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }
}

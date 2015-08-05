package com.vikas.ImageGridView_with_Flickr.flickrutil;

/**
 * 
 * @author Vkas Rastogi
 * @createdDate Aug 5, 2015
 *
 */
public class FlickrBaseItem {
    protected String api_key;
    protected String format;

    public FlickrBaseItem() {
        api_key = null;
        format = null;
    }

    public FlickrBaseItem(String api_key, String format) {
        this.api_key = api_key;
        this.format = format;
    }
}

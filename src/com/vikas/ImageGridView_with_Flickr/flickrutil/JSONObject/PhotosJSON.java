package com.vikas.ImageGridView_with_Flickr.flickrutil.JSONObject;

import com.vikas.ImageGridView_with_Flickr.flickrutil.Sizes;

/**
 * 
 * @author Vkas Rastogi
 * @createdDate Aug 5, 2015
 *
 */
public class PhotosJSON extends FlickrBaseItemJSON {
    public Sizes getSizes() {
        return sizes;
    }

    public void setSizes(Sizes sizes) {
        this.sizes = sizes;
    }

    private Sizes sizes;
}

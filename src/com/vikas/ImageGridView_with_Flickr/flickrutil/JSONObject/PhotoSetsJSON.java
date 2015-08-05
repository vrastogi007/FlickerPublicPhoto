package com.vikas.ImageGridView_with_Flickr.flickrutil.JSONObject;

import com.vikas.ImageGridView_with_Flickr.flickrutil.FlickrBaseItem;
import com.vikas.ImageGridView_with_Flickr.flickrutil.PhotoSet;

/**
 * 
 * @author Vkas Rastogi
 * @createdDate Aug 5, 2015
 *
 */
public class PhotoSetsJSON extends FlickrBaseItemJSON {
    public PhotoSet getPhotoset() {
        return photoset;
    }

    public void setPhotoset(PhotoSet photoset) {
        this.photoset = photoset;
    }

    private PhotoSet photoset;


}

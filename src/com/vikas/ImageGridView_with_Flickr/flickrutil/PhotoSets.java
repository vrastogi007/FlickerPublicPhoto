package com.vikas.ImageGridView_with_Flickr.flickrutil;

import com.hintdesk.core.utils.JSONHttpClient;
import com.vikas.ImageGridView_with_Flickr.flickrutil.JSONObject.PhotoSetsJSON;

import org.apache.http.NameValuePair;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Vkas Rastogi
 * @createdDate Aug 5, 2015
 *
 */
public class PhotoSets extends FlickrBaseItem {

    public PhotoSets(String api_key, String format) {
        super(api_key, format);

    }

    public List<Photo> getPhotos(String photoset_id) {
        JSONHttpClient jsonHttpClient = new JSONHttpClient();
        String url = String.format(FlickrUrls.flickr_photosets_getPhotos, format, api_key, photoset_id);
        PhotoSetsJSON photoSetJson = jsonHttpClient.Get(url, new ArrayList<NameValuePair>(), PhotoSetsJSON.class);
        return photoSetJson.getPhotoset().getPhoto();
    }
}

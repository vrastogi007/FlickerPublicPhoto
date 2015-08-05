package com.vikas.ImageGridView_with_Flickr.vo;

import android.graphics.Bitmap;

/**
 * 
 * @author Vkas Rastogi
 * @createdDate Aug 5, 2015
 *
 */
public class ImageInfo {

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public ImageInfo(String name, Bitmap bitmap, Bitmap mediumBitmap) {
        this.name = name;
        this.thumbnailBitmap = bitmap;
        this.mediumBitmap = mediumBitmap;
    }

    private String mediumUrl;


    private Bitmap thumbnailBitmap;

    public Bitmap getThumbnailBitmap() {
        return thumbnailBitmap;
    }

    public void setThumbnailBitmap(Bitmap thumbnailBitmap) {
        this.thumbnailBitmap = thumbnailBitmap;
    }

    public String getName() {
        return name;
    }

    public Bitmap getMediumBitmap() {
        return mediumBitmap;
    }

    public void setMediumBitmap(Bitmap mediumBitmap) {
        this.mediumBitmap = mediumBitmap;
    }

    private Bitmap mediumBitmap;

}

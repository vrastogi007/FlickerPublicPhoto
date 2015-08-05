package com.vikas.ImageGridView_with_Flickr.interfaces;

import android.graphics.Bitmap;
import com.google.inject.Singleton;
import com.vikas.ImageGridView_with_Flickr.vo.ImageInfo;

import java.util.List;

/**
 * 
 * @author Vkas Rastogi
 * @createdDate Aug 5, 2015
 *
 */
public interface ICurrentAppData {
    List<ImageInfo> getImageInfos();

    void setImageInfos(List<ImageInfo> imageInfos);

    int getCurrentPosition();

    void setCurrentPosition(int currentPosition);
}

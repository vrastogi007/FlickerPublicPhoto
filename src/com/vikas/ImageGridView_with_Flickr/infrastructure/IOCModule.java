package com.vikas.ImageGridView_with_Flickr.infrastructure;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.vikas.ImageGridView_with_Flickr.implementations.CurrentAppData;
import com.vikas.ImageGridView_with_Flickr.interfaces.ICurrentAppData;

/**
 * 
 * @author Vkas Rastogi
 * @createdDate Aug 5, 2015
 *
 */
public class IOCModule implements Module {
    @Override
    public void configure(Binder binder) {
        binder.bind(ICurrentAppData.class).to(CurrentAppData.class);
    }
}

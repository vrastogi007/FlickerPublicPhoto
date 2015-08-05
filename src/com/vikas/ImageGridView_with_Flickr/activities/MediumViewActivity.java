package com.vikas.ImageGridView_with_Flickr.activities;

import javax.inject.Inject;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.vikas.ImageGridView_with_Flickr.R;
import com.vikas.ImageGridView_with_Flickr.adapters.MediumViewAdapter;
import com.vikas.ImageGridView_with_Flickr.interfaces.ICurrentAppData;

/**
 * 
 * @author Vkas Rastogi
 * @createdDate Aug 5, 2015
 *
 */
public class MediumViewActivity extends RoboActivity {
    @InjectView(R.id.pager)
    private ViewPager viewPager;
    @Inject
    ICurrentAppData currentAppData;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium_view);

        MediumViewAdapter mediumViewAdapter = new MediumViewAdapter(MediumViewActivity.this);
        viewPager.setAdapter(mediumViewAdapter);
        viewPager.setCurrentItem(currentAppData.getCurrentPosition());
    }
}
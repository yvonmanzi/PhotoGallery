package com.example.photogallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PhotoGalleryActivity extends SingleFragmentActivity {

    @Override
    protected PhotoGalleryFragment createFragment(){
        return PhotoGalleryFragment.newInstance();
    }

}

package com.cindiemarren.wine_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import com.github.chrisbanes.photoview.PhotoView;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        PhotoView photoView = (PhotoView)findViewById(R.id.photo_view);
        photoView.setImageResource(R.drawable.breck_map);
    }
}


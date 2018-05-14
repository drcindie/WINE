package com.cindiemarren.wine_app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        //Set Event
        setSingleEvent(mainGrid);
    }


    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for(int i = 0; i < mainGrid.getChildCount(); i++)
        {
            //You can see, all child item is CardView, so we just cast object to CardView
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (finalI == 0) //open Wine activity
                    {
                        Intent intent = new Intent(MainActivity.this, WineActivity.class);
                        startActivity(intent);

                    } else if (finalI == 1) //open tickets activity
                    {
                        Intent intent = new Intent(MainActivity.this, TicketsActivity.class);
                        startActivity(intent);


                    } else if (finalI == 2) //open Events activity
                    {
                        Intent intent = new Intent(MainActivity.this, EventsActivity.class);
                        startActivity(intent);
                    } else if (finalI == 3) //open Map activity
                    {








                        Intent intent = new Intent(MainActivity.this, MapActivity.class);
                        startActivity(intent);
                    } else if (finalI == 4) //open Favorites activity
                    {
                        Intent intent = new Intent(MainActivity.this, FavoritesActivity.class);
                        startActivity(intent);
                    } else if (finalI == 5) //open FAQ activity
                    {
                        Intent intent = new Intent(MainActivity.this, FaqActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "Please set activity for this card item ", Toast.LENGTH_SHORT).show();

                    }
                }

            });
        }

    }
}


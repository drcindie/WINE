package com.cindiemarren.wine_app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.TextView;
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

                    if (finalI == 0) //open Wine Scanner activity
                    {
                        Intent intent = new Intent(MainActivity.this, QRscanner.class);
                        startActivity(intent);
                        //WineActivity.class

                    } else if (finalI == 1) //open tickets activity
                    {


                        TextView mapBtn = (TextView)findViewById(R.id.ticketsBtn);
                        mapBtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                String ticketURL = "http://www.yahoo.com";

                                Uri webaddress = Uri.parse(ticketURL);

                                Intent gotoTicket = new Intent(Intent.ACTION_VIEW, webaddress);

                                if (gotoTicket.resolveActivity(getPackageManager()) !=null) {
                                    startActivity(gotoTicket);
                                }

                            }
                        });
                        //Intent intent = new Intent(MainActivity.this, TicketsActivity.class);
                        //startActivity(intent);


                    } else if (finalI == 2) //open Events activity
                    {
                        Intent intent = new Intent(MainActivity.this, EventsActivity.class);
                        startActivity(intent);

                    } else if (finalI == 3) //open Map activity
                    {

                        TextView mapBtn = (TextView)findViewById(R.id.mapBtn);
                        mapBtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                String google = "http://www.google.com";
                                Uri webaddress = Uri.parse(google);
                                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                                if (gotoGoogle.resolveActivity(getPackageManager()) !=null) {
                                    startActivity(gotoGoogle);
                                }

                            }
                        });



                        //Intent intent = new Intent(MainActivity.this, MapActivity.class);
                        //startActivity(intent);
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


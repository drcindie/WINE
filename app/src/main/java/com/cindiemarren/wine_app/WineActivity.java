package com.cindiemarren.wine_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class WineActivity extends AppCompatActivity {

    GridLayout wineGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wine);

        //// end here
                wineGrid = (GridLayout) findViewById(R.id.wineGrid);

                //Set Event
                setSingleEvent(wineGrid);
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

                            if (finalI == 0) //open White activity
                            {
                                Intent intent = new Intent(com.cindiemarren.wine_app.WineActivity.this, WhiteActivity.class);
                                startActivity(intent);

                            } else if (finalI == 1) //open red activity
                            {
                                Intent intent = new Intent(com.cindiemarren.wine_app.WineActivity.this, RedActivity.class);
                                startActivity(intent);

                            } else if (finalI == 2) //open sparkling activity
                            {
                                Intent intent = new Intent(com.cindiemarren.wine_app.WineActivity.this, OtherListActivity.class);
                                startActivity(intent);
                            } else if (finalI == 3) //open other activity
                            {
                                Intent intent = new Intent(com.cindiemarren.wine_app.WineActivity.this, QRscanner.class);
                                startActivity(intent);
                            }

                              else {
                                Toast.makeText(com.cindiemarren.wine_app.WineActivity.this, "Please set activity for this card item ", Toast.LENGTH_SHORT).show();

                            }
                        }

                    });
                }


            }
}

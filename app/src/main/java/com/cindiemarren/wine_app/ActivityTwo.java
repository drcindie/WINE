package com.cindiemarren.wine_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);


        //now when button activityTwoBtn is pressed, it will go to yahoo.com------------
        TextView activityTwoBtn = (TextView)findViewById(R.id.activityTwoBtn);
        activityTwoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String google = "http://www.yahoo.com";

                Uri webaddress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);

                if (gotoGoogle.resolveActivity(getPackageManager()) !=null) {
                    startActivity(gotoGoogle);
                }

            }
        });
        //end of onclick button here---------------









    }
}

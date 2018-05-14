package com.cindiemarren.wine_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TicketsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tickets);


        TextView ticketsBtn = (TextView)findViewById(R.id.ticketsBtn);
        ticketsBtn.setOnClickListener(new View.OnClickListener() {
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

    }
}
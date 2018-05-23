package com.cindiemarren.wine_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class WhiteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_white);

        try {
            readWineData();
        } catch (IOException e) {
            Log.wtf("WhiteActivity", "error reading data file on line ", e);
            e.printStackTrace();
        }
    }
    private List<WineSample> wineSamples = new ArrayList<>();
    private void readWineData() throws IOException {

        // GETTING DATA FROM CSV FILE HERE
        InputStream is = getResources().openRawResource(R.raw.white_wine_data);
           //possibly able to change variable "reader"?
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );
        String line = "";
        //step over headers
        reader.readLine();


        while ( (line = reader.readLine()) != null) {
            Log.d("WhiteActivity", "Line " + line);
            // split by ','
            String[] tokens = line.split(",");

            //Read the data
            //if need to update data csv file:
            //open csv in numbers, view with ";"
            //copy/paste into RAW file
            WineSample sample = new WineSample();
            sample.setYear(Integer.parseInt(tokens[0]));
            // if there is no data in INT Year field
            if (tokens[0].length() > 0) {
                sample.setYear(Integer.parseInt(tokens[0]));
            } else {
                sample.setYear(0);
            }
            sample.setProducer(tokens[1]);
            // if there is no data in Prod field
            if (tokens[1].length() > 0) {
                sample.setProducer(tokens[1]);
            } else {
                sample.setProducer("");
            }
            sample.setVariety(tokens[2]);
            // if there is no data in Var field
            if (tokens[1].length() > 0) {
                sample.setVariety(tokens[2]);
            } else {
                sample.setVariety("");
            }
            sample.setProvince(tokens[3]);
            // if there is no data in Prov field
            if (tokens[1].length() > 0) {
                sample.setProvince(tokens[3]);
            } else {
                sample.setProvince("");
            }
            sample.setRegion(tokens[4]);
            // if there is no data in Reg field
            if (tokens[1].length() > 0) {
                sample.setProducer(tokens[1]);
            } else {
                sample.setProducer("");
            }
            sample.setDesignation(tokens[5]);
            // if there is no data in Des field
            if (tokens[5].length() > 0) {
                sample.setDesignation(tokens[5]);
            } else {
                sample.setDesignation("");
            }
            wineSamples.add(sample);

            Log.d("WhiteActivity", "Just Created: " + sample);

        }

    }
}

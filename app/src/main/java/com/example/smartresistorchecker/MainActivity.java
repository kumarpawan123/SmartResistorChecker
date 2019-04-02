package com.example.smartresistorchecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
    Button black, brown, orange, red, yellow, green, blue, violet, grey, white, gold, silver, none;
    TextView tv, band1, band2, band3, band4, band5, result;
    Button b;
    float a;
    private double v1, v2, v3, v4, v5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        black = (Button) findViewById(R.id.black);
        brown = (Button) findViewById(R.id.brown);
        orange = (Button) findViewById(R.id.orange);
        red = (Button) findViewById(R.id.red);
        yellow = (Button) findViewById(R.id.yellow);
        green = (Button) findViewById(R.id.green);
        blue = (Button) findViewById(R.id.blue);
        violet = (Button) findViewById(R.id.violet);
        grey = (Button) findViewById(R.id.grey);
        white = (Button) findViewById(R.id.white);
        gold = (Button) findViewById(R.id.gold);
        silver = (Button) findViewById(R.id.silver);


        band1 = (TextView) findViewById(R.id.band1);
        band2 = (TextView) findViewById(R.id.band2);
        band3 = (TextView) findViewById(R.id.band3);
        band4 = (TextView) findViewById(R.id.band4);
        band5 = (TextView) findViewById(R.id.band5);
        result = (TextView) findViewById(R.id.result);

        b=(Button)findViewById(R.id.Value);


        band1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              tv=band1;
              Toast.makeText(getApplicationContext(),
                      "Select First Band Colour",Toast.LENGTH_SHORT).show();



            }
        });

        band2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv=band2;
                Toast.makeText(getApplicationContext(),
                        "Select Second Band Colour",Toast.LENGTH_SHORT).show();


            }
        });

        band3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv=band3;
                Toast.makeText(getApplicationContext(),
                        "Select Third Band Colour",Toast.LENGTH_SHORT).show();


            }
        });

        band4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv=band4;
                Toast.makeText(getApplicationContext(),
                        "Select Fourth Band Colour",Toast.LENGTH_SHORT).show();


            }


        });

        band5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv=band5;
                Toast.makeText(getApplicationContext(),
                        "Select Fifth Band Colour",Toast.LENGTH_SHORT).show();


            }
        });

        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv.setText("Black");
                int value = 0;
                if (tv == band1){
                    v1 = value;
                } else if (tv == band2){
                    v2 = value;
                } else if (tv == band3){
                    v3 = value;
                } else if (tv == band4){
                    v4 = (int) Math.pow(10,value);
                } else if (tv == band5){
                    v5 = 0;
                } else {
                    Toast.makeText(MainActivity.this, "Select a band first", Toast.LENGTH_SHORT).show();
                }

            }

        });

        brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv.setText("Brown");

                int value = 1;
                if (tv == band1){
                    v1 = value;
                } else if (tv == band2){
                    v2 = value;
                } else if (tv == band3){
                    v3 = value;
                } else if (tv == band4){
                    v4 = (int) Math.pow(10,value);
                } else if (tv == band5){
                    v5 = 1;
                } else {
                    Toast.makeText(MainActivity.this, "Select a band first", Toast.LENGTH_SHORT).show();
                }

            }

        });

        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv.setText("Orange");

                int value = 3;
                if (tv == band1){
                    v1 = value;
                } else if (tv == band2){
                    v2 = value;
                } else if (tv == band3){
                    v3 = value;
                } else if (tv == band4){
                    v4 = (int) Math.pow(10,value);
                } else if (tv == band5){
                    v5 = 0;
                } else {
                    Toast.makeText(MainActivity.this, "Select a band first", Toast.LENGTH_SHORT).show();
                }

            }

        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv.setText("Red");

                int value = 2;
                if (tv == band1){
                    v1 = value;
                } else if (tv == band2){
                    v2 = value;
                } else if (tv == band3){
                    v3 = value;
                } else if (tv == band4){
                    v4 = (int) Math.pow(10,value);
                } else if (tv == band5){
                    v5 = 2;
                } else {
                    Toast.makeText(MainActivity.this, "Select a band first", Toast.LENGTH_SHORT).show();
                }

            }

        });

        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv.setText("Yellow");

                int value = 4;
                if (tv == band1){
                    v1 = value;
                } else if (tv == band2){
                    v2 = value;
                } else if (tv == band3){
                    v3 = value;
                } else if (tv == band4){
                    v4 = (int) Math.pow(10,value);
                } else if (tv == band5){
                    v5 = 0;
                } else {
                    Toast.makeText(MainActivity.this, "Select a band first", Toast.LENGTH_SHORT).show();
                }

            }

        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv.setText("Green");

                int value = 5;
                if (tv == band1){
                    v1 = value;
                } else if (tv == band2){
                    v2 = value;
                } else if (tv == band3){
                    v3 = value;
                } else if (tv == band4){
                    v4 = (int) Math.pow(10,value);
                } else if (tv == band5){
                    v5 = 0.5;
                } else {
                    Toast.makeText(MainActivity.this, "Select a band first", Toast.LENGTH_SHORT).show();
                }

            }

        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv.setText("Blue");

                int value = 6;
                if (tv == band1){
                    v1 = value;
                } else if (tv == band2){
                    v2 = value;
                } else if (tv == band3){
                    v3 = value;
                } else if (tv == band4){
                    v4 = (int) Math.pow(10,value);
                } else if (tv == band5){
                    v5 = 0.25;
                } else {
                    Toast.makeText(MainActivity.this, "Select a band first", Toast.LENGTH_SHORT).show();
                }

            }

        });
        violet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv.setText("Voilet");

                int value = 0;
                if (tv == band1){
                    v1 = value;
                } else if (tv == band2){
                    v2 = value;
                } else if (tv == band3){
                    v3 = value;
                } else if (tv == band4){
                    v4 = (int) Math.pow(10,value);
                } else if (tv == band5){
                    v5 = 0.10;
                } else {
                    Toast.makeText(MainActivity.this, "Select a band first", Toast.LENGTH_SHORT).show();
                }

            }

        });

        grey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv.setText("Grey");

                int value = 8;
                if (tv == band1){
                    v1 = value;
                } else if (tv == band2){
                    v2 = value;
                } else if (tv == band3){
                    v3 = value;
                } else if (tv == band4){
                    v4 = (int) Math.pow(10,value);
                } else if (tv == band5){
                    v5 = 0.05;
                } else {
                    Toast.makeText(MainActivity.this, "Select a band first", Toast.LENGTH_SHORT).show();
                }

            }

        });

        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv.setText("White");

                int value = 9;
                if (tv == band1){
                    v1 = value;
                } else if (tv == band2){
                    v2 = value;
                } else if (tv == band3){
                    v3 = value;
                } else if (tv == band4){
                    v4 = (int) Math.pow(10,value);
                } else if (tv == band5){
                    v5 = 0;
                } else {
                    Toast.makeText(MainActivity.this, "Select a band first", Toast.LENGTH_SHORT).show();
                }

            }

        });
        gold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv.setText("Gold");

                double value = 0.1;

                if (tv == band1){
                    Toast.makeText(MainActivity.this, "Wrong! Choose Correct Colour", Toast.LENGTH_SHORT).show();
                } else if (tv == band2){
                    Toast.makeText(MainActivity.this, "Wrong! Choose Correct Colour", Toast.LENGTH_SHORT).show();
                } else if (tv == band3){
                    Toast.makeText(MainActivity.this, "Wrong! Choose Correct Colour", Toast.LENGTH_SHORT).show();
                } else if (tv == band4){
                    v4 = value;
                } else if (tv == band5){
                    v5 = 5;
                } else {
                    Toast.makeText(MainActivity.this, "Select a band first", Toast.LENGTH_SHORT).show();
                }

            }

        });
        silver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv.setText("Silver");

                double value = 0.01;
                if (tv == band1){
                    Toast.makeText(MainActivity.this, "Wrong! Choose Correct Colour", Toast.LENGTH_SHORT).show();

                } else if (tv == band2){
                    Toast.makeText(MainActivity.this, "Wrong! Choose Correct Colour", Toast.LENGTH_SHORT).show();
                } else if (tv == band3){
                    Toast.makeText(MainActivity.this, "Wrong! Choose Correct Colour", Toast.LENGTH_SHORT).show();
                } else if (tv == band4){
                    v4 = value;
                } else if (tv == band5){
                    v5 = 10;
                } else {
                    Toast.makeText(MainActivity.this, "Select a band first", Toast.LENGTH_SHORT).show();
                }

            }

        });

    }

    public void value(View view) {

        double res;

        res=(v1*100+v2*10+v3)*v4;

        result.setText(String.format("%s Ω ±%s%%", String.valueOf(res), String.valueOf(v5)));

    }
}
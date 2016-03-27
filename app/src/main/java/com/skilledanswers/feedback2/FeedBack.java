package com.skilledanswers.feedback2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RadioButton;

public class FeedBack extends AppCompatActivity {
    private RadioButton radioButton1Q1,radioButton2Q1,radioButton3Q1,radioButton4Q1;
    private RadioButton radioButton1Q2,radioButton2Q2,radioButton3Q2,radioButton4Q2;
    private RadioButton radioButton1Q3,radioButton2Q3,radioButton3Q3,radioButton4Q3;
    private RadioButton radioButton1Q4,radioButton2Q4,radioButton3Q4,radioButton4Q4;
    private RadioButton radioButton1Q5,radioButton2Q5,radioButton3Q5,radioButton4Q5;
    private RadioButton radioButton1Q6,radioButton2Q6,radioButton3Q6,radioButton4Q6;
    private RadioButton radioButton1Q7,radioButton2Q7,radioButton3Q7,radioButton4Q7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Fill the Below Form");
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //////////// q1
        radioButton1Q1 =(RadioButton) findViewById(R.id.q1RadioneverID);
        radioButton2Q1 =(RadioButton) findViewById(R.id.q1RadiosometimesID);
        radioButton3Q1 =(RadioButton) findViewById(R.id.q1RadiousualyID);
        radioButton4Q1 =(RadioButton) findViewById(R.id.q1RadioalwaysID);
        //////////////// q2
        radioButton1Q2 =(RadioButton) findViewById(R.id.q2RadioneverID);
        radioButton2Q2 =(RadioButton) findViewById(R.id.q2RadiosometimesID);
        radioButton3Q2 =(RadioButton) findViewById(R.id.q2RadiousualyID);
        radioButton4Q2 =(RadioButton) findViewById(R.id.q2RadioalwaysID);
        //////////////// q3
        radioButton1Q3 =(RadioButton) findViewById(R.id.q3RadioneverID);
        radioButton2Q3 =(RadioButton) findViewById(R.id.q3RadiosometimesID);
        radioButton3Q3 =(RadioButton) findViewById(R.id.q3RadiousualyID);
        radioButton4Q3 =(RadioButton) findViewById(R.id.qRadioalwaysID);
        ////////////// q4
        radioButton1Q4 =(RadioButton) findViewById(R.id.q4RadioneverID);
        radioButton2Q4 =(RadioButton) findViewById(R.id.q4RadiosometimesID);
        radioButton3Q4 =(RadioButton) findViewById(R.id.q4RadiousualyID);
        radioButton4Q4 =(RadioButton) findViewById(R.id.q4RadioalwaysID);
        ///////////// q5
        radioButton1Q5 =(RadioButton) findViewById(R.id.q5RadioneverID);
        radioButton2Q5 =(RadioButton) findViewById(R.id.q5RadiosometimesID);
        radioButton3Q5 =(RadioButton) findViewById(R.id.q5RadiousualyID);
        radioButton4Q5 =(RadioButton) findViewById(R.id.q5RadioalwaysID);
        ///////////// q6
        radioButton1Q6 =(RadioButton) findViewById(R.id.q6RadioneverID);
        radioButton2Q6 =(RadioButton) findViewById(R.id.q6RadiosometimesID);
        radioButton3Q6 =(RadioButton) findViewById(R.id.q6RadiousualyID);
        /////////////// final question q7
        radioButton1Q7 =(RadioButton) findViewById(R.id.excellentID);
        radioButton2Q7 =(RadioButton) findViewById(R.id.verygoodID);
        radioButton3Q7 =(RadioButton) findViewById(R.id.usuallyID);
        radioButton4Q7 =(RadioButton) findViewById(R.id.alwaysID);










    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            onBackPressed();

        }
        return super.onKeyDown(keyCode, event);

    }


    public void onBackPressed() {
        Intent myIntent = new Intent(FeedBack.this, MainActivity.class);
        myIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);// clear back stack
        startActivity(myIntent);
        finish();
        return;
    }
}


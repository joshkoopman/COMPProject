package com.example.jkoopman.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button lbutton = (Button) findViewById(R.id.launch_button);
        lbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, MathActivity.class);
                startActivity(myIntent);
            }
        });
        final Button cbutton = (Button) findViewById(R.id.checkScore_button);
        cbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, ScoreActivity.class);
                startActivity(myIntent);
            }
        });
    }
}

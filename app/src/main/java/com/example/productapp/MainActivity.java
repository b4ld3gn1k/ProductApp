package com.example.productapp;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static int countClick;
    private static int randomNumber;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomCount();

        TextView rndCount = findViewById(R.id.textView);
        rndCount.setText(Integer.toString(randomNumber));

        TextView startPlusCount = findViewById(R.id.textView2);
        startPlusCount.setText("0");
        
    }

    @SuppressLint("SetTextI18n")
    public void onClick(View view){
        TextView rndCount = findViewById(R.id.textView);
        TextView plusCount = findViewById(R.id.textView2);

        if (countClick == randomNumber){

            countClick = 0;

            rndCount.setText(Integer.toString(randomCount()));
            plusCount.setText("0");
        } else {
            plusCount.setText(Integer.toString(incrementCount()));
        }
    }

    private int incrementCount(){
        return ++countClick;
    }

    private int randomCount(){
        Random random = new Random();
        int max = 10;
        int min = 1;
        return randomNumber = random.nextInt(max - min + 1) + min;
    }

}
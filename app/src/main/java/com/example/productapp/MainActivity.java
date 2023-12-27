package com.example.productapp;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;

public class MainActivity extends AppCompatActivity{

    private Button breadButton;
    private TextView breadClickCount;
    private TextView breadCount;

    private Button milkButton;
    private TextView milkClickCount;
    private TextView milkCount;

    private Button eggsButton;
    private TextView eggsClickCounnt;
    private TextView eggsCount;

    private Button cheesButton;
    private TextView cheesClickCount;
    private TextView cheesCount;

    private Button sausageButton;
    private TextView sausageClickCount;
    private TextView sausageCount;

    static int clickBread = 0;
    static int clickMilk = 0;
    static int clickEggs = 0;
    static int clickChees = 0;
    static int clickSausage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        setValue();

        breadButton = findViewById(R.id.breadButton);
        milkButton = findViewById(R.id.milkButton);
        eggsButton = findViewById(R.id.eggsButton);
        cheesButton = findViewById(R.id.chessButton);
        sausageButton = findViewById(R.id.sausageButton);

    }

    @SuppressLint("SetTextI18n")
    public void onClick(View v) {
        if (v.getId() == breadButton.getId()){
            breadClickCount.setText(Integer.toString(++clickBread));
            countEqualsClick(breadCount, breadClickCount , breadButton);
        } else if (v.getId() == milkButton.getId()) {
            milkClickCount.setText(Integer.toString(++clickMilk));
            countEqualsClick(milkCount, milkClickCount , milkButton);
        }else if (v.getId() == eggsButton.getId()) {
            eggsClickCounnt.setText(Integer.toString(++clickEggs));
            countEqualsClick(eggsCount, eggsClickCounnt , eggsButton);
        }else if (v.getId() == cheesButton.getId()) {
            cheesClickCount.setText(Integer.toString(++clickChees));
            countEqualsClick(cheesCount, cheesClickCount , cheesButton);
        }else if (v.getId() == sausageButton.getId()) {
            sausageClickCount.setText(Integer.toString(++clickSausage));
            countEqualsClick(sausageCount, sausageClickCount , sausageButton);
        }
    }

    @SuppressLint("SetTextI18n")
    private void setValue() {
        breadCount = findViewById(R.id.breadCount);
        breadCount.setText(Integer.toString(randomCount()));
        breadClickCount = findViewById(R.id.breadClickCount);
        breadClickCount.setText("0");

        milkCount = findViewById(R.id.milkCount);
        milkCount.setText(Integer.toString(randomCount()));
        milkClickCount = findViewById(R.id.milkClickCount);
        milkClickCount.setText("0");

        eggsCount = findViewById(R.id.eggsCounnt);
        eggsCount.setText(Integer.toString(randomCount()));
        eggsClickCounnt = findViewById(R.id.eggsClickCount);
        eggsClickCounnt.setText("0");

        cheesCount = findViewById(R.id.cheesCount);
        cheesCount.setText(Integer.toString(randomCount()));
        cheesClickCount = findViewById(R.id.cheesClickCount);
        cheesClickCount.setText("0");

        sausageCount = findViewById(R.id.sausageCount);
        sausageCount.setText(Integer.toString(randomCount()));
        sausageClickCount = findViewById(R.id.sausageClickCount);
        sausageClickCount.setText("0");
    }

    private void countEqualsClick(TextView count, TextView click, Button button){
        if (count.getText().equals(click.getText())){
            button.setVisibility(View.GONE);
            count.setVisibility(View.GONE);
            click.setVisibility(View.GONE);
            Toast.makeText(MainActivity.this, "Нужное колличесво " + button.getText() + " куплено.", Toast.LENGTH_SHORT).show();
        }

    }

    private int randomCount() {
        Random random = new Random();
        int max = 10;
        int min = 1;
        return random.nextInt(max - min + 1) + min;
    }
}
package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView scoreA, scoreB;
    Button plusThreeA,plusThreeB,plusTwoA,plusTwoB,plusOneA,plusOneB,reset;
    int a,b,valA,valB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreA = findViewById(R.id.scoreA);
        scoreB = findViewById(R.id.scoreB);
        plusThreeA = findViewById(R.id.plusThreeA);
        plusThreeB = findViewById(R.id.plusThreeB);
        plusTwoA = findViewById(R.id.plusTwoA);
        plusTwoB = findViewById(R.id.plusTwoB);
        plusOneA = findViewById(R.id.plusOneA);
        plusOneB = findViewById(R.id.plusOneB);
        reset = findViewById(R.id.reset);
    }

    public void displayA(int score){
        scoreA.setText(String.valueOf(score));
    }

    public void displayB(int score){
        scoreB.setText(String.valueOf(score));
    }

    public void plusThreeA(View view) {
        a+=3;
        displayA(a);
    }

    public void plusThreeB(View view) {
        b+=3;
        displayB(b);
    }

    public void plusTwoA(View view) {
        a+=2;
        displayA(a);

    }

    public void plusTwoB(View view) {
        b+=2;
        displayB(b);
    }

    public void plusOneA(View view) {
        a+=1;
        displayA(a);
    }

    public void plusOneB(View view) {
        b+=1;
        displayB(b);
    }

    public void reset(View view) {
        a=0;
        b=0;
        displayA(a);
        displayB(b);
    }
}
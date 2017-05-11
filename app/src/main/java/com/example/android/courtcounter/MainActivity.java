package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0, teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display('a', teamAScore);
        display('b', teamBScore);
    }

    //display score on respective textView
    public void display(char team, int score) {
        TextView displayView;
        if (team == 'a') {
            displayView = (TextView) findViewById(R.id.teamAScore);

        } else {

            displayView = (TextView) findViewById(R.id.teamBScore);
        }
        displayView.setText("" + score);
    }

    public void resetScores(View view) {
        teamAScore = 0;
        teamBScore = 0;
        display('a', teamAScore);
        display('b', teamBScore);
        Toast.makeText(this, "Scores have been reset...Enjoy the game!", Toast.LENGTH_SHORT).show();
    }

    public void plusThree(View view) {
        if (view.getId() == R.id.teamAPlus3) {
            teamAScore += 3;
            display('a', teamAScore);
            Toast.makeText(this, "Hurray! +3 Points for Team A!", Toast.LENGTH_SHORT).show();
        } else {
            teamBScore += 3;
            Toast.makeText(this, "Hurray! +3 Points for Team B!", Toast.LENGTH_SHORT).show();
            display('b', teamBScore);

        }
    }

    public void plusTwo(View view) {
        if (view.getId() == R.id.teamAPlus2) {
            teamAScore += 2;
            display('a', teamAScore);
            Toast.makeText(this, "Hurray! +2 Points for Team A!", Toast.LENGTH_SHORT).show();
        } else {
            teamBScore += 2;
            Toast.makeText(this, "Hurray! +2 Points for Team B!", Toast.LENGTH_SHORT).show();
            display('b', teamBScore);

        }
    }

    public void plusOne(View view) {
        if (view.getId() == R.id.teamAPlus1) {
            teamAScore++;
            display('a', teamAScore);
            Toast.makeText(this, "Hurray! +1 Point for Team A!", Toast.LENGTH_SHORT).show();
        } else {
            teamBScore++;
            Toast.makeText(this, "Hurray! +1 Point for Team B!", Toast.LENGTH_SHORT).show();
            display('b', teamBScore);

        }
    }

}

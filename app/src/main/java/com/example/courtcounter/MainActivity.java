package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int newScore = 0;
    int newScoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
        displayReset(0);
        displayResetB(0);
    }

    public void showThree(View view){
        //newScore = 3;
        newScore = newScore + 3;
        displayForTeamA(newScore);
    }

    public void showTwo(View view){
        newScore = newScore + 2;
        displayForTeamA(newScore);
    }

    public void showOne(View view){
        newScore = newScore + 1;
        displayForTeamA(newScore);
    }


    public void showThreeB(View view){
        newScoreB = newScoreB + 3;
        displayForTeamB(newScoreB);
    }

    public void showTwoB(View view){
        newScoreB = newScoreB + 2;
        displayForTeamB(newScoreB);
    }

    public void showOneB(View view){
        newScoreB = newScoreB + 1;
        displayForTeamB(newScoreB);
    }

    public void reset(View view){
        int score = 0;
        newScore = 0;
        newScoreB = 0;
        displayReset(score);
        displayResetB(score);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display the score of Team B
     * @param score
     */

    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /***
     * Display for the Reset Button there
     */
    public void displayReset(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayResetB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}

package com.example.android.myscoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scorea = 0;
    int scoreb = 0;
    int shotsa = 0;
    int possea = 0;
    int cornea = 0;
    int ycarda = 0;

    int shotsb = 0;
    int posseb = 0;
    int corneb = 0;
    int ycardb = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void scoreda (View view) {
        scorea += 1;
        displayForTeamA(scorea);
    }

    public void scoredb (View view) {
        scoreb += 1;
        displayForTeamB(scoreb);
    }
    public void shotsForA (View view) {
        shotsa += 1;
        displayForShotA(shotsa);
    }

    public void possOfA (View view) {
        possea += 1;
        if (possea >= 0 || possea <= 100) {
            posseb = 100 - possea;
            displayForPossB(posseb);
            displayForPossA(possea);
        }
        else {
            posseb = 0;
            possea = 0;
            displayForPossA(possea);
            displayForPossB(posseb);
        }
    }
    public void cornOfA (View view) {
        cornea += 1;
        displayForCornA(cornea);
    }
    public void cardOfA (View view) {
        ycarda += 1;
        displayForCardA(ycarda);
    }

    public void shotsForB (View view) {
        shotsb += 1;
        displayForShotB(shotsb);
    }

    public void possOfB (View view) {
        posseb += 1;
        if (posseb >= 0 || posseb <= 100) {
            possea = 100 - posseb;
            displayForPossB(posseb);
            displayForPossA(possea);
        }
        else {
            posseb = 0;
            possea = 0;
            displayForPossA(possea);
            displayForPossB(posseb);
        }
    }
    public void cornOfB (View view) {
        corneb += 1;
        displayForCornB(corneb);
    }
    public void cardOfB (View view) {
        ycardb += 1;
        displayForCardB(ycardb);
    }
    public void reset (View view) {
        int scorea = 0;
        int scoreb = 0;
        int shotsa = 0;
        int possea = 0;
        int cornea = 0;
        int ycarda = 0;
        int shotsb = 0;
        int posseb = 0;
        int corneb = 0;
        int ycardb = 0;
        displayForTeamA(scorea);
        displayForTeamB(scoreb);
        displayForShotA(shotsa);
        displayForShotB(shotsb);
        displayForPossA(possea);
        displayForPossB(posseb);
        displayForCornA(cornea);
        displayForCornB(corneb);
        displayForCardA(ycarda);
        displayForCardB(ycardb);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForShotA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shota);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForPossA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.possa);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForCornA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.corna);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForCardA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.carda);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForShotB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shotb);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForPossB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.possb);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForCornB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cornb);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForCardB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cardb);
        scoreView.setText(String.valueOf(score));
    }
}

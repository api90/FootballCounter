package com.example.android.footballcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalLazio = 0;
    int goalRoma = 0;
    int ammonizioniLazio = 0;
    int ammonizioniRoma = 0;
    int tiriLazio = 0;
    int tiriRoma = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void goalLazio(View v) {
    goalLazio = goalLazio + 1;
    displayGoalLazio(goalLazio);
    }

    public void goalRoma(View v) {
    goalRoma = goalRoma + 1;
    displayGoalRoma(goalRoma);
    }

    public void ammonizioniLazio(View v) {
    ammonizioniLazio = ammonizioniLazio + 1;
    displayAmmonizioniLazio(ammonizioniLazio);
    }

    public void ammonizioniRoma(View v) {
    ammonizioniRoma = ammonizioniRoma + 1;
    displayAmmonizioniRoma(ammonizioniRoma);
    }

    public void tiriLazio(View v) {
    tiriLazio = tiriLazio + 1;
    displayTiriLazio(tiriLazio);
    }

    public void tiriRoma(View v) {
    tiriRoma = tiriRoma + 1;
    displayTiriRoma(tiriRoma);
    }

    /**
     * Reset all the scores.
     */
    public void reset(View v){
        goalLazio = 0;
        goalRoma = 0;
        ammonizioniLazio = 0;
        ammonizioniRoma = 0;
        tiriLazio = 0;
        tiriRoma = 0;
        displayGoalLazio(goalLazio);
        displayGoalRoma(goalRoma);
        displayAmmonizioniLazio(ammonizioniLazio);
        displayAmmonizioniRoma(ammonizioniRoma);
        displayTiriLazio(tiriLazio);
        displayTiriRoma(tiriRoma);
    }

    /**
     * Displays the given goal for Lazio.
     */
    public void displayGoalLazio(int score) {
        TextView scoreView = findViewById(R.id.lazio_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given goal for Roma.
     */
    public void displayGoalRoma(int score) {
        TextView scoreView = findViewById(R.id.roma_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given ammonizioni for Lazio.
     */
    public void displayAmmonizioniLazio(int score) {
        TextView scoreView = findViewById(R.id.ammonizioni_lazio);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given ammonizioni for Roma.
     */
    public void displayAmmonizioniRoma(int score) {
        TextView scoreView = findViewById(R.id.ammonizioni_roma);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given tiri for Lazio.
     */
    public void displayTiriLazio(int score) {
        TextView scoreView = findViewById(R.id.tiri_lazio);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given tiri for Roma.
     */
    public void displayTiriRoma(int score) {
        TextView scoreView = findViewById(R.id.tiri_roma);
        scoreView.setText(String.valueOf(score));
    }
}

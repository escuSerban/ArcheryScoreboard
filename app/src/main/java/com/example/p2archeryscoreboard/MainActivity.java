package com.example.p2archeryscoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreArcher = 0;
    int scoreBowman = 0;
    int goldArcher = 0;
    int goldBowman = 0;
    int missArcher = 0;
    int missBowman = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Archer.
     */
    public void displayScoreArcher(int score) {
        TextView scoreView = (TextView) findViewById(R.id.archer_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Archer by 9 points and also adds 1 to his gold counter.
     */
    public void GoldA(View view){
        scoreArcher = scoreArcher + 9;
        displayScoreArcher(scoreArcher);
        goldArcher = goldArcher +1;
        displayGoldArcher(goldArcher);
    }

    /**
     * Increase the score for Archer by 1 point.
     */
    public void WhiteA(View view) {
        scoreArcher = scoreArcher + 1;
        displayScoreArcher(scoreArcher);
    }

    /**
     * Increase the score for Archer by 3 points.
     */
    public void BlackA(View view) {
        scoreArcher = scoreArcher + 3;
        displayScoreArcher(scoreArcher);
    }

    /**
     * Increase the score for Archer by 5 points.
     */
    public void BlueA(View view) {
        scoreArcher = scoreArcher + 5;
        displayScoreArcher(scoreArcher);
    }

    /**
     * Increase the score for Archer by 7 points.
     */
    public void RedA(View view) {
        scoreArcher = scoreArcher + 7;
        displayScoreArcher(scoreArcher);
    }

    /**
     * Displays the given score for Bowman.
     */
    public void displayScoreBowman(int gold) {
        TextView scoreView = (TextView) findViewById(R.id.bowman_score);
        scoreView.setText(String.valueOf(gold));
    }

    /**
     * Increase the score for Bowman by 9 points and also adds 1 to his gold counter.
     */
    public void GoldB(View view){
        scoreBowman = scoreBowman + 9;
        displayScoreBowman(scoreBowman);
        goldBowman = goldBowman +1;
        displayGoldBowman(goldBowman);
    }

    /**
     * Increase the score for Bowman by 1 point.
     */
    public void WhiteB(View view) {
        scoreBowman = scoreBowman + 1;
        displayScoreBowman(scoreBowman);
    }

    /**
     * Increase the score for Bowman by 3 points.
     */
    public void BlackB(View view) {
        scoreBowman = scoreBowman + 3;
        displayScoreBowman(scoreBowman);
    }

    /**
     * Increase the score for Bowman by 5 points.
     */
    public void BlueB(View view) {
        scoreBowman = scoreBowman + 5;
        displayScoreBowman(scoreBowman);
    }

    /**
     * Increase the score for Bowman by 7 points.
     */
    public void RedB(View view) {
        scoreBowman = scoreBowman + 7;
        displayScoreBowman(scoreBowman);
    }

    /**
     * Displays the missed arrows for Archer.
     */
    public void displayMissArcher(int miss) {
        TextView scoreView = (TextView) findViewById(R.id.count_a_miss);
        scoreView.setText(String.valueOf(miss));
    }

    /**
     * Increase the counter for Archer's missed arrows by 1 point.
     */
    public void MissA(View view) {
        missArcher = missArcher + 1;
        displayMissArcher(missArcher);
    }

    /**
     * Displays the missed arrows for Bowman.
     */
    public void displayMissBowman(int miss) {
        TextView scoreView = (TextView) findViewById(R.id.count_b_miss);
        scoreView.setText(String.valueOf(miss));
    }

    /**
     * Increase the counter for Bowman's missed arrows by 1 point.
     */
    public void MissB(View view) {
        missBowman = missBowman + 1;
        displayMissBowman(missBowman);
    }

    /**
     * Displays the gold points for Archer.
     */
    public void displayGoldArcher(int gold) {
        TextView scoreView = (TextView) findViewById(R.id.count_a_gold);
        scoreView.setText(String.valueOf(gold));
    }

    /**
     * Displays the gold points for Bowman.
     */
    public void displayGoldBowman(int gold) {
        TextView scoreView = (TextView) findViewById(R.id.count_b_gold);
        scoreView.setText(String.valueOf(gold));
    }

    /**
     * Resets the score for both players back to 0 value along with their metrics.
     */
    public void resetButton(View view) {
         scoreArcher = 0;
         scoreBowman = 0;
         goldArcher = 0;
         goldBowman = 0;
         missArcher = 0;
         missBowman = 0;
        displayScoreArcher(scoreArcher);
        displayScoreBowman(scoreBowman);
        displayGoldArcher(goldArcher);
        displayGoldBowman(goldBowman);
        displayMissArcher(missArcher);
        displayMissBowman(missBowman);
    }

}
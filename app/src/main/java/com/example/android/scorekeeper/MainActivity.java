package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    //Displays foul count for Team A.

    public void foulsForTeamA(int fouls) {
        TextView foulView = (TextView) findViewById(R.id.team_a_foulCount);
        foulView.setText(String.valueOf(fouls));
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //Displays foul count for Team B.

    public void foulsForTeamB(int fouls) {
        TextView foulView = (TextView) findViewById(R.id.team_b_foulCount);
        foulView.setText(String.valueOf(fouls));
    }

    public void resetAll (View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        foulsForTeamA(foulTeamA);
        foulsForTeamB(foulTeamB);

    }

    public void foulForTeamA (View v) {
        foulTeamA++;
        foulsForTeamA(foulTeamA);
    }

    public void foulForTeamB (View v) {
        foulTeamB++;
        foulsForTeamB(foulTeamB);
    }

    public void threePointsForTeamA (View v) {
        scoreTeamA = scoreTeamA +3;
        displayForTeamA(scoreTeamA);
    }

    public void twoPointsForTeamA (View v) {
        scoreTeamA = scoreTeamA +2;
        displayForTeamA(scoreTeamA);
    }

    public void onePointForTeamA (View v) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    public void threePointsForTeamB (View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void twoPointsForTeamB (View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void onePointForTeamB (View v) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    
}

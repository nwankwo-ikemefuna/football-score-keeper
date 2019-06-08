package com.example.footballscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    // Initialize scores for Team A
    int goalsTeamA = 0;
    int possessionTeamA = 50;
    int freeKicksTeamA = 0;
    int cornerKicksTeamA = 0;
    int yellowCardsTeamA = 0;
    int redCardsTeamA = 0;

    // Initialize scores for Team B
    int goalsTeamB = 0;
    int possessionTeamB = 50;
    int freeKicksTeamB = 0;
    int cornerKicksTeamB = 0;
    int yellowCardsTeamB = 0;
    int redCardsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    

    /**
     * Score actions for Team A
     */

    /**
     * Increments the goal score for Team A by 1 goal.
     */
    public void incrementTeamAGoals(View v) {
        goalsTeamA++;
        displayGoalsTeamA(goalsTeamA);
    }

    /**
     * Increments the possession for Team A by 1 percent and reduces the possession for Team B by 1 percent.
     */
    public void incrementTeamAPossession(View v) {
        //ensure score does not exceed 100
        if (possessionTeamA == 100) {
            return;
        }
        possessionTeamA++; //increment Team A possession
        possessionTeamB--; //decrement Team B possession
        displayPossessionTeamA(possessionTeamA);
        displayPossessionTeamB(possessionTeamB);
    }

    /**
     * Increments total free kicks for Team A by 1.
     */
    public void incrementTeamAFreeKick(View v) {
        freeKicksTeamA++;
        displayFreeKicksTeamA(freeKicksTeamA);
    }

    /**
     * Increments total corner kicks for Team A by 1.
     */
    public void incrementTeamACornerKick(View v) {
        cornerKicksTeamA++;
        displayCornerKicksTeamA(cornerKicksTeamA);
    }

    /**
     * Increments total yellow cards for Team A by 1.
     */
    public void incrementTeamAYellowCards(View v) {
        //ensure yellow cards does not exceed 11
        if (yellowCardsTeamA == 11) {
            return;
        }
        yellowCardsTeamA++;
        displayYellowCardsTeamA(yellowCardsTeamA);
    }

    /**
     * Increments total red cards for Team A by 1.
     */
    public void incrementTeamARedCards(View v) {
        //ensure red cards does not exceed 11
        if (redCardsTeamA == 11) {
            return;
        }
        redCardsTeamA++;
        displayRedCardsTeamA(redCardsTeamA);
    }


    /**
     * Score actions for Team B
     */

    /**
     * Increments the goal score for Team B by 1 goal.
     */
    public void incrementTeamBGoals(View v) {
        goalsTeamB++;
        displayGoalsTeamB(goalsTeamB);
    }

    /**
     * Increments the possession for Team B by 1 percent and reduces the possession for Team A by 1 percent.
     */
    public void incrementTeamBPossession(View v) {
        //ensure score does not exceed 100
        if (possessionTeamB == 100) {
            return;
        }
        possessionTeamA--; //decrement Team A possession
        possessionTeamB++; //increment Team B possession
        displayPossessionTeamA(possessionTeamA);
        displayPossessionTeamB(possessionTeamB);
    }

    /**
     * Increments total free kicks for Team B by 1.
     */
    public void incrementTeamBFreeKick(View v) {
        freeKicksTeamB++;
        displayFreeKicksTeamB(freeKicksTeamB);
    }

    /**
     * Increments total corner kicks for Team B by 1.
     */
    public void incrementTeamBCornerKick(View v) {
        cornerKicksTeamB++;
        displayCornerKicksTeamB(cornerKicksTeamB);
    }

    /**
     * Increments total yellow cards for Team B by 1.
     */
    public void incrementTeamBYellowCards(View v) {
        //ensure yellow cards does not exceed 11
        if (yellowCardsTeamB == 11) {
            return;
        }
        yellowCardsTeamB++;
        displayYellowCardsTeamB(yellowCardsTeamB);
    }

    /**
     * Increments total red cards for Team B by 1.
     */
    public void incrementTeamBRedCards(View v) {
        //ensure red cards does not exceed 11
        if (redCardsTeamB == 11) {
            return;
        }
        redCardsTeamB++;
        displayRedCardsTeamB(redCardsTeamB);
    }
    

    /**
     * Reset the scores for both teams back to their initials
     */
    public void resetScore(View v) {
        //Team A
        goalsTeamA = 0;
        possessionTeamA = 50;
        freeKicksTeamA = 0;
        cornerKicksTeamA = 0;
        yellowCardsTeamA = 0;
        redCardsTeamA = 0;
        displayGoalsTeamA(goalsTeamA);
        displayPossessionTeamA(possessionTeamA);
        displayFreeKicksTeamA(freeKicksTeamA);
        displayCornerKicksTeamA(cornerKicksTeamA);
        displayYellowCardsTeamA(yellowCardsTeamA);
        displayRedCardsTeamA(redCardsTeamA);
        //Team B
        goalsTeamB = 0;
        possessionTeamB = 50;
        freeKicksTeamB = 0;
        cornerKicksTeamB = 0;
        yellowCardsTeamB = 0;
        redCardsTeamB = 0;
        displayGoalsTeamB(goalsTeamB);
        displayPossessionTeamB(possessionTeamB);
        displayFreeKicksTeamB(freeKicksTeamB);
        displayCornerKicksTeamB(cornerKicksTeamB);
        displayYellowCardsTeamB(yellowCardsTeamB);
        displayRedCardsTeamB(redCardsTeamB);
    }


    /**
     * Display Scores for Team A
     */


    /**
     * Displays goal score for Team A.
     */
    private void displayGoalsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goal_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays possession for Team A.
     */
    private void displayPossessionTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_possession);
        scoreView.setText(String.valueOf(score) + '%');
    }

    /**
     * Displays total free kicks for Team A.
     */
    private void displayFreeKicksTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_free_kicks);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays total corner kicks for Team A.
     */
    private void displayCornerKicksTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_corner_kicks);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays total yellow cards for Team A.
     */
    private void displayYellowCardsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow_cards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays total red cards for Team A.
     */
    private void displayRedCardsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_cards);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Display Scores for Team B
     */

    /**
     * Displays goal score for Team B.
     */
    private void displayGoalsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goal_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays possession for Team B.
     */
    private void displayPossessionTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_possession);
        scoreView.setText(String.valueOf(score) + '%');
    }

    /**
     * Displays total free kicks for Team B.
     */
    private void displayFreeKicksTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_free_kicks);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays total corner kicks for Team B.
     */
    private void displayCornerKicksTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_corner_kicks);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays total yellow cards for Team B.
     */
    private void displayYellowCardsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow_cards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays total red cards for Team B.
     */
    private void displayRedCardsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_cards);
        scoreView.setText(String.valueOf(score));
    }


}

package com.salmeron.mario.bowlingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvNameOne = (TextView) findViewById(R.id.tvNameOne);
        TextView tvNameTwo = (TextView) findViewById(R.id.tvNameTwo);

        Bundle bundle = getIntent().getExtras();
        String player1 = bundle.getString("player1");
        String player2 = bundle.getString("player2");
        tvNameOne.setText(player1);
        tvNameTwo.setText(player2);
        game();

    }

    public void game() {

        TextView pOneFrameOne = (TextView)findViewById(R.id.pOneFrameOne);
        TextView pOneFrameTwo = (TextView)findViewById(R.id.pOneFrameTwo);
        TextView pOneFrameThree = (TextView)findViewById(R.id.pOneFrameThree);

        TextView pTwoFrameOne = (TextView)findViewById(R.id.pTwoFrameOne);
        TextView pTwoFrameTwo = (TextView)findViewById(R.id.pTwoFrameTwo);
        TextView pTwoFrameThree = (TextView)findViewById(R.id.pTwoFrameThree);


        Integer length = 11;
        String pointsOne = "";
        Integer pointsOneNumber = 0;

        boolean playerOneTurn = true;
        boolean playerTwoTurn = true;

        Random randomGenerator = new Random();


        do {
            int pinsKnockedinBallOne = randomGenerator.nextInt(length);
            int pinsKnockedinBallTwo = randomGenerator.nextInt(length - pinsKnockedinBallOne);

            int pinsKnockedinBallOneSinceStrike = randomGenerator.nextInt(length);
            int pinsKnockedinBallTwoSinceStrike = randomGenerator.nextInt(length - pinsKnockedinBallOneSinceStrike);

            if ((pinsKnockedinBallOne == length)) {
                pointsOne = "X";
                pointsOneNumber = 10;

                Integer strikepointsFrame1 = pointsOneNumber + pinsKnockedinBallOneSinceStrike + pinsKnockedinBallTwoSinceStrike;
                pOneFrameOne.setText(strikepointsFrame1.toString()+" | "+pointsOne);

                Integer strikepointsFrame2 = strikepointsFrame1 + pinsKnockedinBallOneSinceStrike + pinsKnockedinBallTwoSinceStrike;
                pOneFrameTwo.setText(strikepointsFrame2.toString() +" | "+ pinsKnockedinBallOneSinceStrike +" | "+ pinsKnockedinBallTwoSinceStrike);

                playerOneTurn=false;
                playerTwoTurn=true;
            } else {
                pointsOneNumber = pinsKnockedinBallOne + pinsKnockedinBallTwo;
                pOneFrameOne.setText(pointsOneNumber.toString()+" | "+pinsKnockedinBallOne+" | "+pinsKnockedinBallTwo);

                playerOneTurn = false;
                playerTwoTurn = true;

            }

        } while (playerOneTurn);

        do {
            int pinsKnockedinBallOne = randomGenerator.nextInt(length);
            int pinsKnockedinBallTwo = randomGenerator.nextInt(length - pinsKnockedinBallOne);

            int pinsKnockedinBallOneSinceStrike = randomGenerator.nextInt(length);
            int pinsKnockedinBallTwoSinceStrike = randomGenerator.nextInt(length - pinsKnockedinBallOneSinceStrike);

            if ((pinsKnockedinBallOne == length)) {
                pointsOne = "X";
                pointsOneNumber = 10;

                Integer strikepointsFrame1 = pointsOneNumber + pinsKnockedinBallOneSinceStrike + pinsKnockedinBallTwoSinceStrike;
                pTwoFrameOne.setText(strikepointsFrame1.toString()+" | "+pointsOne);

                Integer strikepointsFrame2 = strikepointsFrame1 + pinsKnockedinBallOneSinceStrike + pinsKnockedinBallTwoSinceStrike;
                pTwoFrameTwo.setText(strikepointsFrame2.toString() +" | "+ pinsKnockedinBallOneSinceStrike +" | "+ pinsKnockedinBallTwoSinceStrike);

                playerTwoTurn=false;
                playerOneTurn=true;
            } else {
                pointsOneNumber = pinsKnockedinBallOne + pinsKnockedinBallTwo;
                pTwoFrameOne.setText(pointsOneNumber.toString()+" | "+pinsKnockedinBallOne+" | "+pinsKnockedinBallTwo);

                playerTwoTurn=false;
                playerOneTurn=true;

            }

        } while (playerTwoTurn);


        //Here it complicates a little bit:
        do {
            int pinsKnockedinBallOne = randomGenerator.nextInt(length);
            int pinsKnockedinBallTwo = randomGenerator.nextInt(length - pinsKnockedinBallOne);

            int pinsKnockedinBallOneSinceStrike = randomGenerator.nextInt(length);
            int pinsKnockedinBallTwoSinceStrike = randomGenerator.nextInt(length - pinsKnockedinBallOneSinceStrike);

            int third_fase = randomGenerator.nextInt(length);
            int complementary = randomGenerator.nextInt(length - pinsKnockedinBallOneSinceStrike);

            if ((pinsKnockedinBallOne == length)) {
                pointsOne = "X";
                pointsOneNumber = 10;

                Integer strikepointsFrame1 = pointsOneNumber + pinsKnockedinBallOneSinceStrike + pinsKnockedinBallTwoSinceStrike;
                pOneFrameTwo.setText(strikepointsFrame1.toString()+" | "+pointsOne);

                Integer strikepointsFrame2 = strikepointsFrame1 + pinsKnockedinBallOneSinceStrike + pinsKnockedinBallTwoSinceStrike;
                pOneFrameThree.setText(strikepointsFrame2.toString() +" | "+ pinsKnockedinBallOneSinceStrike +" | "+ pinsKnockedinBallTwoSinceStrike);

                playerOneTurn=false;
                playerTwoTurn=true;
            } else {
                pointsOneNumber = pinsKnockedinBallOne + pinsKnockedinBallTwo;
                pOneFrameTwo.setText(pointsOneNumber.toString()+" | "+pinsKnockedinBallOne+" | "+pinsKnockedinBallTwo);

                Integer endingzone = third_fase+complementary;
                pOneFrameThree.setText(endingzone.toString()+" | "+third_fase+" | "+complementary);

                playerOneTurn = false;
                playerTwoTurn = true;

            }

        } while (playerOneTurn);

        do {
            int pinsKnockedinBallOne = randomGenerator.nextInt(length);
            int pinsKnockedinBallTwo = randomGenerator.nextInt(length - pinsKnockedinBallOne);

            int pinsKnockedinBallOneSinceStrike = randomGenerator.nextInt(length);
            int pinsKnockedinBallTwoSinceStrike = randomGenerator.nextInt(length - pinsKnockedinBallOneSinceStrike);

            int third_fase = randomGenerator.nextInt(length);
            int complementary = randomGenerator.nextInt(length - pinsKnockedinBallOneSinceStrike);

            if ((pinsKnockedinBallOne == length)) {
                pointsOne = "X";
                pointsOneNumber = 10;

                Integer strikepointsFrame1 = pointsOneNumber + pinsKnockedinBallOneSinceStrike + pinsKnockedinBallTwoSinceStrike;
                pTwoFrameTwo.setText(strikepointsFrame1.toString()+" | "+pointsOne);

                Integer strikepointsFrame2 = strikepointsFrame1 + pinsKnockedinBallOneSinceStrike + pinsKnockedinBallTwoSinceStrike;
                pTwoFrameThree.setText(strikepointsFrame2.toString() +" | "+ pinsKnockedinBallOneSinceStrike +" | "+ pinsKnockedinBallTwoSinceStrike);

                playerTwoTurn=false;
                playerOneTurn=true;
            } else {
                pointsOneNumber = pinsKnockedinBallOne + pinsKnockedinBallTwo;
                pTwoFrameTwo.setText(pointsOneNumber.toString()+" | "+pinsKnockedinBallOne+" | "+pinsKnockedinBallTwo);

                Integer endingzone = third_fase+complementary;
                pTwoFrameThree.setText(endingzone.toString()+" | "+third_fase+" | "+complementary);

                playerTwoTurn=false;
                playerOneTurn=true;

            }

        } while (playerTwoTurn);





    }
}

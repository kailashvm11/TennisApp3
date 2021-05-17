package com.tennis;

public class TennisGame {

    private static final String INITIAL_SCORE = "LOVE ALL";
    private static final String FIRST_SCORE = "FIFTEEN LOVE";
    private static final String SECOND_SCORE = "THIRTY LOVE";

    private int playerScore = 0;

    public static void main( String[] args ) {
    }

    String getScore() {
        if (playerScore == 0) {
            return INITIAL_SCORE;
        }
        if (playerScore == 1) {
            return FIRST_SCORE;
        } else {
            return SECOND_SCORE;
        }
    }

    public void nextPointWon(String player) {
        playerScore++;
    }
}

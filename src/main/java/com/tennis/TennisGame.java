package com.tennis;

public class TennisGame {

    private static final String INITIAL_SCORE = "LOVE ALL";
    private static final String PLAYER_SCORE = "FIFTEEN LOVE";
    private int playerScore = 0;

    public static void main( String[] args ) {
    }

    String getScore() {
        if (playerScore == 0) {
            return INITIAL_SCORE;
        } else {
            return PLAYER_SCORE;
        }
    }

    public void nextPointWon(String player) {
        playerScore++;
    }
}

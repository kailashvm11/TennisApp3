package com.tennis;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {

    private final Map<Integer,String> scoreMap;

    public TennisGame() {
        scoreMap = new HashMap<>();
        scoreMap.put(0, "LOVE ALL");
        scoreMap.put(1, "FIFTEEN LOVE");
        scoreMap.put(2, "THIRTY LOVE");
        scoreMap.put(3, "FORTY LOVE");
        scoreMap.put(4, "GAME LOVE");
    }

    private Integer playerScore = 0;

    public static void main( String[] args ) {
    }

    String getScore() {
        return scoreMap.get(playerScore);
    }

    public void nextPointWon(String player) {
        playerScore++;
    }
}

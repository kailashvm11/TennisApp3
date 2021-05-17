package com.tennis;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {

    private Scoreboard scoreboard;
    private final Map<Scoreboard, String > scoreMap;

    public TennisGame() {
        scoreboard = new Scoreboard();
        scoreMap = new HashMap<>();
        scoreMap.put(new Scoreboard(0, 0), "LOVE ALL");
        scoreMap.put(new Scoreboard(1, 0), "FIFTEEN LOVE");
        scoreMap.put(new Scoreboard(2, 0), "THIRTY LOVE");
        scoreMap.put(new Scoreboard(3, 0), "FORTY LOVE");
        scoreMap.put(new Scoreboard(4, 0), "GAME LOVE");
        scoreMap.put(new Scoreboard(0, 1), "LOVE FIFTEEN");
        scoreMap.put(new Scoreboard(0, 2), "LOVE THIRTY");
    }

    public static void main( String[] args ) {
    }

    String getScore() {
        return scoreMap.get(scoreboard);
    }

    public void nextPointWon(String player) {
        if (player.equals("A")) {
            scoreboard.incrementPlayerAScore();
        }
        if (player.equals("B")) {
            scoreboard.incrementPlayerBScore();
        }
    }
}

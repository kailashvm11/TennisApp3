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
        scoreMap.put(new Scoreboard(4, 0), "GAME PLAYER A");
        scoreMap.put(new Scoreboard(0, 1), "LOVE FIFTEEN");
        scoreMap.put(new Scoreboard(0, 2), "LOVE THIRTY");
        scoreMap.put(new Scoreboard(0, 3), "LOVE FORTY");
        scoreMap.put(new Scoreboard(0, 4), "GAME PLAYER B");
        scoreMap.put(new Scoreboard(3, 3), "DEUCE");
        scoreMap.put(new Scoreboard(1, 1), "FIFTEEN ALL");
        scoreMap.put(new Scoreboard(1, 2), "FIFTEEN THIRTY");
        scoreMap.put(new Scoreboard(1, 3), "FIFTEEN FORTY");
        scoreMap.put(new Scoreboard(2, 1), "THIRTY FIFTEEN");
        scoreMap.put(new Scoreboard(2, 2), "THIRTY ALL");
        scoreMap.put(new Scoreboard(2, 3), "THIRTY FORTY");
        scoreMap.put(new Scoreboard(3, 1), "FORTY FIFTEEN");
        scoreMap.put(new Scoreboard(3, 2), "FORTY THIRTY");
        scoreMap.put(new Scoreboard(4, 1), "GAME PLAYER A");
        scoreMap.put(new Scoreboard(4, 2), "GAME PLAYER A");
        scoreMap.put(new Scoreboard(1, 4), "GAME PLAYER B");
        scoreMap.put(new Scoreboard(2, 4), "GAME PLAYER B");


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

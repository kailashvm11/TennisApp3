package com.tennis;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TennisGameTest {

    TennisGame game;

    @BeforeEach
    void setUp() {
        game = new TennisGame();
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertNotNull( game );
    }

    @Test
    public void shouldReturnInitialScoreLoveAll() {
        String score = game.getScore();
        assertEquals( "LOVE ALL", score );
    }

    @Test
    public void shouldReturnScoreFifteenLove() {
        game.nextPointWon("A");
        String score = game.getScore();
        assertEquals( "FIFTEEN LOVE", score );
    }

    @Test
    public void shouldReturnScoreThirtyLove() {
        game.nextPointWon("A");
        game.nextPointWon("A");
        String score = game.getScore();
        assertEquals( "THIRTY LOVE", score );
    }

    @Test
    public void shouldReturnScoreFortyLove() {
        String[] pointWinners = {"A", "A", "A"};
        playManyPoints(pointWinners);
        String score = game.getScore();
        assertEquals( "FORTY LOVE", score );
    }

    @Test
    public void shouldReturnScoreGamePlayerA() {
        String[] pointWinners = {"A", "A", "A", "A"};
        playManyPoints(pointWinners);
        String score = game.getScore();
        assertEquals( "GAME LOVE", score );
    }

    @Test
    public void shouldReturnScoreLoveFifteen() {
        game.nextPointWon("B");
        String score = game.getScore();
        assertEquals( "LOVE FIFTEEN", score );
    }

    @Test
    public void shouldReturnScoreLoveThirty() {
        game.nextPointWon("B");
        game.nextPointWon("B");
        String score = game.getScore();
        assertEquals( "LOVE THIRTY", score );
    }

    @Test
    public void shouldReturnScoreLoveForty() {
        String[] pointWinners = {"B", "B", "B"};
        playManyPoints(pointWinners);
        String score = game.getScore();
        assertEquals( "LOVE FORTY", score );
    }

    private void playManyPoints(String[] pointWinners) {
        for (String pointWinner : pointWinners) {
            game.nextPointWon(pointWinner);
        }
    }


}

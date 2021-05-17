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

}

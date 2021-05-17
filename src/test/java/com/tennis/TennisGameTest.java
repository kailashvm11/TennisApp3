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
        assertEquals( "GAME PLAYER A", score );
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

    @Test
    public void shouldReturnScoreGamePlayerB() {
        String[] pointWinners = {"B", "B", "B", "B"};
        playManyPoints(pointWinners);
        String score = game.getScore();
        assertEquals( "GAME PLAYER B", score );
    }

    @Test
    public void shouldReturnDeuceAfterThreePointsEach() {
        String[] pointWinners = {"A", "B", "A", "B", "A", "B"};
        playManyPoints(pointWinners);
        String score = game.getScore();
        assertEquals( "DEUCE", score );
    }

    @Test
    public void shouldReturnFifteenAll() {
        String[] pointWinners = {"A", "B"};
        playManyPoints(pointWinners);
        String score = game.getScore();
        assertEquals( "FIFTEEN ALL", score );
    }

    @Test
    public void shouldReturnFifteenThirty() {
        String[] pointWinners = {"A", "B", "B"};
        playManyPoints(pointWinners);
        String score = game.getScore();
        assertEquals( "FIFTEEN THIRTY", score );
    }

    @Test
    public void shouldReturnFifteenForty() {
        String[] pointWinners = {"B","A", "B", "B"};
        playManyPoints(pointWinners);
        String score = game.getScore();
        assertEquals( "FIFTEEN FORTY", score );
    }

    @Test
    public void shouldReturnThirtyFifteen() {
        String[] pointWinners = {"A", "B", "A"};
        playManyPoints(pointWinners);
        String score = game.getScore();
        assertEquals( "THIRTY FIFTEEN", score );
    }

    @Test
    public void shouldReturnThirtyAll() {
        String[] pointWinners = {"A", "B", "A", "B"};
        playManyPoints(pointWinners);
        String score = game.getScore();
        assertEquals( "THIRTY ALL", score );
    }

    @Test
    public void shouldReturnThirtyForty() {
        String[] pointWinners = {"A", "B", "B", "A", "B"};
        playManyPoints(pointWinners);
        String score = game.getScore();
        assertEquals( "THIRTY FORTY", score );
    }

    @Test
    public void shouldReturnFortyFifteen() {
        String[] pointWinners = {"A", "B", "A", "A"};
        playManyPoints(pointWinners);
        String score = game.getScore();
        assertEquals( "FORTY FIFTEEN", score );
    }

    @Test
    public void shouldReturnFortyThirty() {
        String[] pointWinners = {"A", "B", "A", "A", "B"};
        playManyPoints(pointWinners);
        String score = game.getScore();
        assertEquals( "FORTY THIRTY", score );
    }

    @Test
    public void shouldReturnGameForPlayerAWithFourPointsWonToOne() {
        String[] pointWinners = {"A", "B", "A", "A", "A"};
        playManyPoints(pointWinners);
        String score = game.getScore();
        assertEquals( "GAME PLAYER A", score );
    }

    @Test
    public void shouldReturnGameForPlayerAWithFourPointsWonToTwo() {
        String[] pointWinners = {"A", "B", "A", "B", "A", "A"};
        playManyPoints(pointWinners);
        String score = game.getScore();
        assertEquals( "GAME PLAYER A", score );
    }

    @Test
    public void shouldReturnGameForPlayerBWithFourPointsWonToOne() {
        String[] pointWinners = {"A", "B", "B", "B", "B"};
        playManyPoints(pointWinners);
        String score = game.getScore();
        assertEquals( "GAME PLAYER B", score );
    }

    @Test
    public void shouldReturnGameForPlayerBWithFourPointsWonToTwo() {
        String[] pointWinners = {"A", "B", "B", "B", "A", "B"};
        playManyPoints(pointWinners);
        String score = game.getScore();
        assertEquals( "GAME PLAYER B", score );
    }

    @Test
    public void shouldReturnAdvantageFortyforPlayerA() {
        String[] pointWinners = {"A", "B", "B", "A", "A", "B","A"};
        playManyPoints(pointWinners);
        String score = game.getScore();
        assertEquals( "ADVANTAGE FORTY", score );
    }

    @Test
    public void shouldReturnFortyAdvantageforPlayerB() {
        String[] pointWinners = {"A", "B", "B", "A", "A", "B", "B"};
        playManyPoints(pointWinners);
        String score = game.getScore();
        assertEquals( "FORTY ADVANTAGE", score );
    }

    private void playManyPoints(String[] pointWinners) {
        for (String pointWinner : pointWinners) {
            game.nextPointWon(pointWinner);
        }
    }


}

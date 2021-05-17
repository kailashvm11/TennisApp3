package com.tennis;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

}

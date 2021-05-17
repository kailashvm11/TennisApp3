package com.tennis;

import java.util.HashMap;
import java.util.Objects;

public class Scoreboard {
    private Integer playerAScore;
    private Integer playerBScore;

    public Scoreboard() {
        playerAScore = 0;
        playerBScore = 0;
    }

    public Scoreboard(Integer playerAScore, Integer playerBScore) {
        this.playerAScore = playerAScore;
        this.playerBScore = playerBScore;
    }

    public Integer getPlayerAScore() {
        return playerAScore;
    }

    public Integer getPlayerBScore() {
        return playerBScore;
    }

    public void incrementPlayerAScore() {
        playerAScore++;
    }

    public void incrementPlayerBScore() {
        playerBScore++;
    }

    public void decrementPlayerAScore() {
        playerAScore--;
    }
    public void decrementPlayerBScore() {
        playerBScore--;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scoreboard that = (Scoreboard) o;
        return Objects.equals(getPlayerAScore(), that.getPlayerAScore()) &&
                Objects.equals(getPlayerBScore(), that.getPlayerBScore());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlayerAScore(), getPlayerBScore());
    }

    @Override
    public String toString() {
        return "Scoreboard {" +
                "Player A Score=" + playerAScore +
                ", Player B Score=" + playerBScore +
                '}';
    }


}

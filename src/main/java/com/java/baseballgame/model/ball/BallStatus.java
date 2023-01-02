package com.java.baseballgame.model.ball;

public enum BallStatus {
    BALL, STRIKE, NOTHING;

    public boolean isStrike() {
        return this == STRIKE;
    }

    public boolean isBall() {
        return this == BALL;
    }
}

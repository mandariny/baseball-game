package com.java.baseballgame.model.ball;

public class Ball {
    private final int position;
    private final int num;

    public Ball(int position, int num) {
        this.position = position;
        this.num = num;
    }

    public boolean isValidate() {
        return num > 0 && num < 10;
    }

    public BallStatus play(Ball compareBall) {
        if(compareBall.equals(this)) return BallStatus.STRIKE;
        if(compareBall.isEqualsNum(this.num)) return BallStatus.BALL;
        return BallStatus.NOTHING;
    }

    private boolean isEqualsNum(int compareNum) {
        return compareNum == this.num;
    }

    public boolean equals(Ball compareBall) {
        return compareBall.position == this.position && compareBall.num == this.num;
    }
}

package com.java.baseballgame.vo;

import com.java.baseballgame.model.ball.BallStatus;

import static com.java.baseballgame.model.ball.Baseballs.BALL_SIZE;

public class Result {

    private int strike;
    private int ball;

    public int getStrike() {
        return strike;
    }

    public int getBall() { return ball; }

    public boolean getIsAnswer(){
        return strike == BALL_SIZE;
    }

    public String getResult(){
        String str = "";
        if(strike == 0 && ball == 0)
            return "낫싱";
        if(ball != 0) {
            str += ball;
            str += "볼 ";
        }
        if(strike != 0){
            str += strike;
            str += "스트라이크";
        }
        return str;
    }

    public void report(BallStatus status) {
        if(status.isStrike()) strike++;
        if(status.isBall()) ball++;
    }
}

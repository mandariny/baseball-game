package com.java.baseballgame.model.ball;

import com.java.baseballgame.vo.Result;

import java.util.ArrayList;
import java.util.List;

public class Baseballs {
    public static final int BALL_SIZE = 3;
    private final List<Ball> balls;

    public Baseballs(List<Integer> arrays) {
        balls = getBalls(arrays);
    }

    public List<Ball> getBalls(List<Integer> arrays){
        List<Ball> tmpBalls = new ArrayList<>();
        for(int i=0; i<BALL_SIZE; i++){
            tmpBalls.add(new Ball(i, arrays.get(i)));
        }
        return tmpBalls;
    }

    public BallStatus play(Ball compareBall) {
        return balls.stream()
                .map(computer -> computer.play(compareBall))
                .filter(result -> result != BallStatus.NOTHING)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

    public Result play(List<Integer> arrays){
        List<Ball> userBalls = getBalls(arrays);
        Result result = new Result();
        for(int i=0; i<BALL_SIZE; i++){
            result.report(this.play(userBalls.get(i)));
        }
        return result;
    }
}

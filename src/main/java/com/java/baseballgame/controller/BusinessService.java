package com.java.baseballgame.controller;

import com.java.baseballgame.model.ball.Baseballs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static com.java.baseballgame.model.ball.Baseballs.BALL_SIZE;

public class BusinessService {
    public Baseballs generateNums() {
        Random rd = new Random();
        List<Integer> ballNums = new ArrayList<>();
        for(int i=0; i<BALL_SIZE; i++){
            ballNums.add(rd.nextInt(10));
            System.out.print(ballNums.get(i) + " ");
        }
        System.out.println();
        return new Baseballs(ballNums);
    }

    public List<Integer> toNums(int nums) {
        List<Integer> ballNums = new ArrayList<>();
        for(int i=0; i<BALL_SIZE; i++){
            ballNums.add(nums % 10);
            nums /= 10;
        }
        Collections.reverse(ballNums);
        return ballNums;
    }
}

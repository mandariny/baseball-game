package com.java.baseballgame.model;

import com.java.baseballgame.vo.Result;

import java.util.Random;

public class BusinessService {

    Random rd;

    public BusinessService(){
        rd = new Random();
    }

    public int[] generateNums(){
        int[] nums = new int[3];
        for(int i=0; i<3; i++){
            nums[i] = rd.nextInt(10);
        }
        return nums;
    }

    public int[] toNums(int num){
        int[] nums = new int[3];
        for(int i=2; i>=0; i--){
            nums[i] = num % 10;
            num /= 10;
        }
        return nums;
    }

    private int compareAnswerAndGuess(int answer, int guess){
        if(answer == guess) return 1;
        return 0;
    }

    private int findBall(int[] answer, int guess){
        int cnt = 0;
        for(int i=0; i<3; i++){
            cnt += compareAnswerAndGuess(answer[i], guess);
        }
        if(cnt > 1) cnt = 1;
        return cnt;
    }

    public Result checkResult(int[] answer, int[] guess){
        int strike = 0, ball = 0;
        for(int i=0; i<3; i++){
            strike += compareAnswerAndGuess(answer[i], guess[i]);
            ball += findBall(answer, guess[i]);
        }
        return new Result(strike, ball - strike);
    }

}

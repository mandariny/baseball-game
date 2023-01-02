package com.java.baseballgame.controller;

import com.java.baseballgame.model.ball.Baseballs;
import com.java.baseballgame.ui.InputView;
import com.java.baseballgame.ui.ResultView;
import com.java.baseballgame.vo.Result;

import java.util.List;

public class Controller {
    private static Baseballs answer;
    private static List<Integer> guess;
    private static final InputView inputView = new InputView();
    private static final ResultView resultView = new ResultView();
    private static final BusinessService service = new BusinessService();

    private static void play(){
        Result result = new Result();
        while(!result.getIsAnswer()){
            guess = service.toNums(inputView.getNums());
            result = answer.play(guess);
            resultView.printResult(result);
        }
    }

    private static void start(){
        boolean flag = true;
        while(flag){
            answer = service.generateNums();
            play();
            flag = resultView.oneMoreGame();
        }
    }

    public static void main(String[] args) {
        start();
    }
}

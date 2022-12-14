package com.java.baseballgame.vo;

import java.util.Scanner;

public class Result {

    private int strike;
    private int ball;
    private boolean isAnswer;

    public Result(int strike, int ball){
        this.strike = strike;
        this.ball = ball;
        if(strike == 3) this.isAnswer = true;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
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

    public boolean oneMoreGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        int cmd = scanner.nextInt();

        if(cmd == 1) return true;
        if(cmd == 2) return false;
        return false;
    }

}

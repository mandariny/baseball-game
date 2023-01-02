package com.java.baseballgame.ui;

import com.java.baseballgame.vo.Result;

import java.util.Scanner;

public class ResultView {

    public void printResult(Result result){
        System.out.println(result.getResult());
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

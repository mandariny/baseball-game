package com.java.baseballgame.ui;

import java.util.Scanner;

public class InputView {
    private Scanner scanner;

    public InputView(){
        scanner = new Scanner(System.in);
    }

    public int getNums(){
        System.out.println("숫자를 입력해 주세요 : ");
        int guess = scanner.nextInt();
        return guess;
    }

}

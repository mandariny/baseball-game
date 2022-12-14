package com.java.baseballgame.model;

import com.java.baseballgame.vo.Result;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BusinessServiceTest {

    BusinessService service;

    @BeforeEach
    void init(){
        service = new BusinessService();
    }

    @Test
    @DisplayName("정수 -> 정수 배열")
    void toNums(){
        Assertions.assertThat(service.toNums(123)).isEqualTo(new int[] {1, 2, 3});
    }

    @Test
    @DisplayName("1스트라이크")
    void makeStrike(){
        Result result = service.checkResult(new int[] {1, 2, 3}, new int[] {4, 5, 3});
        Assertions.assertThat(result.getStrike()).isEqualTo(1);
        Assertions.assertThat(result.getBall()).isEqualTo(0);
    }

    @Test
    @DisplayName("1볼")
    void makeBall(){
        Result result = service.checkResult(new int[] {1, 2, 3}, new int[] {4, 3, 5});
        Assertions.assertThat(result.getStrike()).isEqualTo(0);
        Assertions.assertThat(result.getBall()).isEqualTo(1);
    }

    @Test
    @DisplayName("1볼 1스트라이크")
    void makeBallAndStrike(){
        Result result = service.checkResult(new int[] {1, 2, 3}, new int[] {4, 1, 3});
        Assertions.assertThat(result.getStrike()).isEqualTo(1);
        Assertions.assertThat(result.getBall()).isEqualTo(1);
    }

    @Test
    @DisplayName("2볼 1스트라이크")
    void makeTwoBallAndStrke(){
        Result result = service.checkResult(new int[] {1, 2, 3}, new int[] {1, 1, 1});
        Assertions.assertThat(result.getStrike()).isEqualTo(1);
        Assertions.assertThat(result.getBall()).isEqualTo(2);
    }

}

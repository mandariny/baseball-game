package com.java.baseballgame.vo;

import com.java.baseballgame.vo.Result;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ResultTest {

    @Test
    @DisplayName("낫싱")
    void makeNothing(){
        Result result = new Result(0, 0);
        Assertions.assertThat(result.getResult()).isEqualTo("낫싱");
    }

    @Test
    @DisplayName("1볼")
    void makeBall(){
        Result result = new Result(0, 1);
        Assertions.assertThat(result.getResult()).isEqualTo("1볼 ");
    }

    @Test
    @DisplayName("1스트라이크")
    void makeStrike(){
        Result result = new Result(1, 0);
        Assertions.assertThat(result.getResult()).isEqualTo("1스트라이크");
    }

    @Test
    @DisplayName("1볼 1스트라이크")
    void makeBallAndStrike(){
        Result result = new Result(1, 1);
        Assertions.assertThat(result.getResult()).isEqualTo("1볼 1스트라이크");
    }

}

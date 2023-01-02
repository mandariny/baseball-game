package com.java.baseballgame.model.ball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    @Test
    @DisplayName("볼 1 ~ 9 유효성 검사")
    void ball_validatie(){
        assertThat(new Ball(1, 1).isValidate()).isTrue();
        assertThat(new Ball(1, 9).isValidate()).isTrue();
        assertThat(new Ball(1, 0).isValidate()).isFalse();
        assertThat(new Ball(1, 10).isValidate()).isFalse();
    }

    @Test
    @DisplayName("Nothing")
    void nothing(){
        assertThat(new Ball(1, 1).play(new Ball(1, 2))).isEqualTo(BallStatus.NOTHING);
        assertThat(new Ball(1, 1).play(new Ball(2, 3))).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    @DisplayName("Ball")
    void ball(){
        assertThat(new Ball(1, 1).play(new Ball(2, 1))).isEqualTo(BallStatus.BALL);
    }

    @Test
    @DisplayName("Strike")
    void strike(){
        assertThat(new Ball(1, 1).play(new Ball(1, 1))).isEqualTo(BallStatus.STRIKE);
    }
}

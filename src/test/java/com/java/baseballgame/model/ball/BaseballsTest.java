package com.java.baseballgame.model.ball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballsTest {
    @Test
    void nothing(){
        assertThat(new Baseballs(Arrays.asList(1, 2, 3)).play(new Ball(1, 5))).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void ball(){
        assertThat(new Baseballs(Arrays.asList(1, 2, 3)).play(new Ball(0, 2))).isEqualTo(BallStatus.BALL);
    }

    @Test
    void strike(){
        assertThat(new Baseballs(Arrays.asList(1, 2, 3)).play(new Ball(1, 2))).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void play(){
        assertThat(new Baseballs(Arrays.asList(1, 2, 3)).play(Arrays.asList(4, 5, 6)).getStrike()).isEqualTo(0);
        assertThat(new Baseballs(Arrays.asList(1, 2, 3)).play(Arrays.asList(4, 5, 6)).getBall()).isEqualTo(0);
        assertThat(new Baseballs(Arrays.asList(1, 2, 3)).play(Arrays.asList(1, 5, 6)).getStrike()).isEqualTo(1);
        assertThat(new Baseballs(Arrays.asList(1, 2, 3)).play(Arrays.asList(2, 5, 6)).getBall()).isEqualTo(1);
    }
}

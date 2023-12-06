package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class WinnersTest {
    Winners winners;
    Car pobi = Car.valueOf("pobi");
    Car isaac = Car.valueOf("isaac");
    @BeforeEach
    void beforeInit() {
        pobi.moveForwardByRandom(1);
        isaac.moveForwardByRandom(5);
        winners = Winners.calculateWinners(List.of(pobi, isaac));
    }

    @DisplayName("우승자 생성 함수 테스트")
    @Test
    void valueOf() {
        Winners.valueOf(List.of(Car.valueOf("pobi"), Car.valueOf("isaac")));
    }

    @DisplayName("우승자 계산 함수 테스트")
    @Test
    void calculateWinners() {
        assertThat(winners.getWinners()).contains(isaac).doesNotContain(pobi);
    }

    @DisplayName("우승자 이름 테스트")
    @Test
    void getWinnersNames() {
        assertThat(winners.getWinnersNames()).contains("isaac").doesNotContain("pobi");
    }
}
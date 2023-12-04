package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.utils.NumberGenerator;
import racingcar.utils.RandomGenerator;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    @DisplayName("차 생성 테스트")
    @Test
    void valueOf() {
        Car.valueOf("123");
    }

    @DisplayName("차 전진 테스트")
    @Test
    void moveForwardByRandom() {
        NumberGenerator numberGenerator = new RandomGenerator();
        Car car = Car.valueOf("isaac");

        assertRandomNumberInRangeTest(
                () -> {
                    car.moveForwardByRandom(numberGenerator);
                },
                MOVING_FORWARD
        );
    }

    @DisplayName("차 이름 가져오기 테스트")
    @Test
    void getName() {
        assertThat(Car.valueOf("isaac").getName()).isEqualTo("isaac");
    }

    @DisplayName("차의 거리 가져오기 테스트")
    @Test
    void getDistance() {
        NumberGenerator numberGenerator = new RandomGenerator();
        Car car = Car.valueOf("isaac");

        assertRandomNumberInRangeTest(
                () -> {
                    car.moveForwardByRandom(numberGenerator);
                    car.moveForwardByRandom(numberGenerator);
                    car.moveForwardByRandom(numberGenerator);
                },
                MOVING_FORWARD,
                MOVING_FORWARD,
                STOP
        );

        assertThat(car.getDistance()).isEqualTo(2);
    }

    @DisplayName("차 이름 예외 테스트")
    @Test
    void validateNameLength() {
        assertThatThrownBy(() -> Car.valueOf("isaacHana")).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("차 이름 예외 테스트")
    @Test
    void validateNameEmpty() {
        assertThatThrownBy(() -> Car.valueOf("")).isInstanceOf(IllegalArgumentException.class);
    }
}
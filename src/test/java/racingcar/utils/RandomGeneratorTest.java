package racingcar.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

class RandomGeneratorTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;
    @DisplayName("랜덤 번호 생성기 테스트")
    @Test
    void generate() {
        NumberGenerator numberGenerator = new RandomGenerator();

        assertRandomNumberInRangeTest(
                () -> {
                    assertThat(numberGenerator.generate()).isEqualTo(4);
                    assertThat(numberGenerator.generate()).isEqualTo(3);
                },
                MOVING_FORWARD, STOP
        );
        numberGenerator.generate();
    }
}
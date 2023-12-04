package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarsTest {
    @DisplayName("이름 생성 테스트")
    @Test
    void createCarsByNames() {
        Cars.createCarsByNames("pobi,java,woni");
    }

    @DisplayName("5글자 예외 테스트")
    @Test
    void createCarsByInvalidNames() {
        assertThatThrownBy(() -> Cars.createCarsByNames("pobi-java,woni")).isInstanceOf(IllegalArgumentException.class);
    }
}
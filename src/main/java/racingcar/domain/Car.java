package racingcar.domain;

import racingcar.utils.NumberGenerator;

public class Car {
    private static final int INITIAL_DISTANCE = 0;
    private static final int STANDARD_NUMBER = 4;
    private static final int INCREASED_DISTANCE = 1;

    private final String name;
    private int distance;

    private Car(String name) {
        name = name.trim();
        validateName(name);

        this.name = name;
        this.distance = INITIAL_DISTANCE;
    }

    public static Car valueOf(String name) {
        return new Car(name);
    }

    public void moveForwardByRandom(int randomNumber) {
        if (randomNumber >= STANDARD_NUMBER) {
            this.distance += INCREASED_DISTANCE;
        }
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    private void validateName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("[ERROR] 이름에 공백이 들어갈 수 없습니다.");
        }
        if (name.length() > 5) {
            throw new IllegalArgumentException("[ERROR] 이름은 5글자 이하여야 합니다.");
        }
    }
}

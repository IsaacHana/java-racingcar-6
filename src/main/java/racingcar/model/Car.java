package racingcar.model;

import racingcar.constants.Constants;
import racingcar.utils.RandomGenerator;

public class Car {
    private String name;
    private final StringBuilder distance;

    public Car(String name) {
        this.name = name;
        this.distance = new StringBuilder();
    }

    public String getName() {
        return name;
    }

    public String getDistance() {
        return distance.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void moveForward() {
        if (new RandomGenerator().generateRandomNumber() >= Constants.STANDARD_NUMBER.getIntValue())
            distance.append("-");
    }
}

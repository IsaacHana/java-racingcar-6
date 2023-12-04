package racingcar.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cars {
    private static final String DEFAULT_SEPARATOR = ",";
    private final List<Car> cars;

    private Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static Cars createCars(List<Car> cars) {
        return new Cars(cars);
    }

    public static Cars createCarsByNameArrays(String[] names) {
        return createCars(Arrays.stream(names).map(Car::valueOf).toList());
    }

    public static Cars createCarsByNames(String names, String separator) {
        return createCarsByNameArrays(names.split(separator));
    }

    public static Cars createCarsByNames(String names) {
        return createCarsByNames(names, DEFAULT_SEPARATOR);
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }

    public Car getCar(String searchCarName) {
        return cars.stream()
                .filter(name -> name.getName().equals(searchCarName))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 존재하지 않는 자동차 이름입니다."));
    }
}

package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> carList = new ArrayList<>();

    public void addCar(String name) {
        carList.add(new Car(name));
    }

    public void addCars(List<String> names) {
        for (String name : names) {
            addCar(name);
        }
    }

    public List<Car> getCarList() {
        return carList;
    }
}

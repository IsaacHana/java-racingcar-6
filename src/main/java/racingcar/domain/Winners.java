package racingcar.domain;

import java.util.Comparator;
import java.util.List;

public class Winners {
    private final Cars winners;

    private Winners(Cars winners) {
        this.winners = winners;
    }

    public static Winners valueOf(Cars winners) {
        return new Winners(winners);
    }

    public static Winners valueOf(List<Car> cars) {
        return valueOf(Cars.createCars(cars));
    }

    public static Winners calculateWinners(List<Car> cars) {
        int maxDistance = getMaxDistance(cars);

        return valueOf(cars.stream().filter(car -> car.getDistance() == maxDistance).toList());
    }

    private static int getMaxDistance(List<Car> cars) {
        return cars.stream()
                .max(Comparator.comparingInt(Car::getDistance))
                .get()
                .getDistance();
    }

    public List<String> getWinnersNames() {
        return winners.getCars().stream().map(Car::getName).toList();
    }
}

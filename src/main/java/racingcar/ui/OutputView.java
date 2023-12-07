package racingcar.ui;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.Winners;

public class OutputView {
    public static final String DISTANCE_MARK = "-";

    public static void printPrevRaceMessage() {
        System.out.printf("%n실행 결과%n");
    }

    public static void printRaceStatus(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.println(car.getName() + " : " + convertDistanceToMark(car.getDistance()));
        }
        System.out.println();
    }

    private static String convertDistanceToMark(int distance) {
        return DISTANCE_MARK.repeat(Math.max(0, distance));
    }

    public static void printRaceWinners(Winners winners) {
        System.out.printf("최종 우승자 : " + String.join(",", winners.getWinnersNames()));
    }
}

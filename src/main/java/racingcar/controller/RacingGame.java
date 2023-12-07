package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.RacingLaps;
import racingcar.domain.Winners;
import racingcar.ui.InputView;
import racingcar.ui.OutputView;

public class RacingGame {
    private Cars cars;
    private RacingLaps laps;
    private Winners winners;

    public void run() {
        collectInfo();
        race();
        announceWinners();
    }

    private void collectInfo() {
        collectCars();
        collectLaps();
    }

    private void collectCars() {
        cars = Cars.createCarsByNames(InputView.inputCars());
    }

    private void collectLaps() {
        laps = RacingLaps.valueOf(InputView.inputLaps());
    }

    private void race() {
        int initLaps = 0;

        OutputView.printPrevRaceMessage();
        while (laps.getLaps() != initLaps++) {
            OutputView.printRaceStatus(cars);
        }
    }

    private void calculateWinners() {
        winners = Winners.calculateWinners(cars.getCars());
    }

    private void announceWinners() {
        calculateWinners();
        OutputView.printRaceWinners(winners);
    }
}

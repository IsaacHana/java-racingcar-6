package racingcar.ui;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String inputCars() {
        System.out.printf("경주할 자동차 이름을 입력하세요.(이름은 쉼표(%s) 기준으로 구분)%n", ",");
        return Console.readLine();
    }

    public static String inputLaps() {
        System.out.printf("시도할 회수는 몇회인가요?%n");
        return Console.readLine();
    }
}

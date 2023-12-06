package racingcar.domain;

public class RacingLaps {
    private final int laps;

    private RacingLaps(int laps) {
        this.laps = laps;
    }

    public static RacingLaps valueOf(int laps) {
        return new RacingLaps(laps);
    }
}

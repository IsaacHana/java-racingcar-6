package racingcar.domain;

public class RacingLaps {
    private final int laps;

    private RacingLaps(int laps) {
        this.laps = laps;
    }

    public static RacingLaps valueOf(int laps) {
        return new RacingLaps(laps);
    }

    public static RacingLaps valueOf(String laps) {
        try {
            return valueOf(Integer.valueOf(laps));
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Integer 로 표현할 수 없는 문자입니다.");
        }
    }

    public int getLaps() {
        return laps;
    }
}

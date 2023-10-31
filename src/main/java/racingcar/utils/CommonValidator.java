package racingcar.utils;

import racingcar.enums.Common;

import java.util.Arrays;
import java.util.HashSet;

public class CommonValidator {
    public static boolean isOverMaxLength(String input) {
        return input.length() > Common.CAR_NAME_MAX_LENGTH.getIntValue();
    }

    public static boolean isNumeric(String input) {
        try {
            Integer.valueOf(input);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static boolean isPositive(int input) {
        return input > 0;
    }

    public static boolean isPositive(String input) {
        try {
            int number = Integer.valueOf(input);
            return isPositive(number);
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static boolean isDuplicate(String[] input) {
        int inputLength = input.length;
        return inputLength == new HashSet<>(Arrays.asList(input)).size();
    }
}

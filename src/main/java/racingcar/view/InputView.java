package racingcar.view;

import racingcar.type.ErrorType;
import racingcar.type.ValueType;

import java.util.*;

/**
 * InputView.java : 입력에 대한 클래스
 *
 * @author Daeun Lee
 * @version 1.1
 */
public class InputView {
    public static String scanRacingCars(Scanner scanner) {
        OutputView.printCarNamesText();
        return scanner.nextLine();
    }

    public static int scanTimes(Scanner scanner) {
        OutputView.printRacingTimesText();

        isValidCharacter(scanner);
        int times = scanner.nextInt();
        isValidTimes(times);

        return times;
    }

    public static void isValidCharacter(Scanner scanner) {
        if (!scanner.hasNextInt()) {
            throw new IllegalArgumentException(ErrorType.INVALID_CHARACTER.getError());
        }
    }

    public static void isValidTimes(int times) {
        if (times <= ValueType.ZERO.getValue()) {
            throw new IllegalArgumentException(ErrorType.INVALID_ZERO_TIME.getError());
        }
    }
}

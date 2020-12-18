package racingcar.view;

import racingcar.domain.Car;
import racingcar.type.ErrorType;
import racingcar.type.TextType;

/**
 * OutputView.java : 출력을 위한 클래스
 *
 * @author Daeun Lee
 * @version 1.1
 */
public class OutputView {
    public static void printNewLine() {
        System.out.println();
    }

    public static void printCarNamesText() {
        System.out.println(TextType.CAR_NAMES_TEXT.getText());
    }

    public static void printRacingTimesText() {
        System.out.println(TextType.RACING_TIMES_TEXT.getText());
    }

    public static void printResultText() {
        System.out.println(TextType.RESULT_TEXT.getText());
    }

    public static void printResult(Car car, StringBuffer carPosition) {
        System.out.println(car.getName() + " : " + carPosition);
    }

    public static void printNoWinner() {
        System.out.println(ErrorType.NO_WINNER.getError());
    }

    public static void printWinner(String result) {
        printWinnerText();
        System.out.println(result);
    }

    public static void printWinnerText() {
        System.out.print(TextType.WINNER_TEXT.getText());
    }
}

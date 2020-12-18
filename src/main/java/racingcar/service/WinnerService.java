package racingcar.service;

import racingcar.domain.Car;
import racingcar.type.TextType;
import racingcar.type.ValueType;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;

/**
 * Winner.java : 우승자에 대한 클래스
 *
 * @author Daeun Lee
 * @version 1.1
 */
public class WinnerService {
    public static void showWinner(List<Car> cars) {
        List<Integer> carPositions = PositionService.getPosition(cars);
        int maxPosition = PositionService.getMaxPosition(carPositions);
        List<String> winner = getWinner(cars, maxPosition);

        checkWinner(winner);
    }

    public static List<String> getWinner(List<Car> cars, int maxPosition) {
        List<String> winner = new ArrayList<>();

        for (Car car : cars) {
            if (isMaxPosition(car, maxPosition)) {
                winner.add(car.getName());
            }
        }
        return winner;
    }

    public static boolean isMaxPosition(Car car, int maxPosition) {
        return car.getPosition() == maxPosition;
    }

    public static void checkWinner(List<String> winner) {
        if (winner.size() == ValueType.ZERO.getValue()) {
            isNoWinner();
        }
        if (winner.size() != ValueType.ZERO.getValue()) {
            isWinner(winner);
        }
    }

    public static void isNoWinner() {
        OutputView.printNoWinner();
    }

    public static void isWinner(List<String> winner) {
        // Java API 활용
        String result = String.join(TextType.COMMA_WITH_BLANK_TEXT.getText(), winner);

        OutputView.printWinner(result);
    }
}

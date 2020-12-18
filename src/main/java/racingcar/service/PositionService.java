package racingcar.service;

import racingcar.domain.Car;
import racingcar.type.TextType;

import java.util.ArrayList;
import java.util.List;

/**
 * Position.java : 위치에 대한 클래스
 *
 * @author Daeun Lee
 * @version 1.1
 */
public class PositionService {
    public static StringBuffer drawPosition(Car car) {
        StringBuffer carPosition = new StringBuffer();

        for (int i = 0; i < car.getPosition(); i++) {
            carPosition.append(TextType.LINE_TEXT.getText());
        }
        return carPosition;
    }

    public static List<Integer> getPosition(List<Car> cars) {
        List<Integer> carPositions = new ArrayList<>();

        for (Car car : cars) {
            carPositions.add(car.getPosition());
        }
        return carPositions;
    }

    public static int getMaxPosition(List<Integer> carPositions) {
        int maxPosition = 1;

        for (int currentPosition : carPositions) {
            if (maxPosition <= currentPosition) {
                maxPosition = currentPosition;
            }
        }
        return maxPosition;
    }
}

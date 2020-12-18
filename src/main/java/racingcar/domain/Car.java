package racingcar.domain;

import racingcar.type.BoundaryType;
import racingcar.type.ErrorType;
import racingcar.type.TextType;

/**
 * Car.java : 자동차에 대한 클래스
 *
 * @author Daeun Lee
 * @version 1.1
 */
public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        // 일급 컬렉션
        isValidCar(name);
        this.name = name;
    }

    // 추가 기능 구현
    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void movePosition() {
        position++;
    }

    public static void isValidCar(String carName) {
        isValidLength(carName);
        isValidFormat(carName);
    }

    public static void isValidLength(String carName) {
        if ((carName.length() < BoundaryType.MINIMUM_CAR_NAME_LENGTH.getBoundary()
                || (carName.length() > BoundaryType.MAXIMUM_CAR_NAME_LENGTH.getBoundary()))) {
            throw new IllegalArgumentException(ErrorType.INVALID_LENGTH.getError());
        }
    }

    public static void isValidFormat(String carName) {
        if (carName.contains(TextType.BLANK_TEXT.getText())) {
            throw new IllegalArgumentException(ErrorType.INVALID_FORMAT.getError());
        }
    }
}

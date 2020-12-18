package racingcar.type;

/**
 * BoundaryType.java : 최소, 최대 경계 값 상수를 모아둔 Enum 클래스
 *
 * @author Daeun Lee
 * @version 1.1
 */
public enum BoundaryType {
    MINIMUM_MOVE_NUMBER(4),
    MAXIMUM_MOVE_NUMBER(9),

    MINIMUM_RANDOM_NUMBER(0),
    MAXIMUM_RANDOM_NUMBER(9),

    MINIMUM_CAR_NAME_LENGTH(1),
    MAXIMUM_CAR_NAME_LENGTH(5);

    private final int boundary;

    BoundaryType(int boundary) {
        this.boundary = boundary;
    }

    public int getBoundary() {
        return boundary;
    }
}

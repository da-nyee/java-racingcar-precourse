package racingcar.domain;

import racingcar.type.BoundaryType;
import utils.RandomUtils;

/**
 * RandomNumber.java : random 값에 대한 클래스
 *
 * @author Daeun Lee
 * @version 1.0
 */
public class RandomNumber {
    /**
     * @return 0~9 사이의 random 값
     */
    public static int generateRandomNumber() {
        return RandomUtils.nextInt(BoundaryType.MINIMUM_RANDOM_NUMBER.getBoundary(),
                BoundaryType.MAXIMUM_RANDOM_NUMBER.getBoundary());
    }
}

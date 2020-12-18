package racingcar.service;

import racingcar.type.BoundaryType;
import utils.RandomUtils;

/**
 * RandomNumber.java : random 값에 대한 클래스
 *
 * @author Daeun Lee
 * @version 1.1
 */
public class RandomService {
    public static int generateRandom() {
        return RandomUtils.nextInt(BoundaryType.MINIMUM_RANDOM_NUMBER.getBoundary(),
                BoundaryType.MAXIMUM_RANDOM_NUMBER.getBoundary());
    }
}

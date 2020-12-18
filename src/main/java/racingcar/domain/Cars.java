package racingcar.domain;

import racingcar.type.ErrorType;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Daeun Lee
 * @version 1.1
 */
public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        // 일급 컬렉션
        isDuplicate(cars);
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public static void isDuplicate(List<Car> cars) {
        Set<String> distinctCars = getDistinctCars(cars);

        if (cars.size() != distinctCars.size()) {
            throw new IllegalArgumentException(ErrorType.INVALID_DUPLICATION.getError());
        }
    }

    public static Set<String> getDistinctCars(List<Car> cars) {
        Set<String> distinctCars = new HashSet<>();

        for (Car car : cars) {
            distinctCars.add(car.getName());
        }
        return distinctCars;
    }
}

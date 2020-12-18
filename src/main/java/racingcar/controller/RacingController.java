package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.service.RacingService;
import racingcar.service.WinnerService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.*;

/**
 * CarRacing.java : 자동차 경주 게임에 대한 클래스
 *
 * @author Daeun Lee
 * @version 1.1
 */
public class RacingController {
    private static int times;

    public static void runRacing(Scanner scanner) {
        Cars cars = startRacing(scanner);
        playRacing(cars);
        finishRacing(cars);
    }

    public static Cars startRacing(Scanner scanner) {
        Cars cars = initializeCars(scanner);
        times = initializeTimes(scanner);

        OutputView.printNewLine();
        return cars;
    }

    public static Cars initializeCars(Scanner scanner) {
        String racingCars = InputView.scanRacingCars(scanner);

        List<String> carNames = RacingService.getCarNames(racingCars);
        List<Car> cars = RacingService.getCarsFromNames(carNames);
        return RacingService.getCars(cars);
    }

    public static int initializeTimes(Scanner scanner) {
        return InputView.scanTimes(scanner);
    }

    public static void playRacing(Cars cars) {
        OutputView.printResultText();

        for (int i = 0; i < times; i++) {
            for (Car car : cars.getCars()) {
                RacingService.moveCar(car);
            }
            RacingService.showResult(cars.getCars());
            OutputView.printNewLine();
        }
    }

    public static void finishRacing(Cars cars) {
        WinnerService.showWinner(cars.getCars());
    }
}

package racingcar;

import racingcar.controller.RacingController;

import java.util.Scanner;

/**
 * Application.java : 메인 클래스
 *
 * @author Daeun Lee
 * @version 1.1
 */
public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행
        RacingController.runRacing(scanner);
    }
}

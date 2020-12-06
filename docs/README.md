# 미션 - 자동차 경주 게임
우아한테크코스 웹 백엔드 프리코스 2주차 미션 프로젝트입니다.

<br>

## 👩‍💻 구현할 기능 목록
### 사용자
- [x] 사용자는 자동차에 이름을 부여한다.
    - [x] 자동차 이름은 쉼표(,)를 기준으로 구분한다.
    - [x] 자동차 이름은 5자 이하만 가능하다.
    - [x] 비정상적인 입력에 대해서는 예외를 발생시킨다. `예외 1`
- [x] 사용자는 몇 번의 이동을 할 것인지, 시도할 횟수를 입력한다.
    - [x] 비정상적인 입력에 대해서는 예외를 발생시킨다. `예외 2`

### 자동차
- [x] 주어진 횟수만큼 게임이 진행된다.
    - [x] n대의 자동차는 전진 또는 멈춘다.
    - [x] 실행 결과를 나타낼 때 자동차 이름을 같이 출력한다.

### 프로그램
- [x] 0~9 사이에서 random 값을 구한다.
    - [x] 자동차는 random >= 4일 경우 전진한다.
    - [x] 자동차는 random <= 3일 경우 멈춘다.

### 게임 완료
- [x] 주어진 횟수가 끝나면 게임은 완료된다.
    - [x] 누가 우승했는지 알려준다.
         - [x] 우승자는 한 명 이상일 수 있다.
         - [x] 우승자는 없을 수 있다. `예외 3`

### 예외 처리
- [x] 예외 상황 시 에러 문구를 출력한다.
    - [x] 에러 문구는 `[ERROR]`로 시작한다.
- [x] `예외 1-1` 자동차 이름의 길이가 1자 미만 또는 5자 초과인 경우
- [x] `예외 1-2` 자동차 이름에 공백이 있는 경우
- [x] `예외 1-3` 자동차 이름이 중복되는 경우
- [x] `예외 2-1` 시도할 횟수에 음수 또는 0이 입력되는 경우
- [x] `예외 2-2` 시도할 횟수에 문자가 입력되는 경우
- [x] `예외 3` 모든 자동차가 출발 지점에 있는 경우

<br>

## ✅ 확인할 프로그래밍 목록
### 요구사항
- [x] 자바 코드 컨벤션을 지키면서 프로그래밍한다.
- [x] 들여쓰기는 `4 spaces`로 한다.
- [x] (1 <= indent depth) && (indent depth <= 2)이다.
- [x] 3항 연산자를 쓰지 않는다.
- [x] 함수의 길이는 `15라인`을 넘지 않는다.
    - [x] 함수가 한 가지 일만 하도록 최대한 작게 만든다.
- [x] else 예약어를 쓰지 않는다.
    - [x] `early return`하는 코드를 작성한다.
    - [x] switch/case 문도 사용하지 않는다.

### 추가사항
- [x] 코드 리팩토링을 진행한다.
    - [x] 함수를 분리한다.
    - [x] 클래스를 분리한다.
- [x] 주석을 Javadoc 형태로 변경한다.
- [ ] README 문서를 상세하게 작성한다.

<br>

## 📂 완성된 디렉토리 구조
```
└─java-racingcar-precourse
    │
    ├─docs
    │   └─README.md
    └─src
        └─main
            └─java
                ├─racingcar
                │   ├─domain
                │   │   ├─Car.java
                │   │   ├─CarRacing.java
                │   │   ├─Initialization.java
                │   │   ├─Position.java
                │   │   ├─RandomNumber.java
                │   │   ├─Result.java
                │   │   └─Winner.java
                │   ├─type
                │   │   ├─BoundaryType.java
                │   │   ├─ErrorType.java
                │   │   ├─TextType.java
                │   │   └─ValueType.java
                │   ├─view
                │   │   ├─InputView.java
                │   │   └─OutputView.java
                │   └─Appication.java
                └─utils
                    ├─InputUtils.java
                    └─RandomUtils.java
```

## 📝 License

This project is [MIT](https://github.com/woowacourse/java-racingcar-precourse/blob/master/LICENSE) licensed.

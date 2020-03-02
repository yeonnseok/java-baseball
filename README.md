### **기능 요구사항**

- 1부터 9까지 서로 다른 수로 이루어진 3자리 수를 맞추는 게임
- 같은 수가 같은 자리에 있으면 스트라이크, 다른자리에 있으면 볼, 같은 수가 전혀 없으면 "낫싱"이란 힌트를 주고 힌트를 이용해서 3자리 수를 맞추면 승리한다.
- 컴퓨터가 임의의 3자리 수를 생성하고 사용자는 컴퓨터가 생성한 3개의 숫자를 입력하고, 컴퓨터로부터 입력한 숫자에 대한 결과를 받는다.
- 이 과정을 반복해서 컴퓨터가 선택한 3개의 숫자를 맞추면 게임이 종료된다.
- 게임 종료 후 게임을 다시 시작하거나 완전히 종료할 수 있다.

### 프로그래밍 요구사항

- 자바 코드 컨벤션을 지킨다.
- indent depth를 3이 넘지 않도록 구현한다.
- 3항 연산자를 쓰지 않는다.
- 함수(메소드)가 한가지 일만 하도록 최대한 작게 만든다.

### 객체 구조 및 기능 목록
### domain
- PlayerNo
- ComputerNo
- UserNo
- BallNumberGenerator [interface]
- RandomBallNumberGenerator
- UserBallNumberGenerator
- BallNumber
- BallNumbers
- CountResult
- Flag [enum]

### controller
- BaseBallGame
- Main

### view
- InputView
- OutputView

# java-baseball
온라인 코드리뷰 스터디  
숫자야구게임 TDD 연습

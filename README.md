# java-baseball
온라인 코드리뷰 스터디  
숫자야구게임 TDD 연습

- 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.

---
## 기능 목록
1. 중복없는 랜덤한 3개의 숫자를 생성한다.
2. 게임 참여자의 숫자를 입력받는다.
    - [ ] 입력한 값이 숫자인지 확인한다.
    - [ ] 입력한 값이 중복되는지 확인한다.
    - [ ] 입력한 값이 1~9 사이에 있는지 확인한다.
    - [ ] 3개의 숫자를 입력했는지 확인한다.
3. 맞춘 숫자에 따라 스트라이크, 볼, 낫싱을 출력한다.
    - 숫자가 존재하며, 같은 자리에 있으면 스트라이크
    - 숫자는 존재하지만, 다른 자리에 있으면 볼
    - 어떠한 숫자도 포함되어 있지 않으면 낫싱
4. 3스트라이크인 경우, 해당 게임을 종료한다.
5. 게임이 종료된 후, 사용자에게 새로운 게임을 할지 입력받는다.
    - [ ] 입력한 값이 숫자인지 확인한다.
    - [ ] 입력한 값이 1(시작) 또는 2(종료)인지 확인한다.

## 구조
#### main
- Main
    - main 함수
    
#### domain
- BaseballGame
    - controller의 역할을 한다.
    - 게임을 종료 혹은 재시작한다.
- Player
    - List<Ball> playerBalls
    - 경기 결과가 한 번 출력될때마다 playerBalls를 초기화한다.

- Computer
    - List<Ball> computerBalls
    - PlayerBalls와 매칭한다.
    
- Ball
    - int ball
    - 입력된 숫자를 검증한다.
     
- Judge
    - Map<BallMatch, Integer> gameResult
    - 경기의 결과를 구한다.
    - 스트라이크, 볼의 개수를 센다.
    - 3 스트라이크인지 확인한다.
    
- BallMatch
    - ENUM 이다.
    - STRIKE("스트라이크"), BALL("볼"), NONE("낫싱")

- RandomNumber
    - 랜덤한 수를 생성한다.
    
- Generator
    - 인터페이스
    - generate() : 숫자를 만든다.

- ManualNumberGenerator
    - Generator를 implements 한다.
    - generate() : 지정한 숫자를 만들어낸다.

- RandomNumberGenerator
    - Generator를 implements 한다.
    - generate() : 랜덤한 숫자를 만들어낸다.
    
#### view
- InputView
    - 사용자로부터 값을 입력받는다.
    - 숫자가 아닌 경우 예외처리한다.
- OutputView
    - 게임 진행 멘트를 출력한다.
    - 결과를 출력한다.

## 프로그래밍 요구사항
1. indent는 1까지 허용한다.
2. 모든 코딩은 TDD 방식으로 한다.
3. else 예약어를 사용하지 않는다.
4. 자바 컨벤션을 지킨다.
5. 기타 등등.. 알아서 잘 지킬 것.
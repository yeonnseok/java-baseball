# java-baseball
온라인 코드리뷰 스터디  
숫자야구게임 TDD 연습

### 요구사항 정리
- 1부터 9 까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임
- 같은 수가 같은 자리 -> 스트라이크
- 같은 수가 다른 자리 -> 볼
- 수가 전혀 포함되지 않으면 -> 낫싱 or 포볼
- 상대방의 역할은 컴퓨터가 한다 -> 컴퓨터가 먼저 3자리의 수를 만든 후 게임이 시작된다
- 컴퓨터가 선택한 숫자를 맞추면 게임 종료
- 게임의 다시 시작 또는 완전한 종료를 사용자가 선택할 수 있다

### 설계
- Computer
    - 임의로 생성된 BaseballNumber 를 갖는다
    - 사용자가 입력한 수와 BaseballNumber 를 비교해 게임의 결과를 판단한다
- BaseballNumber
    - 숫자 하나의 원시값을 포장하는 클래스
    - 0 이하의 수는 안된다
    - 1 ~ 9 중에 하나만 허용된다
- BaseballNumbers
    - BaseballNumber 를 갖는 일급 콜렉션
    - 3자리어야 한다
    - 중복된 숫자가 없다
- RandomNumberGenerator
    - 컴퓨터가 갖는 임의의 BaseballNumber 를 생성해준다
- GameContinue
    - 게임 재개를 선택하는 원시값을 포장하는 클래스
    - 1 또는 2 만 가능하다
- PlayerBaseballNumbersGenerator
    - 사용자가 입력한 BaseballNumbers 를 생성한다
- Result
    - 결과를 담고 있는 클래스
- StrikeCount
    - 컴퓨터의 수와 사용자의 수를 비교했을 때 스트라이크의 개수
- BallCount
    - 컴퓨터의 수와 사용자의 수를 비교했을 때 볼의 개수





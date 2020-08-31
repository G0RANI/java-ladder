#2단계 - 사다리(생성)

## 기능 요구사항
* 사다리 게임에 참여하는 사람에 이름을 최대5글자까지 부여할 수 있다. 사다리를 출력할 때 사람 이름도 같이 출력한다.
* 사람 이름은 쉼표(,)를 기준으로 구분한다.
* 사람 이름을 5자 기준으로 출력하기 때문에 사다리 폭도 넓어져야 한다.
* 사다리 타기가 정상적으로 동작하려면 라인이 겹치지 않도록 해야 한다.
    * |-----|-----| 모양과 같이 가로 라인이 겹치는 경우 어느 방향으로 이동할지 결정할 수 없다.

## 프로그래밍 요구사항
* 자바 8의 스트림과 람다를 적용해 프로그래밍한다.
* 규칙 6: 모든 엔티티를 작게 유지한다.

## Feature List
### Domain
1. 좌표 클래스 작성 후 실행 결과 예시로 기대 대로 동작하는지 테스트
    * Direction class (가로 영역 내에서 어디로 이동해야 하는지 나타내는 enum 클래스)
    * Point class (가로 영역의 좌표와 다음 Point의 방향을 지니는 사다리 | 모양에 해당하는 단위 클래스)
    * Coordinate class (좌표는 최소 0부터 시작하므로 primitive type int를 감쌀 Wrapper Class)
2. 가로 축을 나타내는 좌표 클래스의 일급 컬렉션 작성
    * 생성 책임에 가로 라인이 겹치지 않게 하는 것이 필요함
        * 왼쪽부터 오른쪽으로 생성한다고 했을 때
            * 이전이 Right였으면 무조건 Left
            * 이전이 Left였으면 무조건 !Left
            * 이전이 Down이였으면 무조건 !Left
    * Point 생성 책임을 지닌 클래스 생성
    * Line 생성 책임을 지닌 클래스 생성
    * 랜덤한 Direction을 생성하기 위해 Random 객체 사용이 필요하나, 테스트가 용이하게 random성을 가지는 부분을 따로 분리할 것.
3. 참가자를 나타내는 클래스 작성 
4. 사다리를 나타내는 클래스 작성
    * 사다리 높이를 나타내는 int Wrapper class 생성
    * Ladder 생성을 책임지는 클래스 생성
    * 입력 받은 참가자 수와, 사다리 높이를 전달하는 dto 클래스 생성
5. VIEW 클래스 작성
    * 입력 받는 클래스 작성
    * 사다리게임 세팅된 내용을 출력하는 클래스 작성
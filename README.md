# 🚀 3단계 - 사다리(게임 실행)

## 기능 요구사항

- 사다리 실행 결과를 출력해야 한다.
- 개인별 이름을 입력하면 개인별 결과를 출력하고, "all"을 입력하면 전체 참여자의 실행 결과를 출력한다.

## 프로그래밍 요구사항

- 자바 8의 스트림과 람다를 적용해 프로그래밍한다.
- 규칙 6: 모든 엔티티를 작게 유지한다.
- **규칙 7: 3개 이상의 인스턴스 변수를 가진 클래스를 쓰지 않는다.**

#### 실행 결과

- 위 요구사항에 따라 4명의 사람을 위한 5개 높이 사다리를 만들 경우, 프로그램을 실행한 결과는 다음과 같다.

```plaintext
참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)
pobi,honux,crong,jk

실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)
꽝,5000,꽝,3000

최대 사다리 높이는 몇 개인가요?
5

사다리 결과

pobi  honux crong   jk
    |-----|     |-----|
    |     |-----|     |
    |-----|     |     |
    |     |-----|     |
    |-----|     |-----|
꽝    5000  꽝    3000

결과를 보고 싶은 사람은?
pobi

실행 결과
꽝

결과를 보고 싶은 사람은?
all

실행 결과
pobi : 꽝
honux : 3000
crong : 꽝
jk : 5000
```

## 힌트

- 각 로직을 구현하기 위해 필요한 데이터를 가지는 객체를 분리하기 위해 노력해본다. 로직 구현에 필요한 데이터를 가지는 객체를 잘 분리하면 의외로 쉽게 문제를 해결할 수 있다.
- 각 객체가 2개 이하의 인스턴스 변수만을 가지도록 구현해 본다.

## 기능 목록

* [x] 사다리
    * [x] 이름
        * [x] 이름을 5글자 까지 가질 수 있다
        * [x] 이름을 공백을 가질 수 없다
    * [x] 라인 컬렉션
        * [x] 시작점을 기준하여 라인들을 바탕으로 결과 포인트를 알 수 있다
    * [x] 라인
        * [x] 입력된 숫자 만큼 좌표값 리스트를 가진다
        * [x] 인접한 좌표들중에 생성된 좌표 중 이동 가능한 좌표가 있는지 확인 가능하다
        * [x] 라인을 그릴 수 있다
        * [x] 어느 좌표로 이동할지 계산 할 수 있다
    * [x] 높이
        * [x] 1 이상의 숫자를 받을 수 있다
    * [x] 결과
        * [x] 사다리와 결과를 통해서 리포트를 생성 할 수 있다

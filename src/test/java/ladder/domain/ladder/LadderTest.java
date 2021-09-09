package ladder.domain.ladder;

import static ladder.domain.ladder.Ladder.createLadder;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ladder.domain.user.User;
import ladder.domain.user.Users;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LadderTest {

    @Test
    @DisplayName("사다리 높이를 받아 사다리를 만들 수 있다.")
    void createLadderTest() {
        // given
        LadderHeight height = new LadderHeight(2);
        Line line = new Line(Arrays.asList(new Point(0, false, true),
            new Point(1, true, false),
            new Point(2, false, true),
            new Point(3, true, false)));
        List<Line> lines = Arrays.asList(line, line);
        Users users = Users.of("pobi,honux,crong,jk");
        Ladder expected = new Ladder(lines);

        // when
        Ladder result = createLadder(height, users, () -> true);

        // then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("현재 위치의 사람이 사다리를 내려갔을 때 위치를 알 수 있다.")
    void getLastPositionTest() {

        // given
        LadderHeight height = new LadderHeight(3);
        Users users = Users.of("pobi,honux,crong,jk");
        Ladder ladder = createLadder(height, users, () -> true);

        int start = 0;

        // when
        int result = ladder.calculateEndPoint(start);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName("현재 위치의 사람이 사다리를 내려갔을 때 위치를 알 수 있다.")
    void getLastPosition2Test() {

        // given
        LadderHeight height = new LadderHeight(3);
        Users users = Users.of("pobi,honux,crong,jk");
        Ladder ladder = createLadder(height, users, () -> false);

        int start = 0;

        // when
        int result = ladder.calculateEndPoint(start);

        // then
        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("사다리 게임에 대한 결과를 반환할 수 있다.")
    void getLadderResultTest() {

        // given
        Users users = Users.of("pobi,honux,crong,jk");
        LadderEndPoints endPoints = LadderEndPoints.from("꽝,5000,꽝,3000", users);
        LadderHeight height = new LadderHeight(5);
        Ladder ladder = createLadder(height, users, () -> true);

        Map<User, String> map = new HashMap<>();
        map.put(new User("pobi"), "5000");
        map.put(new User("honux"), "꽝");
        map.put(new User("crong"), "3000");
        map.put(new User("jk"), "꽝");
        LadderResult expected = new LadderResult(map);

        // when
        LadderResult result = ladder.createResult(users, endPoints);

        // then
        assertThat(result).isEqualTo(expected);
    }

}

package racingcar.Model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class MovementTest {
    @Test
    @DisplayName("4이상은 전진, 3이하는 멈춤")
    public void testMovementStatus() {
        assertThat(Movement.move(9)).isEqualTo(Movement.GO);
        assertThat(Movement.move(4)).isEqualTo(Movement.GO);
        assertThat(Movement.move(3)).isEqualTo(Movement.STOP);
        assertThat(Movement.move(0)).isEqualTo(Movement.STOP);
    }

    @Test
    @DisplayName("총 이동 횟수 반환")
    public void testCarMap() {
        MovementList movementList = new MovementList(Arrays.asList(Movement.GO, Movement.STOP, Movement.GO));
        assertThat(movementList.countNumberOfGo()).isEqualTo(2);
        movementList = new MovementList(Arrays.asList(Movement.STOP, Movement.STOP, Movement.STOP));
        assertThat(movementList.countNumberOfGo()).isEqualTo(0);
    }
}

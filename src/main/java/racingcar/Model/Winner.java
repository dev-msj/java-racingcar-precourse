package racingcar.Model;

import java.util.ArrayList;
import java.util.List;

public class Winner {
    private final List<String> winnerList = new ArrayList<>();

    public void addWinner(String carName) {
        this.winnerList.add(carName);
    }

    public String toString() {
        return String.format("최종 우승자: %s", String.join(", ", this.winnerList));
    }
}

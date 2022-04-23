package racingcar.Model.Car;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.Model.Movement.Movement;
import racingcar.Model.Movement.Movements;

import java.util.ArrayList;

public class Car {
    private final String name;
    private final Movements movements;

    public Car(String name) {
        this.name = name;
        this.movements = new Movements(new ArrayList<Movement>());
    }

    public String getName() {
        return this.name;
    }

    public void move() {
        this.movements.addMovement(Movement.move(Randoms.pickNumberInRange(0, 9)));
    }

    public int getMovingAmount() {
        return this.movements.countNumberOfGo();
    }

    public boolean isEqualMaxMovingAmount(int maxMovingAmount) {
        return maxMovingAmount == this.movements.countNumberOfGo();
    }
}

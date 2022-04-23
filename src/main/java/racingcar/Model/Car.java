package racingcar.Model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;

public class Car {
    private final String name;
    private final MovementList movementList;

    public Car(String name) {
        this.name = name;
        this.movementList = new MovementList(new ArrayList<Movement>());
    }

    public String getName() {
        return this.name;
    }

    public void move() {
        this.movementList.addMovement(Movement.move(Randoms.pickNumberInRange(0, 9)));
    }

    public int getMovingAmount() {
        return movementList.countNumberOfGo();
    }
}

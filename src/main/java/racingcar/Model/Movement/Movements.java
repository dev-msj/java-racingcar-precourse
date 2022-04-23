package racingcar.Model.Movement;

import racingcar.Util.Constant;

import java.util.List;

public class Movements {
    private final List<Movement> movementList;
    private int goAmount = Constant.INITIALAMOUNT;

    public Movements(List<Movement> movementList) {
        this.movementList = movementList;
    }

    public void addMovement(Movement movement) {
        this.movementList.add(movement);
    }

    public int countNumberOfGo() {
        this.movementList.forEach(this::countGo);

        return this.goAmount;
    }

    private void countGo(Movement movement) {
        if (movement.isGo(movement)) {
            this.goAmount++;
        }
    }
}

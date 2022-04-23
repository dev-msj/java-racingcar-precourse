package racingcar.Model;

public enum Movement {
    STOP, GO;

    public static Movement move(int pickedNumber) {
        if (pickedNumber >= 4){
            return GO;
        }

        return STOP;
    }

    public boolean isGo(Movement movement) {
        return movement == GO;
    }
}

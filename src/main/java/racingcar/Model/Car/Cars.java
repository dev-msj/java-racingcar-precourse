package racingcar.Model.Car;

import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public void play(int movingAmount) {
        this.carList.forEach(car -> moveCar(car, movingAmount));
    }

    private void moveCar(Car car, int movingAmount) {
        for (int i = 0; i < movingAmount; i++) {
            car.move();
        }
    }

    public List<Car> getCars() {
        return this.carList;
    }
}

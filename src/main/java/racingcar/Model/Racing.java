package racingcar.Model;

import racingcar.Model.Car.Car;
import racingcar.Model.Car.Cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Racing {
    private final User user;
    private final Winner winner = new Winner();
    private Cars cars;

    public Racing(User user) {
        this.user = user;

        createCar();
    }

    private void createCar() {
        List<Car> carList = new ArrayList<>();
        for (String carName : this.user.getCarNameArray()) {
            carList.add(new Car(carName));
        }

        this.cars = new Cars(carList);
    }

    public void gameStart() {
        this.cars.play(user.getMovingAmount());
        findWinner();
    }

    private void findWinner() {
        makeWinner(findMaxMovingAmount());
    }

    private int findMaxMovingAmount() {
        List<Integer> movingAmountList = new ArrayList<>();
        for (Car car : this.cars.getCars()) {
            movingAmountList.add(car.getMovingAmount());
        }

        return Collections.max(movingAmountList);
    }

    private void makeWinner(int maxMovingAmount) {
        for (Car car : this.cars.getCars()) {
            findWinnerCarName(maxMovingAmount, car);
        }
    }

    private void findWinnerCarName(int maxMovingAmount, Car car) {
        if (car.isEqualMaxMovingAmount(maxMovingAmount)) {
            this.winner.addWinner(car.getName());
        }
    }

    public Cars getCars() {
        return cars;
    }

    public Winner getWinner() {
        return winner;
    }
}

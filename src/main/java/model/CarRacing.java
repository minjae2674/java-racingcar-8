package model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;

public class CarRacing {
    private int carCount;
    private ArrayList<Car> cars = new ArrayList<>();

    public RacingDto racing(String[] names, int cycle) {
        preparingCar(names);
        racingStart(cycle);
        ArrayList<String> winner = racingWinner(cars);
        return new RacingDto(cars, winner, cycle);
    }
    public void preparingCar(String[] names) {
        carCount = names.length;
        for (int i = 0; i < carCount; i++) {
            cars.add(new Car(names[i]));
        }
    }

    public void racingStart(int cycle) {
        for (int i = 0; i < cycle; i++) {
            for (int j = 0; j < carCount; j++) {
                int randomNumber = Randoms.pickNumberInRange(0, 9);
                cars.get(j).move(randomNumber);
            }
        }
    }
    public ArrayList<String> racingWinner(ArrayList<Car> cars) {
        int max = -1;
        ArrayList<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getDistance() > max) {
                max = car.getDistance();
            }
        }
        for (Car car : cars) {
            if (car.getDistance() >= max) {
                winners.add(car.getName());
            }
        }
        return winners;
    }

}

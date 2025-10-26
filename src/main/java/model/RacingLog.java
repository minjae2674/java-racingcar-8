package model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RacingLog {
    private ArrayList<Car> cars;
    private ArrayList<String> winner;

    public RacingLog(ArrayList<Car> cars, ArrayList<String> winner) {
        this.cars = cars;
        this.winner = winner;
    }

    public ArrayList<String> getWinner() {
        return winner;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
}

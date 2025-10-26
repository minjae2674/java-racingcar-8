package model;

import java.util.*;

public class RacingDto {
    private Map<String, List<Boolean>> racingLog = new LinkedHashMap<>();
    private ArrayList<String> winner;
    private int cycle;

    public RacingDto(ArrayList<Car> cars, ArrayList<String> winner, int cycle) {
        recordCars(cars);
        this.winner = winner;
        this.cycle = cycle;
    }

    public ArrayList<String> getWinner() {
        return winner;
    }

    public int getCycle() {
        return cycle;
    }

    public void recordCars(List<Car> cars) {
        for (Car car : cars) {
            racingLog.put(car.getName(), car.getHistory());
        }
    }

    public Map<String, List<Boolean>> getRacingLog() {
        return racingLog;
    }

}

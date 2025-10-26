package model;

import java.util.ArrayList;

public class Car {
    private String name;
    private ArrayList<Boolean> moveHistory = new ArrayList<>();
    private int distances = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move (int random) {
        if (random >=4) {
            this.moveHistory.add(true);
            this.distances++;
        } else {
            this.moveHistory.add(false);
        }
    }

    public int getDistance() {
        return distances;
    }
    public ArrayList<Boolean> getHistory() {
        return moveHistory;
    }
    public String getName() {
        return name;
    }

}

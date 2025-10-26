package view;

import model.Car;
import model.RacingLog;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;

public class OutputView {
    private final String ONE_STEP = "-";

    public void outPut(RacingLog result, int cycle) {
        System.out.println("실행 결과");
        for (int i = 0; i < cycle; i++) {
            for (Car car : result.getCars()) {
                System.out.println(car.getName() + " : " + carDistance(car, i));
            }
            System.out.println();
        }
        winnerOutput(result.getWinner());

    }

    public String carDistance(Car car, int i) {
        ArrayList<Boolean> history = car.getHistory();
        ArrayList<String> step = new ArrayList<>();
        for (int j = 0; j < i+1; j++) {
            if (history.get(j)) {
                step.add(ONE_STEP);
            }
        }
        return String.join("", step);

//        return step;
    }

    public void winnerOutput(ArrayList<String> winners) {
        String winner;
        if (winners.size() == 1) {
            winner = winners.getFirst();
        }
        else {
            winner = String.join(", ", winners);
        }
        System.out.println("최종 우승자 : " + winner);
    }
}

package view;

import model.Car;
import model.RacingDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OutputView {
    private final String ONE_STEP = "-";

    public void outPut(RacingDto result) {
        System.out.println("실행 결과");
        int cycle = result.getCycle();
        for (int i = 0; i < cycle; i++) {
            Map<String, List<Boolean>> log = result.getRacingLog();
            for (String carName : log.keySet()) {
                System.out.println(carName + " : " + carDistance(log.get(carName), i));
            }
            System.out.println();
        }
        winnerOutput(result.getWinner());

    }

    public String carDistance(List<Boolean> history, int i) {
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

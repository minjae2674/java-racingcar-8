package view;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;

public class OutputView {
    private final String ONE_STEP = "-";

    public static void outPut(ArrayList<String> names, int cycle, ArrayList<String> winners) {
        System.out.println("실행 결과");
        for (int i = 0; i < cycle; i++) {
            for (String name : names) {
                System.out.println(name + " : " + carDistance());
            }
            System.out.println();
        }
        winnerOutput(winners);
    }

    public static String carDistance() {

    }

    public static void winnerOutput(ArrayList<String> winners) {
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

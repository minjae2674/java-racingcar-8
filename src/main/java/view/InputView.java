package view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String[] inputName() {
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분");
        String input = Console.readLine();
        String[] names = input.split(",");
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].trim();
        }
        findError(names);
        return names;
    }
    public static void findError(String[] names) {
        for (String name: names) {
            if (name.length() > 5 || name.isEmpty()) {
                throw new IllegalArgumentException();
            }
        }
    }

    public static int inputTry() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        return Integer.parseInt(Console.readLine());
    }
}

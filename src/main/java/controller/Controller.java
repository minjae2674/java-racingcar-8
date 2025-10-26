package controller;

import model.CarRacing;
import model.RacingDto;
import view.InputView;
import view.OutputView;

public class Controller {
    private CarRacing carracing = new CarRacing();
    private OutputView outputView = new OutputView();

    public void run() {
        String[] names = InputView.inputName();
        int cycle = InputView.inputTry();

        RacingDto result = carracing.racing(names, cycle);

        outputView.outPut(result);
    }
}

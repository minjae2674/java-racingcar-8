package controller;

import model.Car;
import model.CarRacing;
import model.RacingLog;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;

public class Controller {
    private CarRacing carracing = new CarRacing();
    private OutputView outputView = new OutputView();

    public void run() {
        String[] names = InputView.inputName();
        int cycle = InputView.inputTry();

        RacingLog result = carracing.racing(names, cycle);

        outputView.outPut(result, cycle);
    }
}

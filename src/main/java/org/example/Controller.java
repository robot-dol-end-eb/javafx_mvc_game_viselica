package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.core.Logic;

public class Controller {

    private Logic model = new Logic();

    @FXML
    private Label statusInfo;

    @FXML
    private Label countLives;

    @FXML
    private Label currentWordL;

    @FXML
    private TextField letterTF;

    @FXML
    void addLetterClick(ActionEvent event) {
        if ( model.getLives() != 0) {
            model.checkLetter(letterTF.getText().toCharArray()[0]);
            countLives.setText("Кол-во жизней: " + model.getLives());
            if (model.lose()) {
                statusInfo.setText("Статус игры: lose");
            }
            if (model.win()) {
                statusInfo.setText("Статус игры: win");
            }
            currentWordL.setText("Слово: " + model.getCurrentWord());
        }

    }
    @FXML
    void clk(ActionEvent event) {
        model = new Logic();
        statusInfo.setText("Статус игры: Ввод");
        countLives.setText("Кол-во жизней: " + model.getLives());
        currentWordL.setText("Слово: " + model.getCurrentWord());
    }

}

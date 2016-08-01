package com.javaonline3.view;

import com.javaonline3.math.Eratosthenes;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.List;

public class MainSceneController {

    public TextArea output;
    public TextField input;

    private Eratosthenes eratosthenes;

    public MainSceneController() {
        eratosthenes = new Eratosthenes();
    }

    public void findOfSimpleNumbers() {
        try{
            String userInput = input.getText();
            int n = InputController.convertToInt(userInput);
            List<Integer> simpleNumbers = eratosthenes.findOfSimpleNumbers(n);
            output.setText(simpleNumbers.toString());
        }catch (IllegalArgumentException e){
            output.setText(e.getMessage());
        }
    }
}
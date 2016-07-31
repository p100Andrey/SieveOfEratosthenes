package com.javaonline3;

import com.javaonline3.math.Eratosthenes;
import com.javaonline3.view.InputController;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputController inputController = new InputController(System.in);
        Eratosthenes eratosthenes = new Eratosthenes();
        List<Integer> simpleNumbers = eratosthenes.findOfSimpleNumbers(inputController.readInt());
        System.out.println("Simple numbers: " + simpleNumbers);
    }
}

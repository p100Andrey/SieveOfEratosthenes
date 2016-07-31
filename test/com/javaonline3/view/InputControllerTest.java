package com.javaonline3.view;

import org.junit.Test;

import java.io.ByteArrayInputStream;

public class InputControllerTest {

    private InputController inputController;

    @Test
    public void readInt() throws Exception {
        String input = "twenty\n-20\n20";
        InputController inputController = new InputController(new ByteArrayInputStream(input.getBytes()));
        System.out.println(inputController.readInt());
    }
}
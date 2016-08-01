package com.javaonline3.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class InputControllerTest {

    private InputController inputController;

    private int expectedResult;

    public InputControllerTest(int expectedResult, String input) {
        this.expectedResult = expectedResult;
        inputController = new InputController(new ByteArrayInputStream(input.getBytes()));
    }

    @Parameterized.Parameters(name = "{index}. readInt({1}) == {0}")
    public static List<Object[]> list() {
        return Arrays.asList(new Object[][]{
                {20, "twenty\n-20\n20"},
                {11, "11"}
        });
    }

    @Test
    public void readInt() throws Exception {
        assertEquals(expectedResult, inputController.readInt());
    }
}
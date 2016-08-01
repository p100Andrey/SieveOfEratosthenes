package com.javaonline3.view;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

public class InputControllerTest_convertToInt {

    @Test
    public void convertToInt() throws Exception {
        assertEquals(12, InputController.convertToInt("12"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertToInt_negative() throws Exception {
        InputController.convertToInt("-12");
        assertFalse(true);
    }

    @Test (expected = IllegalArgumentException.class)
    public void convertToInt_notNumber() throws Exception {
        InputController.convertToInt("twenty");
        assertFalse(true);
    }
}
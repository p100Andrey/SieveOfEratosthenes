package com.javaonline3.view;

import javafx.embed.swing.JFXPanel;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MainSceneControllerTest {
    private MainSceneController mainSceneController;

    @Before
    public void setup() {
        new JFXPanel(); // this will prepare JavaFX toolkit and environment
        mainSceneController = new MainSceneController();
        mainSceneController.input = new TextField();
        mainSceneController.output = new TextArea();
    }

    @Test
    public void findOfSimpleNumbers() throws Exception {
        mainSceneController.input.setText("20");
        mainSceneController.findOfSimpleNumbers();
        assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19).toString(), mainSceneController.output.getText());
    }

    @Test
    public void findOfSimpleNumbers_negative() throws Exception {
        mainSceneController.input.setText("-20");
        mainSceneController.findOfSimpleNumbers();
        assertEquals(ConvertToIntException.ERROR_NEGATIVE, mainSceneController.output.getText());
    }

    @Test
    public void findOfSimpleNumbers_notNumber() throws Exception {
        mainSceneController.input.setText("twenty");
        mainSceneController.findOfSimpleNumbers();
        assertEquals(ConvertToIntException.ERROR_NUMERIC, mainSceneController.output.getText());
    }
}
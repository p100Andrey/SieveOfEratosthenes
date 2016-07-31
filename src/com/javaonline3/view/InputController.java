package com.javaonline3.view;

import java.io.InputStream;
import java.util.Scanner;

public class InputController {
    private Scanner scanner;

    public InputController(InputStream inputStream) {
        scanner = new Scanner(inputStream);
    }

    public int readInt() {
        do {
            try {
                System.out.println("Enter the number n:");
                int i = Integer.parseInt(scanner.next());
                if (i <= 0) {
                    throw new IllegalArgumentException();
                }
                return i;
            } catch (NumberFormatException ex) {
                System.out.println("The value must be a number!");
            } catch (IllegalArgumentException ex) {
                System.out.println("The number n must be greater than 0");
            }
        } while (true);
    }
}
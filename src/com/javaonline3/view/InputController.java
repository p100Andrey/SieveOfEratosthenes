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
            try{
                System.out.println("Enter the number n:");
                return convertToInt(scanner.next());
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public static int convertToInt(String text) {
        try {
            int i = Integer.parseInt(text);
            if (i <= 0) {
                throw new ConvertToIntException(ConvertToIntException.ERROR_NEGATIVE);
            }
            return i;
        } catch (NumberFormatException ex) {
            throw new ConvertToIntException(ConvertToIntException.ERROR_NUMERIC);
        }
    }
}
package com.company;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
//    2, 3, 5, 7, 11, 13, 17, 19
    public static void main(String[] args) {
        List<Integer> simpleNumbers = null;
        while (simpleNumbers == null) {
            try {
                System.out.println("Введите число n:");
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                if (n <= 0) {
                    throw new IllegalArgumentException();
                }
                Eratosthenes eratosthenes = new Eratosthenes();
                simpleNumbers = eratosthenes.findOfSimpleNumbers(n);
            } catch (InputMismatchException ex) {
                System.out.println("Значение должно быть числом!");
            } catch (IllegalArgumentException iae) {
                System.out.println("Число n должно быть больше 0!");
            }
        }
        System.out.print("Простые числа: ");
        for (Integer element : simpleNumbers) {
            if (simpleNumbers.indexOf(element) < simpleNumbers.size() - 1) {
                System.out.print(element + ", ");
            } else {
                System.out.println(element);
            }
        }
    }
}

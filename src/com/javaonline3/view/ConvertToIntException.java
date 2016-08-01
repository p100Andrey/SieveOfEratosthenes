package com.javaonline3.view;

public class ConvertToIntException extends IllegalArgumentException{
    public static final String ERROR_NUMERIC = "The value must be a number!";
    public static final String ERROR_NEGATIVE = "The number n must be greater than 0";

    public ConvertToIntException(String message) {
        super(message);
    }
}

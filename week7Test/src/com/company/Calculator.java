package com.company;

public class Calculator {
    public static int add(int firstNumber , int secondNumber){
        return firstNumber  + secondNumber;
    }
    public static int multiply(int multiplicand, int multiplier){
        return multiplicand * multiplier;
    }

    public static double division(int first, int second){
        try {
            return first / second;
        }catch (ArithmeticException ae){
            return 0;
        }
    }
}

package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        int firstTestValue = 40;
        int secondTestValue = 10;

        int expectedOutput = 50;

        Calculator calcTest = new Calculator();
        int actualOutput = calcTest.add(firstTestValue,secondTestValue);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void multiply() {
        int firstTestValue = 10;
        int secondTestValue = 2;

        int expectedOutput = 20;

        Calculator calcTest = new Calculator();
        int actualOutput = calcTest.multiply(firstTestValue,secondTestValue);
        assertEquals(expectedOutput, actualOutput);
    }
}

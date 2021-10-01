package com.pk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    CalcTestData data = new CalcTestData() {
    };

    @Test
    void getSum() {
        assertEquals(data.integerSumRes, Calculator.getSum(data.integer1, data.integer2),
                "There is an error in assertion");
        assertEquals(data.floatSumRes, Calculator.getSum(data.float1, data.float2),
                "There is an error in assertion");
    }

    @Test
    void getSubtraction() {
        assertEquals(data.integerSubRes, Calculator.getSubtraction(data.integer1, data.integer2),
                "There is an error in assertion");
        assertEquals(data.floatSubRes, Calculator.getSubtraction(data.float1, data.float2),
                "There is an error in assertion");
    }

    @Test
    void getMultiplication() {
        assertEquals(data.integerMulRes, Calculator.getMultiplication(data.integer1, data.integer2),
                "There is an error in assertion");
        assertEquals(data.floatMulRes, Calculator.getMultiplication(data.float1, data.float2),
                "There is an error in assertion");
    }

    @Test
    void getDivision() {
        assertEquals(data.integerDivRes, Calculator.getDivision(data.integer1, data.integer2),
                "There is an error in assertion");
        assertEquals(data.floatDivRes, Calculator.getDivision(data.float1, data.float2),
                "There is an error in assertion");
    }
}
package com.pk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    CalcTestData d = new CalcTestData() {};

    @Test
    void getSum(){
        assertEquals(d.integerSumRes, Calculator.getSum(d.integer1, d.integer2),
                "There is an error in assertion");
        assertEquals(d.floatSumRes, Calculator.getSum(d.float1,d.float2),
                "There is an error in assertion");
    }

    @Test
    void getSubtraction(){
        assertEquals(d.integerSubRes, Calculator.getSubtraction(d.integer1, d.integer2),
                "There is an error in assertion");
        assertEquals(d.floatSubRes, Calculator.getSubtraction(d.float1,d.float2),
                "There is an error in assertion");
    }

    @Test
    void getMultiplication(){
        assertEquals(d.integerMulRes, Calculator.getMultiplication(d.integer1, d.integer2),
                "There is an error in assertion");
        assertEquals(d.floatMulRes, Calculator.getMultiplication(d.float1,d.float2),
                "There is an error in assertion");
    }

    @Test
    void getDivision(){
        assertEquals(d.integerDivRes, Calculator.getDivision(d.integer1, d.integer2),
                "There is an error in assertion");
        assertEquals(d.floatDivRes, Calculator.getDivision(d.float1,d.float2),
                "There is an error in assertion");
    }
}
package com.pk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void getSum(){
        assertEquals(calc.getSum(23,34),55);
    }

}
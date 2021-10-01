package com.pk;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        float number1, number2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter two numbers");
        number1 = sc.nextFloat();
        number2 = sc.nextFloat();
        System.out.println("And now the operator (+,-,*,/)");

        char operator = sc.next().charAt(0);
        float res = 0;

        switch (operator) {
            case '+':
                res = (float) getSum(number1, number2);
                break;
            case '-':
                res = (float) getSubtraction(number1, number2);
                break;
            case '*':
                res = (float) getMultiplication(number1, number2);
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("You can't divide by 0");
                    break;
                }
                res = (float) getDivision(number1, number2);
                break;
            default:
                System.out.println("You enter wrong input");
                break;
        }

        System.out.println("The final result:");
        System.out.println();
        System.out.println(number1 + " " + operator + " " + number2
                + " = " + res);
    }

    public static Number getSum(Number firstValue, Number secondValue) {
        if (firstValue instanceof Integer && secondValue instanceof Integer) {
            return firstValue.intValue() + secondValue.intValue();
        } else {
            return firstValue.floatValue() + secondValue.floatValue();
        }
    }

    public static Number getSubtraction(Number firstValue, Number secondValue) {
        if (firstValue instanceof Integer && secondValue instanceof Integer) {
            return firstValue.intValue() - secondValue.intValue();
        } else {
            return firstValue.floatValue() - secondValue.floatValue();
        }
    }

    public static Number getMultiplication(Number firstValue, Number secondValue) {
        if (firstValue instanceof Integer && secondValue instanceof Integer) {
            return firstValue.intValue() * secondValue.intValue();
        } else {
            return firstValue.floatValue() * secondValue.floatValue();
        }
    }

    public static Number getDivision(Number firstValue, Number secondValue) {
        if (secondValue == null || secondValue == (Number) 0) {
            System.out.println("TIS IS WRONG!");
        }
        if (firstValue instanceof Integer && secondValue instanceof Integer) {
            return firstValue.intValue() / secondValue.intValue();
        } else {
            return firstValue.floatValue() / secondValue.floatValue();
        }
    }
}
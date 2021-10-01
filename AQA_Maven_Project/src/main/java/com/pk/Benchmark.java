package com.pk;

public class Benchmark {
    public void Time(char operation) {
        long start = System.currentTimeMillis();
        int counter = 0;
        int number1 = 100;
        float number2 = 1.5f;

        switch (operation) {
            case '+':
                for (int i = 0; i < 1_000_000; i++) {
                    Calculator.getSum(number1, number2);
                    counter++;
                }
                break;
            case '-':
                for (int i = 0; i < 1_000_000; i++) {
                    Calculator.getSubtraction(number1, number2);
                    counter++;
                }
                break;
            case '*':
                for (int i = 0; i < 1_000_000; i++) {
                    Calculator.getMultiplication(number1, number2);
                    counter++;
                }
                break;
            case '/':
                for (int i = 0; i < 1_000_000; i++) {
                    Calculator.getDivision(number1, number2);
                    counter++;
                }
                break;

            default:
                System.out.println("You enter wrong input");
                break;
        }

        System.out.println("Execution time of running method by " + counter +
                " times is: " + (System.currentTimeMillis() - start) + " milliseconds");
    }
}

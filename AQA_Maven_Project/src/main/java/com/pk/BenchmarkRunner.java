package com.pk;

import java.util.Scanner;

public class BenchmarkRunner extends Calculator {
    public static void main(String[] args) {
        Benchmark benchmark = new Benchmark();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the operator (+,-,*,/) to run the benchmark");

        char operator = sc.next().charAt(0);

        benchmark.Time(operator);
    }
}

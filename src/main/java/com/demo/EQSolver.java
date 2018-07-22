package com.demo;

public class EQSolver {

    double a = 1.5;
    double b = 2.0;
    double c = -1.8;
    double x1;
    double x2;

    public double solverX1() {
        x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return x1;
    }

    public double solverX2() {
        x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return x2;
    }

    public static void main(String[] args) {

        EQSolver s = new EQSolver();
        System.out.println(s.solverX1());
        System.out.println(s.solverX2());
    }


}

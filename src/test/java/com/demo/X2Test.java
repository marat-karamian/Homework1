package com.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class X2Test {
    EQSolver s = new EQSolver();

    @Test
    public void x2Test() {
        assertEquals(-1.949025604111423, s.solverX2(), 0.0000000000000001);
    }
}

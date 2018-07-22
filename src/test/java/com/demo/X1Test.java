package com.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class X1Test {
    EQSolver s = new EQSolver();

    @Test
    public void x1Test() {
        assertEquals(0.6156922707780897, s.solverX1(), 0.0000000000000001);
    }

}

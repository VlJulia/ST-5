package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest {
    
    @Test
    public void testSqrt4() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.calc(), sqrt.getDelta());
    }

    @Test
    public void testSqrt9() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.calc(), sqrt.getDelta());
    }

    @Test
    public void testSqrt16() {
        Sqrt sqrt = new Sqrt(16.0);
        assertEquals(4.0, sqrt.calc(), sqrt.getDelta());
    }

    @Test
    public void testSqrt25() {
        Sqrt sqrt = new Sqrt(25.0);
        assertEquals(5.0, sqrt.calc(), sqrt.getDelta());
    }

    @Test
    public void testSqrt0() {
        Sqrt sqrt = new Sqrt(0.0);
        assertTrue((sqrt.calc()<0.0001));
    }

    @Test
    public void testSqrt1() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(1.0, sqrt.calc(), sqrt.getDelta());
    }

    @Test
    public void testSqrt2() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), sqrt.calc(), sqrt.getDelta());
    }

    @Test
    public void testSqrt3() {
        Sqrt sqrt = new Sqrt(3.0);
        assertEquals(Math.sqrt(3.0), sqrt.calc(), sqrt.getDelta());
    }

    @Test
    public void testSqrt10() {
        Sqrt sqrt = new Sqrt(10.0);
        assertEquals(Math.sqrt(10.0), sqrt.calc(), sqrt.getDelta());
    }

    @Test
    public void testSqrtNegative() {

        assertThrows(IllegalArgumentException.class, () -> {
        Sqrt sqrt = new Sqrt(-4.0);});

    }

    @Test
    public void testSqrt_Math_e_7() {
        Sqrt sqrt = new Sqrt(7);
        assertEquals(sqrt.calc(), Math.sqrt(7), sqrt.getDelta());
    }
    @Test
    public void testSqrt_Math_e_111() {
        Sqrt sqrt = new Sqrt(111);
        assertEquals(sqrt.calc(), Math.sqrt(111), sqrt.getDelta());
    }
    @Test
    public void testSqrt_Math_e_90() {
        Sqrt sqrt = new Sqrt(90);
        assertEquals(sqrt.calc(), Math.sqrt(90), sqrt.getDelta());
    }

    @Test
    public void testSqrt_Math_e_16() {
        Sqrt sqrt = new Sqrt(16);
        assertEquals(sqrt.calc(), Math.sqrt(16), sqrt.getDelta());
    }
}

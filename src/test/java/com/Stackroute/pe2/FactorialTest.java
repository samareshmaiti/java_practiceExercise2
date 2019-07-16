package com.Stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    FactorialTest factorialTest;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void givenInputValueShouldBePositive(){
        String actualresult=factorialTest.printIntFactorial(n);
        assertEquals("value should be positive",actualresult);
    }
    @Test
    public void givenInputValueShouldBeOutOfRange(){
        String actualresult=factorialTest.printIntFactorial(n);
        assertEquals("value should be within the range",actualresult);
    }
    @Test
    public void givenInputValueShouldBeOutOfRange(){
        String actualresult=factorialTest.printLongFactorial(n);
        assertEquals("value should be out of range",actualresult);
    }
}
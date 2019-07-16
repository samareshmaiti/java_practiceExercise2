package com.Stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    FactorialTest factorialTest;
    /* @Before annotation is used on a method containing Java
    code to run before each test case. i.e it runs before each test execution.
    In the setup method ,object of class is declared
 */
    @Before
    public void setUp()
    {
        this.factorialTest=new FactorialTest();
    }

    @After
    public void tearDown()
    {
       this.factorialTest=null;
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
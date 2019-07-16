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
    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown()
    {
       this.factorialTest=null;
    }
    /*
    This method will return an error as the given input is negative
     */

    @Test
    public void givenInputShouldReturnError(){
        String actualresult=factorialTest.printIntFactorial(-9);
        assertNotEquals("value should be positive",actualresult);
    }
    /*
    This method will return an output
     */
    @Test
    public void givenInputShouldReturnOutOfRange(){
        String actualresult=factorialTest.printIntFactorial(15);
        assertEquals("value should be within the range",actualresult);
    }
    /*
    This method will return a message showing out of range
     */
    @Test
    public void givenInputShouldReturnResult(){
        String actualresult=factorialTest.printLongFactorial(10);
        assertEquals("value should be out of range",actualresult);
    }
}
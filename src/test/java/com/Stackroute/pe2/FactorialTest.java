package com.Stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    Factorial factorial;
    /* @Before annotation is used on a method containing Java
    code to run before each test case. i.e it runs before each test execution.
    In the setup method ,object of class is declared
 */
    @Before
    public void setUp()
    {
        this.factorial=new Factorial();
    }
    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown()
    {
       this.factorial=null;
    }
    /*
    This method will return an error as the given input is negative
     */

    @Test
    public void givenInputShouldReturnError(){
        String actualresult=factorial.printIntFactorial(-9);
        assertNotEquals("value should be positive",actualresult);
    }
    /*
    This method will return an output
     */
    @Test
    public void givenInputShouldReturnOutOfRange(){
        String actualresult=factorial.printIntFactorial(15);
        assertEquals("value should be within the range",actualresult);
    }
    /*
    This method will return a message showing out of range
     */
    @Test
    public void givenInputShouldReturnFactorialOutput(){
        String actualresult=factorial.printIntFactorial(10);
        assertEquals("showing Factorial",actualresult);
    }

    /*
    This method will return an output
     */
    @Test
    public void givenInputShouldReturnFactorial(){
        String actualresult=factorial.printLongFactorial(20);
        assertEquals("Factorial of long",actualresult);
    }
    /*
    This method will return a message showing out of range
     */

}
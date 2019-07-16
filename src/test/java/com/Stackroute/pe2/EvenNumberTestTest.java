package com.Stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenNumberTestTest {

    EvenNumberTest evenNumberTest;
    /* @Before annotation is used on a method containing Java
    code to run before each test case. i.e it runs before each test execution.
    In the setup method ,object of class is declared
 */
    @Before
    public void setup() {

        this.evenNumberTest= new EvenNumberTest();
    }
    @After
    public void tearDown()
    {

        this.evenNumberTest=null;
    }


    @Test
    public void givenInputAndShouldProperOutput() {
        //act
        boolean actualResult=evenNumberTest.isEven(7);
        //assert
        assertEquals("false", actualResult);
    }
}
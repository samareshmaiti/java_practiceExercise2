package com.Stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenNumberTest {

    EvenNumber evenNumberTest;
    /* @Before annotation is used on a method containing Java
    code to run before each test case. i.e it runs before each test execution.
    In the setup method ,object of class is declared
 */
    @Before
    public void setup() {

        this.evenNumberTest= new EvenNumber();
    }
    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown()
    {

        this.evenNumberTest=null;
    }
    @Test
    public void givenNegativeNumberShouldReturnError(){
        boolean actualresult = evenNumberTest.getResult(-2);
        assertEquals("enter positive value",actualresult);
    }
    /* this function will return enter value within limit
     */
    @Test
    public void givenNegativeNumberShouldReturnTrue(){
        boolean actualresult = evenNumberTest.getResult(10);
        assertEquals("True",actualresult);
    }
    /* this function will return enter value within limit
     */
    @Test
    public void givenNegativeNumberShouldReturnFalse(){
        boolean actualresult = evenNumberTest.getResult(11);
        assertEquals("False",actualresult);
    }



}
package com.Stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenNumberTestTest {

    EvenNumberTest evenNumberTest;
    @Before
    public void setup() {
        System.out.println("Inside before");
        this.evenNumberTest= new EvenNumberTest();
    }
    @After
    public void tearDown()
    {
        System.out.println("inside after");
        evenNumberTest=null;
    }
    @BeforeClass
    public static void beforeClass()
    {
        System.out.println("Before class");
    }

    @AfterClass

    public static void afterClass()
    {
        System.out.println("After class");
    }

    @Test
    public void givenInputAndShouldProperOutput() {
        //act
        boolean actualResult=evenNumberTest.isEven(7);
        //assert
        assertEquals("false", actualResult);
    }
}
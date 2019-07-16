package com.Stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class FrequencyOfWordsTest {

    FrequencyOfWords frequencyOfWords;
    @Before
    public void setup() {
        System.out.println("Inside before");
        this.frequencyOfWords = new FrequencyOfWords();
    }
    @After
    public void tearDown()
    {
        System.out.println("inside after");
        frequencyOfWords =null;
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
    public void givenFileNameShouldNotStartWithValidValue()
    {
        String actualresult =frequencyOfWords.frequency("@java");
        assertEquals("file name is not correct",actualresult);
    }
}
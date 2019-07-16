package com.Stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class FrequencyOfWordsTest {

    FrequencyOfWords frequencyOfWords;
    /* @Before annotation is used on a method containing Java
    code to run before each test case. i.e it runs before each test execution.
    In the setup method ,object of class is declared
 */
    @Before
    public void setup() {

        this.frequencyOfWords = new FrequencyOfWords();
    }
    @After
    public void tearDown()
    {

        this.frequencyOfWords=null;
    }



    @Test
    public void givenFileNameShouldNotStartWithValidValue()
    {
        String actualresult =frequencyOfWords.frequency("@java");
        assertEquals("file name is not correct",actualresult);
    }

}
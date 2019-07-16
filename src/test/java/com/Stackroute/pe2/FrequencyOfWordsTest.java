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
    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown()
    {

        this.frequencyOfWords=null;
    }



}
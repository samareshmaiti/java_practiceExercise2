package com.Stackroute.pe2;

import org.junit.*;

public class FrequencyOfWordsTest {

    FrequencyOfWords practiceExercise2;
    @Before
    public void setup() {
        System.out.println("Inside before");
        this.practiceExercise2= new FrequencyOfWords();
    }
    @After
    public void tearDown()
    {
        System.out.println("inside after");
        practiceExercise2=null;
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
    public void outPut() {
    }
}
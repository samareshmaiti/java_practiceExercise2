package com.Stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class checkFrequencyOfFileTest {
CheckFrequencyOfFile checkFrequencyOfFile;
    @Before
    public void setUp() throws Exception {
    }
    @BeforeClass
    public static void beforeClass()
    {
        System.out.println("Before class");
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void givenFileShouldHaveSomeData()
    {
        String[] actualresult = checkFrequencyOfFile.checkFrequency("");
        assertEquals("file is empty",actualresult);
    }
    @Test
    public void givenFileValueDataShouldBeUnique()
    {
        String[] actualresult = checkFrequencyOfFile.checkFrequency("");
        assertEquals("word is alredy taken",actualresult);
    }

}
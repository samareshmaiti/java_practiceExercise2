package com.Stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class getFileNameAndDataTest {
     checkFrequencyOfFile getFileNameAndData;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void givenFolderNameShouldStartWithValidValue()
    {
        String[] actualresult =getFileNameAndData.getResult("Documents.java");
        assertEquals("file name is correct",actualresult);
    }
    @Test
    public void givenFileNameShouldNotStartWithValidValue()
    {
        String[] actualresult =getFileNameAndData.getResult("@java");
        assertEquals("file name is not correct",actualresult);
    }
    @Test
    public void givenFileNameShouldHaveAProperExtenssion()
    {
        String[] actualresult =getFileNameAndData.getResult(".txt");
        assertEquals("file name extension is correct",actualresult);
    }
}
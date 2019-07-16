package com.Stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetFileNameAndDataTest {
     GetFileNameAndDataTest getFileNameAndData;
    /* @Before annotation is used on a method containing Java
code to run before each test case. i.e it runs before each test execution.
In the setup method ,object of class is declared
*/
    @Before
    public void setUp()
    {
        this.getFileNameAndData=new GetFileNameAndDataTest();
    }

    @After
    public void tearDown()
    {
        this.getFileNameAndData=null;
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
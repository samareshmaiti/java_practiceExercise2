package com.Stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckFrequencyOfFileTest {
CheckFrequencyOfFile checkFrequencyOfFile;
/* @Before annotation is used on a method containing Java
    code to run before each test case. i.e it runs before each test execution.
    In the setup method ,object of class is declared
 */
    @Before
    public void setUp()
    {
        this.checkFrequencyOfFile=new CheckFrequencyOfFile();
    }


    @After
    public void tearDown()
    {
        this.checkFrequencyOfFile=null;
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
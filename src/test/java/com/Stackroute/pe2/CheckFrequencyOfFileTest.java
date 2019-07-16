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

    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown()
    {
        this.checkFrequencyOfFile=null;
    }
    /* this function checks for empty file
     */
    @Test
    public void givenFileShouldHaveSomeData()
    {
        String[] actualresult = checkFrequencyOfFile.checkFrequency(" ");
        assertEquals("file is empty",actualresult);
    }
    /* this function checks whether there is a duplicate file
     */
    @Test
    public void givenFileShouldBeUnique()
    {
        String[] actualresult = checkFrequencyOfFile.checkFrequency("");
        assertEquals("word is alredy taken",actualresult);
    }
    /* this function checks for proper output
     */
    @Test

    public void givenFileShouldReturnProperOutput()
    {
        String[] actualresult = checkFrequencyOfFile.checkFrequency("input.txt");
        assertEquals("proper output",actualresult);
    }

}
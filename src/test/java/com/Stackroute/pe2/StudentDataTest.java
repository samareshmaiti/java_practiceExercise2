package com.Stackroute.pe2;

import com.Stackroute.pe2.StudentData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentDataTest {
    StudentData studentData;
    /* @Before annotation is used on a method containing Java
 code to run before each test case. i.e it runs before each test execution.
 In the setup method ,object of class is declared
 */
    @Before
    public void setUp(){
        //arrange

        this.studentData = new StudentData();
    }
    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */

    @After
    public void tearDown()  {

        this.studentData=null;
    }

    /* this function will return proper output
     */
    @Test
    public void givenNumberShouldReturnErrorIfNumberNotValid() {
        String actualresult = studentData.getStudentData(120, 30, -20, 59);
        assertEquals("entered proper value between range", actualresult);
    }
    @Test
    public void givenNumberShouldReturnMinimum() {
        int actualresult = studentData.getStudentData(80, 30, 66, 59);
        assertEquals(30, actualresult);
    }
    @Test
    public void givenNumberShouldReturnAverage() {
        float actualresult = studentData.getStudentData(80, 30, 66, 59);
        assertEquals(58.75, actualresult,2);
    }
    @Test
    public void givenNumberShouldReturnMaximum() {
        int actualresult = studentData.getStudentData(80, 30, 66, 59);
        assertEquals(80, actualresult);
    }

}
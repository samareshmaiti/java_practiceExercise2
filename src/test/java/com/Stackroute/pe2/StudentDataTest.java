package com.Stackroute.pe2;

import com.Stackroute.pe2.StudentData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentDataTest {
    StudentData studentData;
    @Before
    public void setUp(){
        //arrange

        this.studentData = new StudentData();
    }

    @After
    public void tearDown()  {

        this.studentData=null;
    }
    @Test
    public void CheckIftheGivenNumberOfStudentShouldBeValid(){
        int actualresult =studentData.getStudentData(7);
        assertEquals("enter correct positive value",actualresult);

    }
    @Test
    public void checkIfTheGivenArrayShouldNotBeEqualToNumberOfStudent(){
        int actualresult = studentData.getStudentData(2);
        assertEquals("enter positive value",actualresult);
    }
    @Test
    public void checkIfMarksSHouldNotBeOutOfLimit(){
        int actualresult = studentData.getStudentData(100);
        assertEquals("enter value within the limit",actualresult);
    }
    @Test
    public void checkIfMarksSHouldBeOutOfLimit(){
        int actualresult= studentData.getStudentData(50);
        assertNotEquals("enter value within the limit",actualresult);
    }

}
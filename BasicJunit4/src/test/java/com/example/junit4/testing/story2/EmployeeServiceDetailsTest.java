package com.example.junit4.testing.story2;

import com.example.junit4.story2.Employee;
import com.example.junit4.story2.EmployeeServiceDetails;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeServiceDetailsTest {

    private EmployeeServiceDetails employeeServiceDetails;

    @Before
    public void setUp() throws Exception {
        employeeServiceDetails = new EmployeeServiceDetails();
    }

    /**
     * calculating yearly salary for an employee
     */
    @Test
    public void testEmployeesYearlySalary() {
        Employee employee = new Employee("emp1", 10000, 26);
        double actualResult = employeeServiceDetails.calculateYearlySalary(employee);

        Assert.assertEquals(120000, actualResult, 0.0);
    }

    /**
     * testing yearly appraisal for an employee
     */
    @Test
    public void testEmployeesYearlyAppraisal() {
        Employee employee1 = new Employee("emp1", 8000, 26);
        double actualResult1 = employeeServiceDetails.calculateEmployeeAppraisal(employee1);

        Assert.assertEquals(500, actualResult1, 0.0);

        Employee employee2 = new Employee("emp2", 15000, 26);
        double actualResult2 = employeeServiceDetails.calculateEmployeeAppraisal(employee2);

        Assert.assertEquals(1000, actualResult2, 0.0);

    }
}
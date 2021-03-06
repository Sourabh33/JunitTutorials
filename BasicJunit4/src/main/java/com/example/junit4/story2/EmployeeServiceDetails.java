package com.example.junit4.story2;

/**
 * TDD approach using Junit
 */
public class EmployeeServiceDetails {


    /**
     * calculate the yearly salary of an employee
     * @param employee employee object
     * @return yearlySalary
     */
    public double calculateYearlySalary(Employee employee) {
        double yearlySalary = 0;
        yearlySalary = employee.getMonthlySalary() * 12;
        return yearlySalary;
    }

    /**
     * calculate the appraisal amount of employee
     * @param employee employee object
     * @return yearlyAppraisal
     */
    public double calculateEmployeeAppraisal(Employee employee) {
        if (employee.getMonthlySalary() < 10000) {
            return 500;
        } else {
            return 1000;
        }
    }
}

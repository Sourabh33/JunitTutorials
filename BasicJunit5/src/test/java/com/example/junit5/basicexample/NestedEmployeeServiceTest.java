package com.example.junit5.basicexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Employee Service Test")
public class NestedEmployeeServiceTest {

    // EmployeeService employeeService = null;

    @BeforeEach
    public void setup() {
        System.out.println("Initializing Employee service object");
        // employeeService = new EmployeeService()
        System.out.println("employeeService = new EmployeeService()");
    }

    @Test
    public void testGetAllEmployee() {
        System.out.println("test for getting list of employees");
        // employeeService.findAllEmployees()
        System.out.println("employeeService.findAllEmployees()");
    }

    @Nested
    @DisplayName("Testing find one methods")
    class FindSingleEmployee {

        @Test
        void testFindOneById() {
            // employeeService.findOneById(2L);
            System.out.println("employeeService.findOneById(2L)");
        }

        @Test
        void testFindByName() {
            // employeeService.findOneByName(2L);
            System.out.println("employeeService.findOneByName(2L)");
        }

        @Test
        void testFindByNameRegex() {
            // employeeService.findOneByNameRegex("%s");
            System.out.println("employeeService.findOneByNameRegex(\"%s\")");
        }
    }

    @Nested
    @DisplayName("Testing find all methods")
    class FindAllEmployee {
        @Test
        void testFindAllByIds() {
            // employeeService.findAllByIds(Arrays.asList(2, 3, 4));
            System.out.println("employeeService.findAllByIds(Arrays.asList(2, 3, 4))");
        }

        @Test
        void testFindAllByName() {
            // employeeService.findAllByName("test");
            System.out.println("employeeService.findAllByName(\"test\")");
        }
    }

    @Nested
    @DisplayName("Testing update methods")
    class UpdateEmployee {
        @Test
        void testUpdateWithNewEmployee() {
            // employeeService.update(new Customer());
            System.out.println("employeeService.update(new Customer())");
        }

        @Test
        void testUpdateWithExistingEmployee() {
            // employeeService.update(new Customer());
            System.out.println("employeeService.update(new Customer())");
        }
    }
}

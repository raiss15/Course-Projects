package tests;

import com.github.javafaker.Faker;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import org.testng.annotations.Test;


public class EmployeeTest {

    @Test
    public void testEmployeeCreationWithFaker() {
        Faker faker = new Faker();

        // Create an employee with fake data
        Employee employee = new Employee();
        employee.setName(faker.name().fullName());

        // Perform assertions
        assertNotNull(employee);
        assertNotNull(employee.getName());
        assertEquals(1, employee.getId()); // Since this is the first employee, the ID should be 1
        assertEquals(2, Employee.getCount()); // Since we created one employee, the count should be 2

        // Print details for verification
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Total Employee Count: " + Employee.getCount());
    }

    @Test
    public void testMultipleEmployeeCreationWithFaker() {
        Faker faker = new Faker();

        // Create multiple employees with fake data
        Employee employee1 = new Employee();
        employee1.setName(faker.name().fullName());

        Employee employee2 = new Employee();
        employee2.setName(faker.name().fullName());

        // Perform assertions
        assertNotNull(employee1);
        assertNotNull(employee1.getName());
        assertEquals(1, employee1.getId()); // Since this is the first employee, the ID should be 1

        assertNotNull(employee2);
        assertNotNull(employee2.getName());
        assertEquals(2, employee2.getId()); // Since this is the second employee, the ID should be 2

        assertEquals(3, Employee.getCount()); // Since we created two employees, the count should be 3

        // Print details for verification
        System.out.println("Employee 1 Name: " + employee1.getName());
        System.out.println("Employee 1 ID: " + employee1.getId());

        System.out.println("Employee 2 Name: " + employee2.getName());
        System.out.println("Employee 2 ID: " + employee2.getId());

        System.out.println("Total Employee Count: " + Employee.getCount());
    }
}

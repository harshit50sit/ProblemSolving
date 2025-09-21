package java8coding.grooupingBy;

import java.util.Map;
import java.util.stream.Collectors;

import java.util.Arrays;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private String gender;
    private String department;

    public Employee(int id, String name, String gender, String department) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.department = department;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }
}
class EmployeeList {

    public static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1, "Amit", "Male", "IT"),
                new Employee(2, "Sita", "Female", "Finance"),
                new Employee(3, "Rahul", "Male", "HR"),
                new Employee(4, "Priya", "Female", "IT"),
                new Employee(5, "Vijay", "Male", "Finance"),
                new Employee(6, "Anjali", "Female", "HR")
        );
    }
}
public class GenderCount {

    public static void main(String[] args) {
        List<Employee> employees = EmployeeList.getEmployees();

        // Group and count by gender
        Map<String, Long> genderCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        // Print the results
        genderCount.forEach((gender, count) -> System.out.println(gender + ": " + count));

        // Extract and print unique department names
        employees.stream()
                .map(Employee::getDepartment)   // Extract department names
                .distinct()                    // Remove duplicates
                .forEach(System.out::println);  // Print each unique department
    }
}

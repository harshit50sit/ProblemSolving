package java8coding.grooupingBy;

import java.util.*;
import java.util.stream.Collectors;

class Employee1 {
    private int id;
    private String name;
    private int age;
    long salary;
    private String gender;
    private String deptName;
    private String city;

    public Employee1(int id, String name, int age, long salary, String gender, String deptName, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.deptName = deptName;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return String.format("%d %s %d %d %s %s %s", id, name, age, salary, gender, deptName, city);
    }
}
public class GroupEmployees {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
                new Employee1(1, "Aditi", 30, 100000, "F", "HR", "Mumbai"),
                new Employee1(2, "Rahul", 34, 130000, "M", "Tech", "Bangalore"),
                new Employee1(3, "Vishal", 28, 110000, "M", "Tech", "Mumbai"),
                new Employee1(4, "Lakshmi", 45, 150000, "F", "HR", "Bangalore")
        );

        Map<String, List<Employee1>> groupedByCity = employees.stream()
                .collect(Collectors.groupingBy(Employee1::getCity));

        groupedByCity.forEach((city, empList) -> {
            System.out.println("City: " + city);
            empList.forEach(System.out::println);
        });
    }
}

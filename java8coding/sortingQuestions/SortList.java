package java8coding.sortingQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Sort List of Employee Objects in Ascending and Descending Order using Comparator
 */
class Employee {
    private int id;
    private String name;
    private int age;
    private long salary;
    public Employee(int id, String name, int age, long salary) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
}
class MySort implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int)(o1.getSalary() - o2.getSalary());
    }
}
public class SortList {

    public static void main(String[] args) {

        List < Employee > employees = new ArrayList < Employee > ();
        employees.add(new Employee(10, "Ramesh", 30, 400000));
        employees.add(new Employee(20, "Santosh", 29, 350000));
        employees.add(new Employee(30, "Sanjay", 30, 450000));
        employees.add(new Employee(40, "Pramod", 29, 500000));

        // ascending order
        Collections.sort(employees, new MySort());

        System.out.println(employees);
        Collections.sort(employees, new Comparator < Employee > () {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o1.getName().compareTo(o2.getName()));
            }
        });

        // using lambda expression
        // ascending order
        Collections.sort(employees, (o1, o2) -> (o1.getName().compareTo(o2.getName())));
        System.out.println("Ascending order => " + employees);
        // descending order
        Collections.sort(employees, (o1, o2) -> (o2.getName().compareTo(o1.getName())));
        System.out.println("Descending order => " + employees);
        // using Comparator.comparing() method
        Collections.sort(employees, Comparator.comparing(Employee::getName));
    }
}

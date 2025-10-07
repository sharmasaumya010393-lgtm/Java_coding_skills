package com.streamsApi.codes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//given a list of employees objects. filter the
// employees older than 25 years and collect the names into the
// list department wise
public class Employee {
    private String name;
    private int age;
    private String department;

    public Employee(String name,int age, String department){
        this.name=name;
        this.age=age;
        this.department=department;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getDepartment(){
        return department;
    }

    public static void main (String [] args){
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 30, "IT"),
                new Employee("Bob", 22, "HR"),
                new Employee("Charlie", 28, "IT"),
                new Employee("David", 35, "Finance"),
                new Employee("Eve", 24, "HR"),
                new Employee("Frank", 26, "Finance"));

        Map<String, List<String>> result = employees.stream()
                .filter(emp -> emp.getAge()>25)
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())));

                        System.out.println(result);
    }

}

package com.streamsApi.codes;

public class HighestSalaryEmp {

    private int id;
    private String name;
    private double salary;
    // constructor
    public HighestSalaryEmp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    // getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
}
//list of employee wose salary is greater than 20000.


class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 3, 5, 32, 64, 21, 75, 23};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : arr){
            if (num>first){
                second = first;
                first = num;}
            else if(num>second && num!=first){
                second=num;
            }
        }

        System.out.println("The second highest number is:" + second);
    }
}

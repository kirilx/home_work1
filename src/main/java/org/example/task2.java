package org.example;

public class task2 {
    public static void main(String[] args) {
    int salary = 1500;
    int months = 12;


    calculate(salary, months);
}

    public static void calculate(int salary, int months) {
        int yearlySalary = salary * months;
        System.out.println(yearlySalary + " лева Годишна заплата");
    }
}

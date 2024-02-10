package org.example;

public class Task3 {
    public static void main(String[] args) {
        int months = 12;
        int dueAmount = 8000;
        double interestRate = 0.007;

        // loan+ total amount =
        double totalAmount = calculateTotalAmount(dueAmount, interestRate);

        // calculating month installment
        calculateInstallment(totalAmount, months);
    }

    public static double calculateTotalAmount(int dueAmount, double interestRate) {
        return dueAmount + (dueAmount * interestRate);

    }

    public static void calculateInstallment(double totalAmount, int months) {
        double monthlyInstallment = totalAmount / months;
        System.out.println(monthlyInstallment + " лева Месечна вноска");
        System.out.println(totalAmount + " лева сума със лихва за Връщане");
    }
}

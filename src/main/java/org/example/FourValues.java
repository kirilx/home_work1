package org.example;

public class FourValues {
    public static void main(String[] args) {
        calculateCreditDetails("София", 25, 600000, 13, 1500);
    }

    public static void calculateCreditDetails(String text, int age, int amount, int months, int monthlyIncome) {
        if (age < 18) {
            System.out.println("Трябва да има навършени 18 години");
        } else {
            if (amount < 1000) {
                if (months > 12) {
                    System.out.println("Не можете да изтеглите сума под 1000 лева за период по-дълъг от 12 месеца");
                } else {
                    if (monthlyIncome <= 2000 && amount >= 50000) {
                        System.out.println("Съжаляваме, но максимума за такъв доход е 20000 лева.");
                    }else{
                    } if (monthlyIncome >= 5000 && amount <= 1000000) {
                        System.out.println("С такъв доход можем да ви предложим 100 000 лева");
                    } else {
                        double monthlyPayment = amount / months;
                        System.out.println("Месечна вноска е равна на " + monthlyPayment);
                    }
                }
            } else {
                double interestRate = getInterestRate(amount);
                double totalAmount = amount + (amount * interestRate * months / 12);
                double monthlyPayment = totalAmount / months;
                System.out.printf("Месечна вноска за сума от %d лева за %d месеца с лихва %.2f%% %.2f лева.%n",
                        amount, months, interestRate * 100, monthlyPayment);
            }
        }
    }

    private static double getInterestRate(int amount) {
        if (amount <= 5000) {
            return 0.05; // 5% лихва за суми до 5000 лева
        } else if (amount <= 10000) {
            return 0.04; // 4% лихва за суми до 10000 лева
        } else {
            return 0.03; // 3% лихва за суми над 10000 лева
        }
    }
}

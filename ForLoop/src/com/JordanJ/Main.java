package com.JordanJ;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000.00 dollars at 2% interest = $" + String.format("%.2f",calculatedInterest(10000.0, 2.0)));

//      for loop structure:
//        for(initialize; termination; increment) {
//    }

        for (int i = 6; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        for (int j = 2; j <= 8; j++) {
            System.out.println("$10,000 at " + j + "% interest = $" + String.format("%.2f",calculatedInterest(10000.0, j)));
        }

        System.out.println("********************************");

        for (int h = 8; h >= 2; h--) {
            System.out.println("$10,000 at " + h + "% interest = $" + String.format("%.2f",calculatedInterest(10000.0, h)));
        }

        int count = 0;
        for (int i = 0; i < 1000; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number.");
                if (count == 100) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static double calculatedInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}

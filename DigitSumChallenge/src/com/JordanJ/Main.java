package com.JordanJ;

public class Main {

    public static void main(String[] args) {

        System.out.println("The sum of the digits in 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in 125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in 125 is " + sumDigits(420));
        System.out.println("The sum of the digits in 125 is " + sumDigits(777777));

    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        //sum each digit that makes up the number (e.g. 125 = (1+2+5 = 8)
        int sumOfDigits = 0;
        while (number > 0) {
            // extract the least significant digit
            int digit = number % 10;
            sumOfDigits += digit;

            // drop the least significant digit
            number /= 10;
        }
        return sumOfDigits;
        }

}

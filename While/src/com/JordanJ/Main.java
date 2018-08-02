package com.JordanJ;

public class Main {

    public static void main(String[] args) {

    //  'while'
        int count = 1;
        while (count != 6) {
            System.out.println("'while' Count value is " + count);
            count++;
        }

    //  'while true'
        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("'while true' Count value is " + count);
            count++;
        }

    //  'do while'
        count = 6;
        do {
            System.out.println("'do while' Count value was " + count);
            count++;
            if (count > 10) {
                break;
            }
        } while (count != 6);

    //  'while' challenge
        int evenNum = 4;
        int endNum = 100;
        count = 1;
        while (evenNum <= endNum) {
            if (isEvenNumber(evenNum)) {
                System.out.println("The even number evenNum is " + evenNum);
                evenNum++;
                if (count >= 20) {
                    System.out.println("Total even numbers found = " + count);
                    break;
                } else {
                    count++;
                }
            }
            evenNum++;
        }

    }

    public static boolean isEvenNumber(int evenNum) {
        if ((evenNum % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

}

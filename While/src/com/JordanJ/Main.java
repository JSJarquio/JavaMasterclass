
/*
    The while loop checks the condition at the start before executing the block.
    With the do while loop the code block is executed at once and then the condition is checked.
    Be careful with conditions, it is easy to end up with an endless loop in other words a loop that never end or to end up with a loop that never executes.
    Tip: always check your conditions/expressions.
    We can interrupt the loop by using a continue and/or a break statement.
    With the continue keyword the loop will bypass the part of the code block that is below the continue keyword and continue with the next iteration.
    With the break keyword we can exit the loop depending on the condition that we are checking.
 */
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

    //  'do while' (executes at least once)
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

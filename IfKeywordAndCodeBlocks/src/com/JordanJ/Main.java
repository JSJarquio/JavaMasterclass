package com.JordanJ;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

/*
        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000, but greater than 1000");
            System.out.println("This was executed");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }
*/
        if (gameOver == true) { // if (gameOver == true) is the same as if (gameOver)
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // int savedFinalScore = finalScore; << this is not valid...
        // since the finalScore variable was created inside of a code block {}
        //     it may not be accessed outside of the code block
        //     which known as "scope"

        // variables created previously are being reused to save memory
        // also, duplicating code may create errors if any changes to be made were missed
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


    }
}

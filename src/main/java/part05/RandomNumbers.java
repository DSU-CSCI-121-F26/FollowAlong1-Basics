package part05;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3850s
//        random numbers start at about 64:10 — stop at about 68:28
// Guide: GUIDE.md in this folder, steps 11–16
//
// Part 05 — random numbers: nextInt, nextDouble, nextBoolean
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called RandomNumbers.
//    (Do NOT name it Random. Java already has a class called Random.)
//    Leave the "package part05;" line and the "public class RandomNumbers" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

import java.util.Random;
// declare a public class RandomNumbers
public class RandomNumbers {
    //a program that runs the main method
    public static void main(String[] args) {
        //creates a Random so we can call nextInt,nextDouble,and nextBooleean
        Random random = new Random();
        //Generates a random integer
        int x1 = random.nextInt(6) + 1;
        //prints the random integer
        System.out.println(x1);
        //Generates a random double between 0.0 and 1.0
        double y = random.nextDouble();
        //prints teh random double
        System.out.println(y);
        //generate a random boolean: either true or false
        boolean z = random.nextBoolean();
        //prints the random boolean
        System.out.println(z);

    }
}

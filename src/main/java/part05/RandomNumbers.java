package part05;
// brings in Java's built-in Random class so we can generate random values
import java.util.Random;


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



// class named RandomNumbers the file name must match since it's public
public class RandomNumbers {
    // The start of the program
    public static void main(String[] args) {
        // creates a Random object (a random number generator) and stores it in the variable random
        Random random = new Random();
        // nextInt(6) gives 0-5, adding 1 shifts it to 1-6 (like rolling a die); stored in x
        int x = random.nextInt(6) + 1;
        // prints the dice roll
        System.out.println(x);
        // nextDouble() gives a decimal from 0.0 up to but not including 1.0; stored in y
        double y = random.nextDouble();
        // prints the random decimal
        System.out.println(y);
        // nextBoolean() gives true or false with roughly 50/50 odds and its stored in z
        boolean z = random.nextBoolean();
        // prints true or false
        System.out.println(z);
    }

}

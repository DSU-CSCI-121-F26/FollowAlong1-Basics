package part05;
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

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random(); // Creates a new Random object to generate pseudo-random numbers

        // Generates a random integer from 0 to 5, adds 1 to make it 1 to 6 (like a die roll), and stores it in x
        int x = random.nextInt(6) + 1;
        // Prints the randomly rolled die number
        System.out.println(x);

        // Generates a random decimal number between 0.0 and 1.0 and stores it in y
        double y = random.nextDouble();
        // Prints the random decimal value
        System.out.println(y);

        // Generates a random true or false boolean value and stores it in z
        boolean z = random.nextBoolean();
        // Prints the random true or false value
        System.out.println(z);
    }

}



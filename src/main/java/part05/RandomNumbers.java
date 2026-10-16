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
        Random rand = new Random();
        // generating a random integer that is bound between 6 and 1 then because the plus one basically moves where the starting value is from 0 to 1
        int x = rand.nextInt(6) + 1;
        System.out.println(x);
        // generates a random double number with no bound
        double y = rand.nextDouble();
        System.out.println(y);
        // generates a random output of a true or false
        boolean z = rand.nextBoolean();
        System.out.println(z);




    }

}

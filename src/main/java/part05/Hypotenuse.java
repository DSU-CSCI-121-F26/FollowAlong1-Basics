package part05;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3689s
//        the hypotenuse project starts at about 61:29 — stop at about 63:52
// Guide: GUIDE.md in this folder, steps 7–10
//
// Part 05 — a project that uses the Math class: find the long side of a triangle
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Hypotenuse.
//    Leave the "package part05;" line and the "public class Hypotenuse" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // declaring all the values
        double x;
        double y;
        double z;
        // asking for the side values with user input.
        System.out.println("Enter side x: ");
        x = scnr.nextDouble();
        // asking for the side values with user input
        System.out.println("Enter side y: ");
        y = scnr.nextDouble();
        // calculating the hypotenuse using the formula based off of the user inputted value and then printing it out in the format
        z = Math.sqrt((x * x) + (y * y));
        System.out.println("The hypotenuse is: " + z);
        scnr.close();

    }

}

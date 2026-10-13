package part05;
import java.util.Scanner;
// import to be able to use the scanner for input

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


// class named Hypotenuse; public, so the file must be named Hypotenuse.java
public class Hypotenuse {
    // entry point: the program starts running here
    public static void main(String[] args) {
        // declares x to hold the first side of the triangle (no value yet)
        double x;
        // declares y to hold the second side
        double y;
        // declares z to hold the hypotenuse once it's calculated
        double z;
        // creates a Scanner
        Scanner scanner = new Scanner(System.in);
        // tells the user for side x
        System.out.println("Enter side x: ");
        // waits for the user to type a decimal number and stores it in x
        x = scanner.nextDouble();
        // prompts the user for side y
        System.out.println("Enter side y: ");
        // waits for a decimal number and stores it in y
        y = scanner.nextDouble();
        // Pythagorean theorem: c = sqrt(a^2 + b^2); squares each side by multiplying, adds, then takes the square root
        z = Math.sqrt((x * x) + (y * y));
        // prints the label followed by the calculated hypotenuse
        System.out.println("The hypotenuse is: " + z);
        // closes the Scanner to stop reading input
        scanner.close();
    }

}

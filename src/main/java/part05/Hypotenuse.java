package part05;
import java.util.Scanner;
import java.util.Random;
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
        double x; // Declares a decimal variable to store the first triangle side length
        double y; // Declares a decimal variable to store the second triangle side length
        double z; // Declares a decimal variable to store the calculated hypotenuse
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object to read user input from the keyboard
        System.out.println("Enter side x: "); // Prompts the user to type in the length for side x
        x = scanner.nextDouble(); // Captures the user's keyboard input and stores it in x
        System.out.println("Enter side y: ");// Prompts the user to type in the length for side y
        y = scanner.nextDouble(); // Captures the user's keyboard input and stores it in y
        z = Math.sqrt((x * x) + (y * y)); // Applies the Pythagorean theorem (a² + b² = c²) and takes the square root to find the hypotenuse
        System.out.println("The hypotenuse is: " + z); // Prints out the final calculated hypotenuse result
        scanner.close(); // Closes the scanner to free up system resources


    }

}

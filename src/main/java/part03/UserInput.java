package part03;
import java.util.Scanner;
// imports the tools necessary to use the built-in scanner in java

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        starts at about 39:25 — stop at about 47:00, after "that is how scanners work"
// Guide: GUIDE.md in this folder, steps 5–11
//
// Part 03, topic 2 — reading what the user types (Scanner)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this file.
//    His class is called Main. Yours is called UserInput.
//    Leave the "package part03;" line and the "public class UserInput" line alone.
//    He types an import line ABOVE the class. Type yours on the empty line
//    under "package part03;".
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. That includes the import line.
// publicly access class called UserInput
public class UserInput {
    // the start of the program
    public static void main(String[] args){
        // scanner object from the scanner class being initialized
        Scanner scanner = new Scanner(System.in);

        // question for user prints what is your name to read their name into the scanner
        System.out.println("What is your name?");

        // makes a variable that contains the name of the person typing it into the scanner
        String name = scanner.nextLine();

        // prints: How old are you to the console
        System.out.println("How old are you?");

        // uses an int variable named age that reads a number from the scanner and waits for the user to press enter
        int age = scanner.nextInt();
        // we put this here so we can empty the scanner to get another user input
        scanner.nextLine();

        // if you put a string into the age it gives an exception in thread "currentfile" since its not an int

        // prints what is your favorite food?
        System.out.println("What is your favorite food?");

        // makes a string var named food that reads the food item from the scanner
        String food = scanner.nextLine();

        // prints: Hello + the name that was given to the scanner
        System.out.println("Hello " + name);

        // prints you are the age the scanner holds with years old
        System.out.println("You are " + age + " years old");

        // prints: you like the food the scanner gave
        //ex. you like pizza
        System.out.println("You like " + food);
    }

}

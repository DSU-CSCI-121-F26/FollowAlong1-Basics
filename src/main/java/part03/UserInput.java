package part03;

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

import java.util.Scanner;
//a public class of UserInput
public class UserInput {
    //the psvm that runs the code
    public static void main(String[] args) {
        //Scanner object with the variable scanner
        Scanner scanner = new Scanner(System.in);
        //prints what is your name
        System.out.println("What is your name");
        //user inputs there name
        String name = scanner.nextLine();
        //prints Hello with the variable name from scanner
        System.out.println("Hello "+name);
        //prints how Old are you
        System.out.println("How old are you");
        //prints int age variable that scanner.nextInt();
        int age = scanner.nextInt();
        //clears the \n
        scanner.nextLine();
        //prints you are plus the int vairable age years old
        System.out.println("You are "+age+" years old");
        //prints what is your favorite food?
        System.out.println("What is your favorite food?");
        //variable food on the nextLine()
        String food = scanner.nextLine();
        //prints you like + the variable food
        System.out.println("You like "+food);
    }

}

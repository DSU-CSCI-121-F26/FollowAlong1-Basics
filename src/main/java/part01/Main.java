package part01;
// tells java this is apart of the part01 folder

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=470s
//        starts at 7:50 — stop at about 17:30, at "tips and tricks"
// Guide: GUIDE.md in this folder — the same lesson, written out step by step
//
// Part 01 — print, println, escape sequences, comments
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. So is yours.
//    Leave the "package part01;" line alone. Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

// declares a public class where it stores the template for the Main class
public class Main {
    // the start of the program
    public static void main(String[] args) {
        // line 24 prints I Love Pizza, when you want to tab or create a space its just back-slash and the character in quotes
        // ex. tab - \t | new line - \n | out is the object and println is how we print it, System is the class
        // make quotes in parentheses by using backslash - \
        System.out.println("\t\"I Love Pizza\"\n");

        // Line 28 It's really good \
        // putting 2 backslashes makes one appear like python, one produces an error
        System.out.println("It's really good \\ ");

        // this is a comment
        /* everything
        between these lines
        is a comment
         */
    }

}

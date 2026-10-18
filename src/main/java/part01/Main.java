package part01;

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
// this line defines the name of the class
public class Main {
    // main method that lets java know our program is executable
    public static void main(String[] args) {

        /* prints out the text written within the line below using \t along with \" to put quotes around
        our text along with a \n to move our second line of text beneath our first
         */
        System.out.print("\t\"I love pizza\"\n");
        // prints out it's really good with a new line and double slash
        System.out.println("\n It's really good \\ ");
        // This is a comment
        /* This is a longer form
        of the same comment
         */
    }
}

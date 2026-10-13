package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2888s
//        starts at about 48:08 — stop at about 52:25, at "get started with expressions"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 04, topic 1 — expressions: + - * / % ++ -- and casting
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Expressions.
//    Leave the "package part04;" line and the "public class Expressions" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// a publicly accessed class called expressions
public class Expressions {
    // the start  of the class
    public static void main(String[] args) {
        // declaration of an double with the name friends assigned to 10
        double friends = 10;

        // friends is assigned to the value in friends 10 divided by 3 and casted to a double
        friends = (double) friends / 3;

        // prints 3.3333333333333335
        System.out.println(friends);
    }

}

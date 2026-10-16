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

public class Expressions {
    public static void main(String[] args){
        // line datatype double named friends of value 10
        double friends = 10;
        //divides variable named friends by 3 after casting it a double and updates its value
        friends = (double)friends / 3;
        //prints updated value of our variable friends to the console
        System.out.println(friends);
    }

}

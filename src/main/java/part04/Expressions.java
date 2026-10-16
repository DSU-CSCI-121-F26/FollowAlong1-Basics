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
    public static void main(String[] args) {
        // assigning friends with a variable and it being 10 then changing it to add 1
        int friends = 10;
        friends = friends + 1;
        System.out.println(friends);
        // subtracting 1 from friends and printing out 10.
        friends = friends - 1;
        System.out.println(friends);
        // multiplying friends times 2 and printing out 20
        friends = friends * 2;
        System.out.println(friends);
        // dividing friends by 2 and printing the output 10
        friends = friends / 2;
        System.out.println(friends);
        // friends modlous 3 so with modlous it ouputs the remainder so the output would be 1
        friends = friends % 3;
        System.out.println(friends);
        // 1 modlous 2 is equivalent to 1 because when you modlulos it by a number bigger it outputs the same number
        friends = friends % 2;
        System.out.println(friends);
        // subtracting 1 from 1 so it would output 0
        friends--;
        System.out.println(friends);
        // adding 1 so its going to ouput 1
        friends++;
        System.out.println(friends);
        // 1 divided by 3 in real life is equivalent to .33333 but its not a double so the answer is 0
        friends = friends / 3;
        System.out.println(friends);
        // it would output the actual answer since we are typecasting from an int to a double but intellej being a lil dumb but real output is 0.3333
        friends = (int) ((double) friends / 3);
        System.out.println(friends);
    }

}

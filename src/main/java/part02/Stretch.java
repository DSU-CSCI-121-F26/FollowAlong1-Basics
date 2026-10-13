package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1743s
//        rewatch 29:00–35:00 if you forget how to make a variable of each type
// Guide: GUIDE.md in this folder, steps 4–10
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        /* My Guess:
        I think it will print out 7,7.0,14,a:7,"14",14!,97,true
         */
      /*  int a = 7;
        double b = 7;
        System.out.println(a);
        System.out.println(b);
        System.out.println("a + b");//I didnt see the quotation
        System.out.println("a: " + a);
        System.out.println("" + a + a);//since its concaenetion the empty strings makes the two varibales "77"
        System.out.println(a + a + "!");
        char c = 'A';
        System.out.println(c);//I thought it prints the character number
        boolean on = true;
        System.out.println(on);

       */
        String name = "Lu-kee Tucker";
        int age = 20;
        double gpa = 3.4;
        boolean commuter = false;
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("GPA:"+gpa);
        System.out.println("Commuter:"+commuter);
        char grade = 'A';
        int credits = 15;
        double balance = 102.75;
        boolean fullTime = true;
        String major = "Computer Science";
        System.out.println(" "+grade+" "+credits+" "+balance+" "+fullTime+" "+major);

        String city = "Dover";
        long people = 4000000000L;
        char grade1 = 'B';
        double temp = 72.5;
        System.out.println(city + " " + people + " " + grade + " " + temp);


    }

}

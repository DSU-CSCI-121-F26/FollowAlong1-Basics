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
        int a = 7;
        double b = 7;
        System.out.println(a);
        System.out.println(b);
        System.out.println("a + b");
        System.out.println("a: " + a);
        System.out.println("" + a + a);
        System.out.println(a + a + "!");
        char c = 'A';
        System.out.println(c);
        boolean on = true;
        System.out.println(on);

        /* my guess is the code will print
        7
        7.0
        a + b
        a: 7
        14 I thought it would do arithmetic here and just add the string over the arithmetic
        14!
        A
        true
         */
        String Name = "Jaidyn";
        int AGE = 19;
        double T = 4.0;
        boolean V = true;

        System.out.println("name: " + Name);
        System.out.println("AGE: " + AGE);
        System.out.println("GPA: " + T);
        System.out.println("Will pass this class: " + V);

        char j = 'J';
        int N = 4;
        float nice = 15.5f;
        boolean drink = true;
        System.out.println(j + " takes " + N + " classes in Computer Science, for " + nice + " credit hours. Has a job: " + drink);

        // tye string was not capitalized for this datatype
        String city = "Dover";
        // the value for the datatype forgot to include L at the end
        long people = 4000000000L;
        // this datatype forgot its value needed single quotes not double
        char grade = 'B';
        // a float must always hae an f at the end of its prescribed value
        float temp = 72.5f;
        System.out.println(city + " " + people + " " + grade + " " + temp);






    }



}
/*
int Vector = 25;
        System.out.println(Vector);
boolean Three = true;
        System.out.println(Three);
short m = 90;
        System.out.println(m);
char Quantity = '%';
        System.out.println(Quantity);
long Funds = 4000000000L;
        System.out.println(Funds);
float I = 0.23f;
        System.out.println(I);
double fine = 2.75;
        System.out.println(fine);
String PS5 = "Kratos";
        System.out.println("Farewell " + PS5); */
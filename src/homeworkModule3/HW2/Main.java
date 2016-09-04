package homeworkModule3.HW2;

/*

 Write class named Arithmetic with a method named add that takes
 integers as parameters and returns an integer denoting their sum.

 Write class named Adder that inherits from a superclass named Arithmetic.
 Also class Adder must contain method check that compare two numbers and returns true if a>=b and false in other cases.

 Methods signature:
 int add(Integer a, Integer b)
 boolean check(Integer a, Integer b)

 */
public class Main {

    public static void main(String[] args) {

        Adder result = new Adder();

        System.out.println(result.check(120, 90));
        System.out.println(result.add(120, 90));

    }

}

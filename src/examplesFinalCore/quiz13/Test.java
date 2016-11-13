package examplesFinalCore.quiz13;

/**
 * Created by Sergiy on 11/13/16.
 */

public class Test {
    public static void main(String args[]) {
        int i=1, j=1;
        try {
            i++;
            j--;
            if(i == j)
                i++;
        }
        catch(ArithmeticException e) {
            System.out.print(0);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.print(1);
        }
        catch(Exception e) {
            System.out.print(2);
        }
        finally {
            System.out.print(3);
        }
        System.out.print(4);
    }
}

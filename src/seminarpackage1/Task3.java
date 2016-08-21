
public class Task3 {

    static long containsCount(long[] array, int n) {

         //n - 4islo, kotore ishem

        int k = 0;

        for(long item : array) {
            if (item == n) {
                k++;
            }


        }
        return k;
    }



    public static void main(String[] args) {

        long[] array = {10, 2, 4, 6, 7, 12, 321, 42, 42, 42};

        int n = 42;

        long result = containsCount(array, n);

        if(result == 1) {
            System.out.println("yes");
            return;
        }

        if(result == 0){
            System.out.println("no");
        }

        if (result > 1) {
            System.out.println(result);
        }


    }
}

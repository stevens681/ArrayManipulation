import java.util.ArrayList;
import java.util.List;

public class Result {
    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
        long res = 0, sum = 0;  //These will hold the result and the sums.

        //Creates and array the longs with a size of n+1.
        long[] arr = new long[n+1];

        //Iterates the list and gets the position.
        for(List<Integer> i: queries) {
            //Adds to the array
            int a = i.get(0);   //a
            int b = i.get(1);   //b
            int k = i.get(2);   //k
            arr[a-1] += k;      //Position a -1;
            arr[b] -= k;        //Position b
        }
        //Sums the array and gets the max value.
        for(int i = 0; i<n; i++){
            sum += arr[i];
            res = Math.max(res, sum);
        }

        
        return res;

    }

    public static void main(String[] args) {
        String list = """
                1 2 100
                2 5 100
                3 4 100""";
        List<List<Integer>> arr = new ArrayList<>();

        String[] split = list.split("\n");

        for(int i = 0; i<list.split("\n").length; i++){

            String[] space = split[i].split("\\s");
            List<Integer> hold = new ArrayList<>();
            for (String s : space) {
                hold.add(Integer.parseInt(s));
            }
            if(!hold.isEmpty())
                arr.add(hold);

        }
        System.out.println(arrayManipulation(5,arr));


    }
}

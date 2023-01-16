import java.lang.reflect.Array;
import java.util.Arrays;

import javafx.print.Collation;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        // first combine the two arr length together before combine the elements
        int length = arr1.length + arr2.length;
        int [] result = new int[length];
        // declare a variable to assign a position for the elements
        int position = 0;
        
        //loop through the arr1 & arr2 to copy the elements 
        for(int e : arr1){
            result[position] = e;
            position ++;
        }
        for(int e : arr2){
            result[position] = e;
            position++;
        }

        return result;
    }
}

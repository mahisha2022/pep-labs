
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        
        String longestChar = arr[0];
        //loop through the arr to get the longest string
        for(int i = 0; i <= arr.length-1; i++){
            if(arr[i].length() > longestChar.length())
            longestChar = arr[i];
        }

        return longestChar;
    }
}

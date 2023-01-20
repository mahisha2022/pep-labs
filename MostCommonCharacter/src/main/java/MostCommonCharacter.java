import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        
        HashMap<Character, Integer> newChar = new HashMap<Character, Integer>();
        
        char[] newStr = str.toCharArray();
        for(char n: newStr){
            if(newChar.containsKey(n)){
                newChar.put(n, newChar.get(n) + 1);   
            }
            else{
                newChar.put(n, 1);
            }

            //print the newChar count 
            for (Map.Entry e : newChar.entrySet()) {
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }
    }
}

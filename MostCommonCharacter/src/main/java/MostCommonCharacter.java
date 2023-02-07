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
        
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else {
                map.put(ch, 1);
            }
        }
        int max = 0;
        char maxOccuringChar = ' ';
        for (Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                maxOccuringChar = entry.getKey();
            }
        }
        return maxOccuringChar;

    }
    
}

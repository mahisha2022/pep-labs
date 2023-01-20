
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        int count = 0; 
        char newchar [] = new char[in.length()];
        for(int i = 0; i< in.length(); i++){
            newchar[i] = in.charAt(i);
            if( (( i > 0) && (newchar[i] != ' ') && (newchar[i-1] == ' ')) || ((newchar[0] != ' ') && (i == 0)) )  
            count++; 
        }

        return count;
    }
}

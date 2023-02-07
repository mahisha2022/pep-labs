
public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in){
    
        String pigLatin = "";
        if(in.charAt(0) == 'a' || in.charAt(0) == 'e' || in.charAt(0) == 'i'
                || in.charAt(0) == 'u' || in.charAt(0) == 'o'){
            pigLatin = in + "way";
        } else {
            pigLatin = in.substring(1) + in.charAt(0) + "ay";
        }
        return pigLatin;
    
    }
}

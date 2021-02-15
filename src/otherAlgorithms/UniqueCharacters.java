package otherAlgorithms;

public class UniqueCharacters {

    public static boolean areAllCharactersUnique(String str){
        // If there's just one char in the String, return true
        if(str == null || str.length() <= 1) return true;
        // 2^8 = 256. Covers all characters in ASCII. Make Checker array
        boolean[] checker_array = new boolean[256];
        // Loop across all characters in String.
        for(int i=0;i<str.length();i++){
            // Check the position specified by the character's 8 bit value.
            // Since this is cast as an int, it will be a numerical value!
            int position = str.charAt(i);
            // If the position already had a true value, this is a duplicate
            if(checker_array[position]) return false;
            checker_array[position] = true;
        }
        // Return true if no duplicates
        return true;
    }
}

package otherAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class CharactersNumbers {

    public static Map returnNumberOfCharacters(String str) {
//        List<Character> returnedArray = new ArrayList<>();
        Map<Character, Integer> numberOfCharacters = new HashMap<Character, Integer>();
        int i, length;
        Character c;
        length = str.length(); // Scan string and build hash table
        for (i = 0; i < length; i++) {
            c = str.charAt(i);
            if (numberOfCharacters.containsKey(c)) {
                // Increment count corresponding to c
                numberOfCharacters.put(c, numberOfCharacters.get(c) + 1);
            } else {
                numberOfCharacters.put(c, 1);
            }
        }
        return numberOfCharacters;
    }
}

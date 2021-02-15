package popularAlgorithms;

public class Anagram {

    public static boolean isStringAnagram(String firstWord, String secondWord) {
        StringBuilder storeLetters = new StringBuilder();
        for (int i = 0; i < firstWord.length(); i++) {
            for (int j = 0; j < secondWord.length(); j++) {
                if (firstWord.charAt(i) == secondWord.charAt(j)) {
                    storeLetters.append(secondWord.charAt(j));
                }
            }
        }
        return storeLetters.length() == firstWord.length();
    }
}

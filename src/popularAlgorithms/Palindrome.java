package popularAlgorithms;

public class Palindrome {

    public static boolean isStringPalindrome(String str) {

        if (str == null) {
            return true;
        }

        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        if (str.equals(reversedString)) {
            return true;
        } else {
            return false;
        }
    }
}

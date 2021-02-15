import static helpers.Printing.print;
import static otherAlgorithms.SingleNumber.getSingleNumberFromSequence;
import static popularAlgorithms.Anagram.isStringAnagram;
import static popularAlgorithms.Fibonacci.returnFibonacciSequence;
import static popularAlgorithms.Palindrome.isStringPalindrome;
import static searchingAlgorithms.BinarySearch.binarySearch;

public class Main {

    public static void main(String[] args) {
        print(binarySearch(new int[]{1, 5, 3, 8, 2},5));
        print(isStringPalindrome("redivider"));
        print(returnFibonacciSequence(10));
        print(isStringAnagram("abcdefg","agbfced"));
        print(getSingleNumberFromSequence("usingHashMap",new int[]{1, 5, 3, 8, 2}));
    }
}

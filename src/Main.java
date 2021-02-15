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
        int[] sequenceWithSingleNumber = {1,1,1,2,2,3,3,4,4,4,5};
        print(getSingleNumberFromSequence("usingHashMap", sequenceWithSingleNumber));
    }
}

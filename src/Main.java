import static helpers.Printing.print;
import static otherAlgorithms.CharactersNumbers.returnNumberOfCharacters;
import static otherAlgorithms.DuplicateNumbers.getDuplicateNumbers;
import static otherAlgorithms.Flip.flipItVerticalAxis;
import static otherAlgorithms.SingleNumber.getSingleNumberFromSequence;
import static otherAlgorithms.UniqueCharacters.areAllCharactersUnique;
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
        print(getSingleNumberFromSequence("usingRawLoops", sequenceWithSingleNumber));
        print(getSingleNumberFromSequence("usingStreams", sequenceWithSingleNumber));
        print(returnNumberOfCharacters("aaaafdafsdefsxdgnooggogojogf"));
        print(getDuplicateNumbers(new int[]{1, 5, 3, 8, 2, 2, 1, 1}));
        print(areAllCharactersUnique("abc"));
        int[][] matrix2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print(matrix2D);
        flipItVerticalAxis(matrix2D);
        print(matrix2D);
    }
}

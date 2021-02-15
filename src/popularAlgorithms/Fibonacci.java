package popularAlgorithms;

public class Fibonacci {

    public static int returnFibonacciDigit(int n) {
        if (n <= 1) {
            return n;
        } else {
            return returnFibonacciDigit(n - 1) + returnFibonacciDigit(n - 2);
        }
    }

    public static int[] returnFibonacciSequence(int range){
        int[] sequence = new int[range];
        for (int i = 1; i <= range-1; i++) {
            sequence[i] = returnFibonacciDigit(i);
        }
        return sequence;
    }
}

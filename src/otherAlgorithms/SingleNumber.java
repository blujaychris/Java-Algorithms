package otherAlgorithms;

import java.util.*;
import java.util.stream.Collectors;

public class SingleNumber {

    static long startTime;
    static long elapsedTime;

    public static int getSingleNumberFromSequence(String choice, int[] sequence) {

        int result;
        switch (choice) {
            case "usingHashMap":
                startTime = System.nanoTime();
                result = usingHashMap(sequence);
                elapsedTime = System.nanoTime() - startTime;
                System.out.println("Total execution time to create 1000K objects in Java in millis: " + elapsedTime);
                break;
            case "usingRawLoops":
                startTime = System.nanoTime();
                result = usingRawLoops(sequence);
                elapsedTime = System.nanoTime() - startTime;
                System.out.println("Total execution time to create 1000K objects in Java in millis: " + elapsedTime);
                break;
            case "usingStreams":
                startTime = System.nanoTime();
                result = usingStreams(sequence);
                elapsedTime = System.nanoTime() - startTime;
                System.out.println("Total execution time to create 1000K objects in Java in millis: " + elapsedTime);
                break;
            default:
                result = 0;
        }

        return result;
    }

    private static int usingHashMap(int[] sequence) {
        Map<Integer, Integer> numbersTable = new HashMap<>();
        int length;
        Integer number;
        length = sequence.length;
        for (int i = 0; i < length; i++) {
            number = sequence[i];
            if (numbersTable.containsKey(number)) {
                numbersTable.put(number, numbersTable.get(number) + 1);
            } else {
                numbersTable.put(number, 1);
            }
        }
        for (int i = 0; i < length; i++) {
            number = sequence[i];
            if (numbersTable.get(number) == 1) {
                return number;
            }
        }
        return 0;
    }

    private static int usingRawLoops(int[] sequence) {
        boolean repeated = false;
        for (int i = 0; i < sequence.length; i++) {
            for (int j = 0; j < sequence.length; j++) {
                if (j == i) {
                    continue;
                }
                if (sequence[i] == sequence[j]) {
                    repeated = true;
                    break;
                }
            }
            if (repeated) {
                repeated = false;
            } else {
                return sequence[i];
            }
        }
        return 0;
    }
    public static int usingStreams(int[] A) {
        if (A == null || A.length < 1) return 0;

        List<Integer> list = Arrays.stream(A)
                .boxed()
                .collect(Collectors.toList());

        for (Integer i : list) {
            if (Collections.frequency(list, i) <= 1) {
                return i;
            }
        }
        return 0;
    }
}


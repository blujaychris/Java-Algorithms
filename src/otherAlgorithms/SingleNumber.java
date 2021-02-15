package otherAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int getSingleNumberFromSequence(String choice, int[] sequence) {
        int result;
        switch (choice) {
            case "usingHashMap":
                result = usingHashMap(sequence);
                break;
            case "usingRawLoops":
                result = usingRawLoops(sequence);
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
}


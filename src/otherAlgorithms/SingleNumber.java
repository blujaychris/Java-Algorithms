package otherAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int getSingleNumberFromSequence(String choice, int[] sequence) {
        int result;
        switch (choice) {
            case "usingHashTable":
                result = usingHashTable(sequence);
                break;
            default:
                result = 0;
        }
        return result;
    }

    private static int usingHashTable(int[] sequence) {
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
}


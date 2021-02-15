package helpers;

import java.util.Map;

public class Printing {

    public static void print(boolean parameter) {
        System.out.println(parameter);
    }

    public static void print(boolean[] parameter) {
        for (int i = 0; i < parameter.length; i++) {
            System.out.println(parameter[i]);
        }
    }

    public static void print(String parameter) {
        System.out.println(parameter);
    }

    public static void print(String[] parameter) {
        for (int i = 0; i < parameter.length; i++) {
            System.out.println(parameter[i]);
        }
    }

    public static void print(int parameter) {
        System.out.println(parameter);
    }

    public static void print(int[] parameter) {
        for (int i = 0; i < parameter.length; i++) {
            System.out.println(parameter[i]);
        }
    }

    public static void print(Map<Character, Integer> parameters) {
        for (Map.Entry<Character, Integer> entry : parameters.entrySet())
            System.out.println("Character = " + entry.getKey() +
                    ", Quantity = " + entry.getValue());
    }

    public static void print(int[][] parameter) {
        for (int i = 0; i <= parameter.length - 1; i++) {
            for (int j = 0; j <= parameter[0].length - 1; j++) {
                System.out.print(parameter[i][j] + " ");
            }
            System.out.println();
        }
    }
}

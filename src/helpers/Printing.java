package helpers;

public class Printing {

    public static void print(boolean parameter) {
        System.out.println(parameter);
    }

    public static void print(boolean[] parameter) {
        for (int i=0; i < parameter.length; i++) {
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
}

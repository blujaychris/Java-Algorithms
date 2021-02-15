package otherAlgorithms;

public class Flip {

    public static void flipItVerticalAxis(int[][] matrix) {
        int x = matrix.length - 1, y = matrix[0].length - 1;
        int temp = 0;
        for (int i = 0; i <= x/2; i++) {
            for (int j = 0; j <= y; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[x-i][j];
                matrix[x-i][j] = temp;
            }
        }
    }

}

package homework.hw3;

/**
 * Created by Tonja on 15.02.2015.
 */
public class TwoDimentionalArray {
    public static void main(String[] args) {
        int[][] matrix = new int[8][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 90+10);
                System.out.print(matrix[i][j] + " ");
            }System.out.println();
        }
    }
}
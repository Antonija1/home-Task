package homework.hw3;

/**
 * Created by Tonja on 16.02.2015.
 */
public class TwoArray {
    public static void main(String[] args) {
        int[][] matrix = new int[7][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 11 - 5);
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }
        int[]mas = new int[7];
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if (j == 0) {
                    mas[i] = matrix[i][j];
                } else mas[i] *= matrix[i][j];
            }
        }
        int max=0;
        int maxi=0;
        for(int i=0;i<mas.length;i++){
            if(Math.abs(mas[i])>max){
                max=mas[i];
                maxi=i;
            }
        }
        System.out.println("The string with the highest modulus product of elements( "+max+" )has an index "+maxi);
    }

}

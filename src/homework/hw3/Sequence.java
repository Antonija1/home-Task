package homework.hw3;

/**
 * Created by Tonja on 14.02.2015.
 */
public class Sequence {
    public static void main(String[] args) {
        // simple solution: System. out. print (1 1 2 3 5 8 13 21 34 55 89);
        int a=1;
        int b=1;
        int fibon = 0;
        System.out.printf("sequence fibonaci " + a+ " " +b );
        for (int i=3; i<=11; i++) {
            fibon = a + b;
            a = b;
            b = fibon;

            System.out.printf("  " + fibon);
        }
    }
}

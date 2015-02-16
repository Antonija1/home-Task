package homework.hw3;

/**
 * Created by Tonja on 15.02.2015.
 */
public class SummetryHours {
    public static void main(String[] args) {
        int k = 0;
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m <= 59; m++) {
                int h1= h/10;
                int h2= h%10;
                int m1= m/10;
                int m2= m%10;
                if ((h1 == m2) && (h2 == m1)) {
                  k = k + 1;
                } else k = k;

            }

        }System.out.println("symmetry was just hours  " +k );
    }
}

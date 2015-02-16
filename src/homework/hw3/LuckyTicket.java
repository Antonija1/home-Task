package homework.hw3;

/**
 * Created by Tonja on 15.02.2015.
 */
public class LuckyTicket {
    public static void main(String[] args) {
        int k = 0;
        for (int n = 1; n <=999999; n++) {
            int a = n / 1000;
            int b = n % 1000;
            int suma = a/100 + (a/10)%10 + a%10;
            int sumb = b/100 + (b/10)%10 + b%10;
            if  ( suma == sumb )
                k=k+1;
            else k = k;
        }
        System.out.println("Number of lucky ticket  " +k );
    }

}

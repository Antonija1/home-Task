package homework.hw2.exercise9;

/**
 * Created by Tonja on 12.02.2015.
 */
public class Number {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 900 + 100);
        int a = n / 100;
        int b = (n % 100) / 10;
        int c = (n % 10);
        if (a >= b && a >= c) {
            System.out.println("V cisle" + n + "naibolshaja cifra" + a);
        } else if (b >= a && b >= c) {
            System.out.println("V cisle" + n + "naibolshaja cifra" + b);
        } else System.out.println("V cisle" + n + "naibolshaja cifra" + c);
    }
}
package homework.hw3;

import java.util.Scanner;

/**
 * Created by Tonja on 14.02.2015.
 */
public class SumFigure {
    public static void main(String[] args) {
        System.out.println("Enter a positive integer:");
        int n, sum;
        sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println("Sum figures is equals to  " + sum);
    }
}
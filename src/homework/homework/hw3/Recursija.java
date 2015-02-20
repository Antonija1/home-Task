package homework.homework.hw3;

import java.util.Scanner;

/**
 * Created by Tonja on 16.02.2015.
 */
public class Recursija {

    public static int sum(int x) {
        if (x == 0)
            return 0;
        if (x == 1)
            return 1;
        else
            return x + sum(x - 1);

    }

    public static void main(String[] args) {
        System.out.printf(" enter number  n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = sum(n);

        System.out.print(" " + res);

    }


}




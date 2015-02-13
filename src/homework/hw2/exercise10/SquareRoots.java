package homework.hw2.exercise10;

import java.util.Scanner;

/**
 * Created by Tonja on 13.02.2015.
 */
public class SquareRoots {
    public static void main(String[] args) {
        double d, x1, x2;
        System.out.printf(" Vvedite cislo a=  \n  Vvedite cislo b=  \n Vvedite cislo b=  \n");

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            d = b * b - 4 * a * c;
            if (d >= 0) {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b + Math.sqrt(d)) / (2 * a);
                System.out.println(" x1= " + x1 + ", x2=" + x2);
            } else System.out.println("uravnenie ne imeet kornej");
        }
    }
}

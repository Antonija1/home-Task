package homework.hw2.exercise6;

import java.util.Scanner;

/**
 * Created by Tonja on 12.02.2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.printf(" Vvedite chislo n=  \n  Vvedite chislo m=  \n");
        Scanner sc = new Scanner(System.in);
        double  a, b, c;
        c = 10;

        if (sc.hasNextDouble()) {
           double n = sc.nextDouble();
           double m = sc.nextDouble();
            a = Math.abs(n - c);
            b = Math.abs(m - c);
            if (a < b) {
                System.out.println("Cislo" + n + " blige");
            } else if (a > b) {
                System.out.println("Cislo" + m + " blige");
                 } else System.out.println("Cisla na odinakovom rasstojanii ot 10");
        }
    }
}

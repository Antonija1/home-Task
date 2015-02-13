package homework.hw2.exercise8;

import java.util.Scanner;

/**
 * Created by Tonja on 13.02.2015.
 */
public class Triangl {
    public static void main(String[] args) {
        double s, p;

        System.out.printf(" Vvedite katet a=  \n  Vvedite katet b=  \n");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if (a > 0 && b > 0) {
                s = a * b / 2;
                p = a + b + Math.sqrt(a * a + b * b);
                System.out.println("ploshad treugolnika" +s+"\n,perimetr treugolnika"+p);
            } else  System.out.println("nevozmogno vicislit ploshad treugolnika");
        }else System.out.println("Vi vveli ne naturalnoe pologitelnoe cislo");
    }
}
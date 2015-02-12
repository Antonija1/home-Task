package homework.hw2.exercise5;

import java.util.Scanner;

/**
 * Created by Tonja on 12.02.2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.printf("Vvedite naturalnoe pologitelnoe chislo n=");
        int n, a;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            if (n > 0) {
                System.out.println("a=" + (int) (Math.random() * (2 * n + 1) - n) + " chislo iz promegunka  [-n;n] ,");
            } else System.out.println("Vi vveli ne naturalnoe pologitelnoe cislo");
        }else System.out.println("povtorite popitku");
    }
}
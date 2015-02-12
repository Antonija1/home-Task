package homework.hw2.exercise4;

import java.util.Scanner;

/**
 * Created by Tonja on 12.02.2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.printf("Vvedite celoe chislo:");
        int n;
        Scanner sc= new Scanner(System.in);
        if (sc.hasNextInt()){ n =sc.nextInt();
            System.out.println("summa cifr chisla "+n+" ravna "+(n/10+n%10)+""); }
            else System.out.println(" vi vveli ne celoe chislo");
    }
}

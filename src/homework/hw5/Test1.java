package homework.hw5;

import com.sourceit.hometask.basic.FractionNumber;

import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Tonja on 03.03.2015.
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 3; i++){
            System.out.printf(" Enter dividend =  ");
            int dividend = sc.nextInt();
            System.out.printf(" Enter divisor =  ");
            int divisor = sc.nextInt();
            if (divisor == 0) {
                System.out.println("infinity, try again, a divide by zero cannot ");
            }
            FractionNumberClass fractionNumber = new FractionNumberClass(dividend, divisor);
            System.out.println(fractionNumber);




        }


    }
}
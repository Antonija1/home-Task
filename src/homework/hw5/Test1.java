package homework.hw5;

import com.sourceit.hometask.basic.FractionNumber;
import com.sourceit.hometask.basic.FractionNumberOperation;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Test1
 *
 *13.03.2015.
 * Created by Tonja
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("If you want to found fraction number enter 1 \n" +
                "If you want to found fraction number operation enter 2 \n" +
                "If you want to found fraction number array enter 3 \n");
        int option = sc.nextInt();

            if (option == 1) {
            FractionNumberClass fractionNumber = new FractionNumberClass();
            System.out.printf(" Enter dividend =  ");
            fractionNumber.setDividend(sc.nextInt());
            System.out.printf(" Enter divisor =  ");

            fractionNumber.setDivisor(sc.nextInt());
            if (fractionNumber.getDivisor() == 0) {
                System.out.println("infinity,try again, a divide by zero cannot");
            }

            System.out.println("fractionNumber : " + fractionNumber + " = "
                    + fractionNumber.doubleValue());
        }

        if (option == 2) {
            FractionNumberOperationClass f = new FractionNumberOperationClass();

            System.out.printf(" Enter fractionNumber1 in form int a/b, where a-" +
                    " dividend, b-divisor: ");

            FractionNumber fractionNumber1 = f.parseFractionNumber(sc.next());
            System.out.printf(" Enter  fractionNumber2 in form c(enter) d(enter)," +
                    " where c- dividend, d- divisor: ");

            FractionNumber fractionNumber2 = f.parseFractionNumber(sc.next());

            System.out.println();
            System.out.println("addresult: " + f.add(fractionNumber1, fractionNumber2));
            System.out.println("subresult: " + f.sub(fractionNumber1, fractionNumber2));
            System.out.println("mulresult: " + f.mul(fractionNumber1, fractionNumber2));
            System.out.println("divresult: " + f.div(fractionNumber1, fractionNumber2));
            //this part works correctly. But the error could not find. You can help? Disp
            // lays null in every position
        }
        if (option == 3) {
            System.out.println("Enter how mach numbers will bi in array:");
            int n = sc.nextInt();
            FractionNumberClass[] array = new FractionNumberClass[n];
            FractionNumberClass fracnum = new FractionNumberClass();
            for (int i = 0; i < n; i++) {
                fracnum.setDividend((int) (Math.random() * 200 - 100));
                fracnum.setDivisor((int) (Math.random() * 200 + 1));//hat would not have
                                                            // appeared denominator == 0
                array[i] = fracnum;
                System.out.printf(array[i] + "   ");

            }

            System.out.println("\n");


            Arrays.sort(array, new Comparator<FractionNumber>() {
                public int compare(FractionNumber f1, FractionNumber f2) {
                    return (int)(f2.getDividend()/f2.getDivisor()-f1.getDividend()/f1.getDivisor());
                 }
             });
            Arrays.sort(array);
            for (int i = 0; i < n; i++) {
                System.out.print(array[i]+ " ");
            }
        }
    }
}





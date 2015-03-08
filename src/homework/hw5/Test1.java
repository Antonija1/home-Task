package homework.hw5;

import com.sourceit.hometask.basic.FractionNumber;
import com.sourceit.hometask.basic.FractionNumberOperation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Tonja on 03.03.2015.
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("If you want to found fraction number enter 1 \n" +
                "If you want to found fraction number operation enter 2 \n" +
                "If you want to found fraction number array enter 3 \n");
        int option = sc.nextInt();
        if (option == 1) {
            System.out.printf(" Enter dividend =  ");
            int dividend = sc.nextInt();
            System.out.printf(" Enter divisor =  ");
            int divisor = sc.nextInt();
            if (divisor == 0) {
                System.out.println("infinity, try again, a divide by zero cannot ");
            }
            FractionNumberClass fractionNumber = new FractionNumberClass(dividend, divisor);

            System.out.println("fractionNumber : " + fractionNumber + " = " + fractionNumber.doubleValue());
        }

        if (option == 2) {
            FractionNumberOperationClass f = new FractionNumberOperationClass();

            System.out.printf(" Enter  fractionNumber1 in form int a(enter) int b(enter), where a- dividend, b- " +
                    "divisor: ");
            int a = sc.nextInt(); // если я здесь делаю String f1= sc.nextLine, то компилятор выдаёт ошибку-
            int b = sc.nextInt();                       // обошла таким образом
            FractionNumberClass fractionNumber1 = f.parseFractionNumber("" + a/b);//значение получается только int
            System.out.printf(" Enter  fractionNumber2 in form c(enter) d(enter), where c- dividend, d- " +
                    "divisor: ");
            int c = sc.nextInt();
            int d = sc.nextInt();
            FractionNumberClass fractionNumber2 = f.parseFractionNumber("" + c/d);
            System.out.println(fractionNumber1.toString() + " / " + fractionNumber2.toString());
            System.out.println();
            System.out.println("addresult: " + f.add(fractionNumber1, fractionNumber2));
            System.out.println("subresult: " + f.sub(fractionNumber1, fractionNumber2));
            System.out.println("mulresult: " + f.mul(fractionNumber1, fractionNumber2));
            System.out.println("divresult: " + f.div(fractionNumber1, fractionNumber2));
            //this part works correctly. But the error could not find. You can help? Displays null in every position
        }
        if (option == 3) {
            System.out.println("Enter how mach numbers will bi in array:");
            int n = sc.nextInt();
            FractionNumberClass[] array = new FractionNumberClass[n];
            FractionNumberClass fractnum = new FractionNumberClass();
            for (int i = 0; i < n; i++) {
                fractnum.setDividend((int) (Math.random() * 200 - 100));
                fractnum.setDivisor((int) (Math.random() * 200 - 100));
                array[i] = fractnum;
                System.out.println(array[i]);

            }

            Arrays.sort(array, new Comparator<FractionNumberClass>() {
                public int compare(FractionNumberClass f1, FractionNumberClass f2) {
                    return f1.compareTo(f2);
                }
            });

            System.out.println(Arrays.toString(array));
            //strange it sorts all replaces the last sensing element array
        }
    }
}



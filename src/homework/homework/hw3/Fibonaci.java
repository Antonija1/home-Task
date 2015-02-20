package homework.homework.hw3;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Tonja on 18.02.2015.
 */
public class Fibonaci {
    public static int f(int x) {

        if (x == 0)
            return 0;
        if (x == 1)
            return 1;
        else return f(x - 2) + f(x - 1);
    }

    public static void main(String[] args) {
        int a = 15;
        int d = f(a);
        int b = 4;
        int d1 = f(b);
        int k = (int) (f(a) / f(b));
        System.out.println("  " + k + "  times");
    }

}




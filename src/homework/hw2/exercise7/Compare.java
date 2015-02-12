package homework.hw2.exercise7;

/**
 * Created by Tonja on 12.02.2015.
 */
public class Compare {
    public static void main(String[] args) {
        int n=(int)(Math.random()*(150+1)+5);
        if(n>25 &&n<100) {
            System.out.println("cislo" +n+  "sodergitsja v intervale(25,100)");
        }else
            System.out.println("cislo" +n+ " ne sodergitsja v intervale(25,100)");
    }
}

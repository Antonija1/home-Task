package homework.hw6;

import com.sourceit.hometask.exceptions.CustomException;
import com.sourceit.hometask.exceptions.StringUtils;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Tonja on 06.03.2015.
 */
public class Test2 {
    public static void main(String[] args) throws IOException, CustomException {
        StringUtils utils = new StringUtilsClass();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter dividend   ");
        String dividend = sc.nextLine();
        System.out.printf("Enter divisor   ");
        String divisor = sc.nextLine();
        System.out.println(utils.div(dividend, divisor));
        System.out.println();

        System.out.printf("Enter text    ");
        String text = sc.nextLine();
        System.out.printf("Enter word  ");
        String word = sc.nextLine();

        int[] findWords = utils.findWord(text, word);

        for (int k = 0; k < findWords.length; k++) {
            if (k == 0 || findWords[k] != 0) {
                System.out.print( findWords[k] + " ");
            }
        }

        System.out.println();

        text = "hu758yuhjk.uhuit!ug v643vkjh.lnpoi gytdtrsuygv v ;oib987543 v c zsdzdszgfd dd";
        double[] findNumber = utils.findNumbers(text);
        for (int i = 0; i < findNumber.length; i++) {
            System.out.print(  findNumber[i] + " ");
        }
    }
}

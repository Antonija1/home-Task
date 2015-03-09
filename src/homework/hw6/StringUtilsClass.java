package homework.hw6;

import com.sourceit.hometask.exceptions.CustomException;
import com.sourceit.hometask.exceptions.StringUtils;

/**
 * Created by Tonja on 06.03.2015.
 */
public class StringUtilsClass implements StringUtils {


    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException,
            ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException(" number1 or number2 are equal null");
        }
        double dividend;
        double divisor;
        try {
            dividend = Double.parseDouble(number1);
        } catch (Exception e) {
            throw new NumberFormatException("Dividend isn't a number");
        }
        try {
            divisor = Double.parseDouble(number2);
        } catch (Exception e) {
            throw new NumberFormatException("Divisor isn't a number");
        }
        if (divisor == 0) {
            throw new ArithmeticException("You can't divide by O");
        }

        return dividend / divisor;
    }

    @Override

    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null) {
            throw new NullPointerException("Not found or text word");
        }

        text = text.toLowerCase();// текст преобразовала в нижний регистр
        word = word.toLowerCase();
        if (!text.contains(word)) {
            throw new NullPointerException("text not equals  word");
        }
        String[] texts = text.split(" ");// сoздала массив слов используя в качестве разделителя пробел
        String word1 = word.trim();// убрала все пробелы вначале и конце слова
        // if (texts[i].contains(word1) )
        int sum = 0;
        for (int i = 0; i < texts.length; i++) {
            if (word1.equals(texts[i]))
                sum++;
        }
        int findWords[] = new int[sum];
        int j = 0;
        while (j < sum)
            for (int i = 0; i < texts.length; i++) {
                if (!word1.equals(texts[i])) continue;
                findWords[j] = i;
                j++;

            }
        return findWords;
    }

    @Override
    public double[] findNumbers(String s) throws CustomException {
        StringBuilder sb = new StringBuilder(s.subSequence(0, s.length())); // s to make in sb;
        StringBuilder sbil = new StringBuilder();
        int i = 0;
        for (i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i))) {//если текущий символ это цифра, то добавляем его в строку;
                sbil.append(sb.charAt(i));
                if (sbil.length() == 0) {
                    throw new CustomException(" Numbers not found");
                }
            }
        }
        double[] findNumbers = new double[sbil.length()];
        for (i = 0; i < sbil.length(); i++) {
            findNumbers[i] = Double.parseDouble(String.valueOf(sbil.charAt(i)));

        }

        return findNumbers;
    }
}

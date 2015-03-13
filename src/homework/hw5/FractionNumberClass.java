package homework.hw5;

import com.sourceit.hometask.basic.FractionNumber;

/**
 * FractionNumberClass
 *
 * 13.03.2015
 * Created by Tonja
 */
public class FractionNumberClass implements FractionNumber {
    private int dividend;
    private int divisor = FractionNumber.DEFAULT_DIVISOR_VALUE;


    @Override
    public int getDividend() {
        return dividend;
    }

    @Override
    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    @Override
    public int getDivisor() {
        return divisor;
    }

    @Override
    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    @Override
    public double doubleValue() {
        return (double) dividend / divisor;
    }


    @Override
    public int compareTo(FractionNumber fn) {
        return fn.getDividend() / getDivisor() - getDividend() / getDivisor();

    }

    @Override
    public String toString() {
        if ((dividend == 0) || (divisor == 1)) {
            return getDividend() + "";
        }
        return getDividend() + "/" + getDivisor();// + " = " + doubleValue();
    }


}
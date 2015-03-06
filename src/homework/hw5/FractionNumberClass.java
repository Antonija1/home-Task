package homework.hw5;

import com.sourceit.hometask.basic.FractionNumber;

/**
 * Created by Tonja on 05.03.2015.
 */
public class FractionNumberClass implements FractionNumber {
    int dividend;
    int divisor = FractionNumber.DEFAULT_DIVISOR_VALUE;

    public FractionNumberClass(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;

    }

    public FractionNumberClass() {

    }

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
        if (fn instanceof FractionNumberClass) {
            FractionNumberClass fractionNumb = (FractionNumberClass) fn;
            if (doubleValue() != 0) {
                return Double.compare(doubleValue(), fractionNumb.doubleValue());
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        if (dividend == 0 || divisor == 1) {
            return dividend + "";
        }
        return dividend + "/" + divisor + " =" + doubleValue();
    }
}
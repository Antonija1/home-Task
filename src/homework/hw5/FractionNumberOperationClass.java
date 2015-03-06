package homework.hw5;

import com.sourceit.hometask.basic.FractionNumber;
import com.sourceit.hometask.basic.FractionNumberOperation;

/**
 * Created by Tonja on 04.03.2015.
 */
public class FractionNumberOperationClass implements FractionNumberOperation {
    @Override
    public FractionNumber add(FractionNumber fractionNumber, FractionNumber fractionNumber1) {
        if (fractionNumber == null) {
            return fractionNumber1;
        }
        if (fractionNumber1 == null) {
            return fractionNumber;
        }
        FractionNumber addresult = new FractionNumberClass();        //   a/b+c/d=(a*d+c*b)/b*d
        addresult.setDividend(fractionNumber.getDividend() * fractionNumber1.getDivisor() +
                fractionNumber1.getDividend() * fractionNumber.getDivisor());
        addresult.setDivisor(fractionNumber.getDivisor() * fractionNumber1.getDivisor());
        if (addresult.getDividend() == 0) {
            return null;
        }
        if (addresult.getDividend() % addresult.getDivisor() == 0) {
            addresult.setDividend(addresult.getDividend() / addresult.getDivisor());
            addresult.setDivisor(FractionNumber.DEFAULT_DIVISOR_VALUE);
        }
        return addresult;

    }

    @Override
    public FractionNumber sub(FractionNumber fractionNumber, FractionNumber fractionNumber1) {
        if (fractionNumber1 == null) {
            return fractionNumber;
        }
        FractionNumber subresult = new FractionNumberClass();        //   a/b-c/d=(a*d-c*b)/b*d;
        if (fractionNumber == null) {
            subresult.setDividend(-fractionNumber1.getDividend());
            subresult.setDivisor(fractionNumber1.getDivisor());
            return subresult;
        }
        subresult.setDividend(fractionNumber.getDividend() * fractionNumber1.getDivisor() -
                fractionNumber1.getDividend() * fractionNumber.getDivisor());
        subresult.setDivisor(fractionNumber.getDivisor() * fractionNumber1.getDivisor());
        if (subresult.getDividend() == 0) {
            return null;
        }
        if (subresult.getDividend() % subresult.getDivisor() == 0) {
            subresult.setDividend(subresult.getDividend() / subresult.getDivisor());
            subresult.setDivisor(FractionNumber.DEFAULT_DIVISOR_VALUE);
        }
        return subresult;

    }

    @Override
    public FractionNumber mul(FractionNumber fractionNumber, FractionNumber fractionNumber1) {
        FractionNumber mulresult = new FractionNumberClass();     // a/b*c/d=a*c/b*d;
        mulresult.setDividend(fractionNumber.getDividend() * fractionNumber1.getDividend());
        mulresult.setDivisor(fractionNumber.getDivisor() * fractionNumber1.getDivisor());
        if (mulresult.getDividend() == 0) {
            return null;
        }
        if (mulresult.getDividend() % mulresult.getDivisor() == 0) {
            mulresult.setDividend(mulresult.getDividend() / mulresult.getDivisor());
            mulresult.setDivisor(FractionNumber.DEFAULT_DIVISOR_VALUE);
        }
        return mulresult;
    }

    @Override
    public FractionNumber div(FractionNumber fractionNumber, FractionNumber fractionNumber1) {
        FractionNumber divresult = new FractionNumberClass();     // a/b:c/d=a*d/b*c;
        divresult.setDividend(fractionNumber.getDividend() * fractionNumber1.getDivisor());
        divresult.setDivisor(fractionNumber.getDivisor() * fractionNumber1.getDividend());
        if (divresult.getDividend() == 0) {
            return null;
        }
        if (divresult.getDivisor() == 0) throw new ClassCastException(" A divide by zero cannot");
        if (divresult.getDividend() % divresult.getDivisor() == 0) {
            divresult.setDividend(divresult.getDividend() / divresult.getDivisor());
            divresult.setDivisor(FractionNumber.DEFAULT_DIVISOR_VALUE);
        }
        return divresult;
    }

    @Override
    public FractionNumber parseFractionNumber(String s) {
        return null;
    }
}

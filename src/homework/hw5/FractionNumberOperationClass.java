package homework.hw5;

import com.sourceit.hometask.basic.FractionNumber;
import com.sourceit.hometask.basic.FractionNumberOperation;

/**
 * Created by Tonja on 04.03.2015.
 */
public class FractionNumberOperationClass  implements FractionNumberOperation {

    @Override
    public FractionNumberClass add(FractionNumber fractionNumber1, FractionNumber fractionNumber2) {
        FractionNumberClass addresult = new FractionNumberClass();        //   a/b+c/d=(a*d+c*b)/b*d
        if (addresult.getDividend() == 0) {
            return null;
        }
        if (fractionNumber1 == null) {
            addresult.setDividend(fractionNumber2.getDividend());
            addresult.setDivisor(fractionNumber2.getDivisor());
        }
        if (fractionNumber2 == null) {
            addresult.setDividend(fractionNumber1.getDividend());
            addresult.setDivisor(fractionNumber1.getDivisor());
        }

        if (addresult.getDividend() % addresult.getDivisor() == 0) {
            addresult.setDividend(addresult.getDividend() / addresult.getDivisor());
            addresult.setDivisor(FractionNumber.DEFAULT_DIVISOR_VALUE);
        } else {

            addresult.setDividend(fractionNumber1.getDividend() * fractionNumber2.getDivisor() +
                    fractionNumber2.getDividend() * fractionNumber1.getDivisor());
            addresult.setDivisor(fractionNumber1.getDivisor() * fractionNumber2.getDivisor());
        }
        return addresult;

    }


    @Override
    public FractionNumberClass sub(FractionNumber fractionNumber1, FractionNumber fractionNumber2) {
        FractionNumberClass subresult = new FractionNumberClass();        //   a/b-c/d=(a*d-c*b)/b*d;
        if (fractionNumber2 == null) {
            subresult.setDividend(fractionNumber1.getDividend());
            subresult.setDivisor(fractionNumber1.getDivisor());
        }

        if (fractionNumber1 == null) {
            subresult.setDividend(-fractionNumber2.getDividend());
            subresult.setDivisor(fractionNumber2.getDivisor());

        }

        if (subresult.getDividend() == 0) {
            return null;
        }
        if (subresult.getDividend() % subresult.getDivisor() == 0) {
            subresult.setDividend(subresult.getDividend() / subresult.getDivisor());
            subresult.setDivisor(FractionNumber.DEFAULT_DIVISOR_VALUE);
        } else {
            subresult.setDividend(fractionNumber1.getDividend() * fractionNumber2.getDivisor() -
                    fractionNumber2.getDividend() * fractionNumber1.getDivisor());
            subresult.setDivisor(fractionNumber1.getDivisor() * fractionNumber2.getDivisor());
        }
        return subresult;

    }

    @Override
    public FractionNumberClass mul(FractionNumber fractionNumber1, FractionNumber fractionNumber2) {
        FractionNumberClass mulresult = new FractionNumberClass();     // a/b*c/d=a*c/b*d;
        mulresult.setDividend(fractionNumber1.getDividend() * fractionNumber2.getDividend());
        mulresult.setDivisor(fractionNumber1.getDivisor() * fractionNumber2.getDivisor());
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
    public FractionNumberClass div(FractionNumber fractionNumber1, FractionNumber fractionNumber2) {
        FractionNumberClass divresult = new FractionNumberClass();     // a/b:c/d=a*d/b*c;
        divresult.setDividend(fractionNumber1.getDividend() * fractionNumber2.getDivisor());
        divresult.setDivisor(fractionNumber1.getDivisor() * fractionNumber2.getDividend());
        if (divresult.getDividend() == 0 || (divresult.getDivisor() == 0)) {
            return null;
        }
        if (divresult.getDividend() % divresult.getDivisor() == 0) {
            divresult.setDividend(divresult.getDividend() / divresult.getDivisor());
            divresult.setDivisor(FractionNumber.DEFAULT_DIVISOR_VALUE);
        }
        return divresult;
    }

    @Override

    public FractionNumberClass parseFractionNumber(String fraction) {
        FractionNumberClass fn = new FractionNumberClass();
        int index = fraction.indexOf('/');
        if (index > 0) {

            fn.setDividend(Integer.parseInt(fraction.substring(0, index)));
            fn.setDivisor(Integer.parseInt(fraction.substring(index-1, fraction.length())));
        }
        else {
            fn.setDividend(Integer.parseInt(fraction));
            fn.setDivisor(FractionNumber.DEFAULT_DIVISOR_VALUE);


        }return fn;
    }
}



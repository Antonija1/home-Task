package homework.hw5;

import com.sourceit.hometask.basic.FractionNumber;
import com.sourceit.hometask.basic.FractionNumberOperation;

/**
 * FractionNumberOperationClass
 *
 * 13.03.2015
 * Created by Tonja
 */
public class FractionNumberOperationClass  implements FractionNumberOperation {

    @Override

    public FractionNumber add(FractionNumber fractionNumber1, FractionNumber
                               fractionNumber2) {

        FractionNumberClass addresult = new FractionNumberClass();    //   a/b+c/d
                                                                  // =(a*d+c*b)/b*d

        addresult.setDividend(fractionNumber1.getDividend()
                              *fractionNumber2.getDivisor()
                              + fractionNumber2.getDividend()
                              * fractionNumber1.getDivisor());
        addresult.setDivisor(fractionNumber1.getDivisor()
                              * fractionNumber2.getDivisor());

        if (fractionNumber1.getDividend() == 0) {
            addresult.setDividend(fractionNumber2.getDividend());
            addresult.setDivisor(fractionNumber2.getDivisor());
        }
        if (fractionNumber2.getDividend() == 0) {
            addresult.setDividend(fractionNumber1.getDividend());
            addresult.setDivisor(fractionNumber1.getDivisor());
        }

        if (addresult.getDividend() % addresult.getDivisor() == 0) {
            addresult.setDividend(addresult.getDividend() /
                    addresult.getDivisor());
            addresult.setDivisor(FractionNumber.DEFAULT_DIVISOR_VALUE);
        }
        return addresult;

    }

    @Override

    public FractionNumber sub(FractionNumber fractionNumber1, FractionNumber
            fractionNumber2) {

        FractionNumberClass subresult = new FractionNumberClass();
          //   a/b-c/d=(a*d-c*b)/b*d;

        subresult.setDividend(fractionNumber1.getDividend()
                              * fractionNumber2.getDivisor()
                              -  fractionNumber2.getDividend()
                              * fractionNumber1.getDivisor());
        subresult.setDivisor(fractionNumber1.getDivisor()
                             * fractionNumber2.getDivisor());

        if ((fractionNumber1.getDividend()==1) && (fractionNumber2.getDivisor() == 1)) {
            subresult.setDividend(fractionNumber1.getDividend()
                                  / fractionNumber2.getDividend());
            subresult.setDivisor(FractionNumber.DEFAULT_DIVISOR_VALUE);
        }
        if (subresult.getDivisor() == 0) {
            throw new ArithmeticException("You can't divide by O");
        }

        return subresult;

    }

    @Override

    public FractionNumber mul(FractionNumber fractionNumber1, FractionNumber
            fractionNumber2) {

        FractionNumberClass mulresult = new FractionNumberClass();
         // a/b*c/d=a*c/b*d;

        mulresult.setDividend(fractionNumber1.getDividend()
                              * fractionNumber2.getDividend());
        mulresult.setDivisor(fractionNumber1.getDivisor()
                              * fractionNumber2.getDivisor());
        if (mulresult.getDivisor() == 0) {
            throw new ArithmeticException("You can't divide by O");
        }
        if (mulresult.getDividend() % mulresult.getDivisor() == 0) {
            mulresult.setDividend(mulresult.getDividend()
                                 / mulresult.getDivisor());
            mulresult.setDivisor(FractionNumber.DEFAULT_DIVISOR_VALUE);
        }
        return mulresult;
    }

    @Override

    public FractionNumber div(FractionNumber fractionNumber1, FractionNumber
            fractionNumber2) {

        FractionNumberClass divresult = new FractionNumberClass();
          // a/b:c/d=a*d/b*c;

        divresult.setDividend(fractionNumber1.getDividend()
                              *fractionNumber2.getDivisor());
        divresult.setDivisor(fractionNumber1.getDivisor()
                             * fractionNumber2.getDividend());

       if( (divresult.getDivisor() == 0)) {
           throw new ArithmeticException("You can't divide by O");
       }

        if (divresult.getDividend() % divresult.getDivisor() == 0) {
            divresult.setDividend(divresult.getDividend()
                                  /divresult.getDivisor());
            divresult.setDivisor(FractionNumber.DEFAULT_DIVISOR_VALUE);
        }
        return divresult ;
    }

    @Override

    public FractionNumber parseFractionNumber(String fraction) {
        FractionNumber fn =  new FractionNumberClass();

        int index = fraction.indexOf('/');
        if (index > 0) {

            fn.setDividend(Integer.parseInt(fraction.substring(0, index)));
            fn.setDivisor(Integer.parseInt(fraction.substring(index+1,
                    fraction.length())));
        } else {
            fn.setDividend(Integer.parseInt(fraction));
            fn.setDivisor(FractionNumber.DEFAULT_DIVISOR_VALUE);


        }
        return fn;
    }


}
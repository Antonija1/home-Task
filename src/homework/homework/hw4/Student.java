package homework.homework.hw4;

/**
 * Created by Tonja on 22.02.2015.
 */
public class Student extends Person {
    public String idnumber;
    public double dpa;

    public Student(String name, int age, String gender, String idnumber, double dpa) {
        super(name, age, gender);
        this.idnumber = idnumber;
        this.dpa = dpa;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public void setDpa(double dpa) {
        this.dpa = dpa;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public double getDpa() {
        return dpa;
    }
}

package homework.hw4;

/**
 * Created by Tonja on 25.02.2015.
 */
public class CollegeStudent extends Student {
    private String major;
    private int year;


    public CollegeStudent(String name, int age, String gender, String idnumber, double dpa, int year, String major) {
        super(name, age, gender, idnumber, dpa);
        this.year = year;
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() + " , major:" + major + ", year:" + year;
    }
}


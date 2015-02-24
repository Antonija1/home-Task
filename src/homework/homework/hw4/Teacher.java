package homework.homework.hw4;

/**
 * Created by Tonja on 24.02.2015.
 */
public class Teacher extends Person {
    public String subjekt;
    public double salary;


    public Teacher(String name, int age, String gender, double salary, String subjekt) {
        super(name, age, gender);
        this.salary = salary;
        this.subjekt = subjekt;
    }


    public String getSubjekt() {
        return subjekt;
    }

    public void setSubjekt(String subjekt) {
        this.subjekt = subjekt;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.subjekt + " " + this.salary + ", " + this.name + " " + this.age + " " + this.gender;
    }
}

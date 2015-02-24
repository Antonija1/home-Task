package homework.homework.hw4;

/**
 * Created by Tonja on 25.02.2015.
 */
public class Testing {
    public static void main(String[] args) {
        Person bob = new Person("Coach Bob", 27, "M");

        System.out.println(bob);


        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);

        System.out.println(lynne);


        Teacher mrJava = new Teacher("Duke Java", 34, "M", 50000, "Computer Science");

        System.out.println(mrJava);


        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123",

                4.0, 1, "English");

        System.out.println(ima);
    }
}

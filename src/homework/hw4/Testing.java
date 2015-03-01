package homework.hw4;

/**
 * Created by Tonja on 25.02.2015.
 */
public class Testing {
    public static void main(String[] args) {
        Person[] persons = {new Person("Coach Bob", 27, "M"),
                new Student("Lynne Brooke", 16, "F", "HS95129", 3.5),
                new Teacher("Duke Java", 34, "M", 50000, "Computer Science"),
                new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English")};
        for (int i = 0; i < persons.length; i++)
            System.out.println(persons[i]);


    }
}

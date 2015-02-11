package homework.hw2.exercise2;

/**
 * Created by Tonja on 12.02.2015.
 */
public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.Name = "spot";
        d1.Says = "Ruff!";
        d2.Name = "scruffy";
        d2.Says = "Wurf!";
        System.out.printf("%s-%s\n", d1.Name, d1.Says);
        System.out.printf("%s-%s", d2.Name, d2.Says);
    }
}

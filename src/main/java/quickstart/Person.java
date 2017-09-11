package quickstart;

/**
 * Created by Lucas on 18.07.2017.
 */
public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    @Override
    public String toString() {
        return "Persons of age: " + age;
    }
}

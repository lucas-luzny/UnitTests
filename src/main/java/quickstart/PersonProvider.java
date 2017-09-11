package quickstart;

/**
 * Created by Lucas on 18.07.2017.
 */
public class PersonProvider {
    public static Object[] provideAdults(){
        return new Object[]{
            new Object[]{new Person(25), true},
            new Object[]{new Person(32), true}
        };
    }

    public static Object[] provideTeens() {
        return new Object[]{
            new Object[]{new Person(12), false},
            new Object[]{new Person(17), false}
        };
    }
}

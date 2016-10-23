package examplesM9.org.app.model.model;

/**
 * Created by Sergiy on 10/19/16.
 */
public class Dog implements Animal {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}

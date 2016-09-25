package examplesM6.finals;


public class User {

    private String name;
    private String lastName;
    private int age;
    private final String cityOfBirth;


    public User(String name, int age, String cityOfBirth) {
        this.name = name;
        this.age = age;
        this.cityOfBirth = cityOfBirth;
    }

    void someLogic() {
        String res = name + lastName;
    }
}


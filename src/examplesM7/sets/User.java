package examplesM7.sets;


public class User implements Comparable<User> {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User user) {

        //int pozvolit sravnit ne tolko quals objectov no i poryadok v kotorm oni doljni idti
        //-1 if User current < User o
        //0 if quals
        //1 if User current > User o

        if (name.equals(user.name) && age - user.age < 0) return -1;
        if (name.equals(user.name) && age - user.age > 0) return 1;
        if (name.equals(user.name) && age - user.age == 0) return 0;

        return name.length() - user.getName().length();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return name.equals(user.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

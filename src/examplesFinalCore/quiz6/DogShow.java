package examplesFinalCore.quiz6;

/**
 * Created by Sergiy on 11/13/16.
 */

public class DogShow {
    public static void main(String[] args) {
        new DogShow().go();
    }

    void go() {
        new Hound().bark();
        ((Dog) new Hound()).bark();
        //((Dog) new Hound()).sniff();
    }
}

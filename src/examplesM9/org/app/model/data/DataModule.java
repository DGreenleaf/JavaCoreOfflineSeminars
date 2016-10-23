package examplesM9.org.app.model.data;

import examplesM9.org.app.model.model.Animal;
import examplesM9.org.app.model.model.Dog;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergiy on 10/19/16.
 */
public class DataModule {

    private List<Animal> animals = new ArrayList<>();

    public DataModule() {
        for (int i = 0; i < 10; i++) {
            animals.add(new Dog("Name" + i, i));
        }
    }

    public void add(Animal a) {
        animals.add(a);
    }

    public void remove(Animal a){
        animals.remove(a);
    }

    public List<Animal> getAnimals(){
        return animals;
    }
}

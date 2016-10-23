package examplesM9.org.app.model.controller.business;


import examplesM9.org.app.model.model.Animal;

import java.util.List;

/**
 * Created by Sergiy on 10/19/16.
 */
public interface BusinessProcessor {

    public int getSumOfAgesOfAnimals();

    public Animal getOldestAnimal();

    public List<Animal> getAnimalsByName(String name);

    public void enrichAnimals (String name, int delta);

}

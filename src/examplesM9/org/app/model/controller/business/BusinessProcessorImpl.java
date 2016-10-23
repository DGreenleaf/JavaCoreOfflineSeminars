package examplesM9.org.app.model.controller.business;

import examplesM9.org.app.model.data.DataModule;
import examplesM9.org.app.model.model.Animal;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * Created by Sergiy on 10/19/16.
 */
public class BusinessProcessorImpl implements BusinessProcessor{

    private DataModule dataModule;

    public BusinessProcessorImpl(DataModule dataModule) {
        this.dataModule = dataModule;
    }

    @Override
    public int getSumOfAgesOfAnimals() {
        //Stream<Animal> s = dataModule.getAnimals().stream();
        //Stream.of(1, 2, 3, 4);
        //s.reduce((animal, animal2) -> (return animal.getAge()+animal2.getAge()));

        Stream<Integer> str = Stream.of(1, 2, 5, 4);
        str.reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {

                System.out.println("i1="+integer);
                System.out.println("i2="+integer2);
                System.out.println("--------------");
                return integer+integer2;
            }
        });

        return 0;
    }

    @Override
    public Animal getOldestAnimal() {
        return null;
    }

    @Override
    public List<Animal> getAnimalsByName(String name) {
        return null;
    }

    @Override
    public void enrichAnimals(String name, int delta) {

    }
}

package examplesM4.interfaces;

import examplesM4.abstractclassesandmethods.DeveloperEmployee;

/**
 * Created by Sergiy on 9/11/16.
 */
public class DeveloperDbService implements DBService {

    @Override
    public void save(DeveloperEmployee employee) {

    }

    @Override
    public DeveloperEmployee get(long id) {
        return null;
    }

    @Override
    public void update(DeveloperEmployee employee) {

    }

    @Override
    public DeveloperEmployee[] getAlldevelopers() {
        return new DeveloperEmployee[0];
    }
}

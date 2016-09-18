package examplesM4.interfaces;

import examplesM4.abstractclassesandmethods.DeveloperEmployee;

/**
 * Created by Sergiy on 9/11/16.
 */
public interface DBService {

    void save (DeveloperEmployee employee);

    //передаем на вход ID и получаем DeveloperEmployee
    DeveloperEmployee get (long id);

    void update (DeveloperEmployee employee);

    DeveloperEmployee[] getAlldevelopers();

}

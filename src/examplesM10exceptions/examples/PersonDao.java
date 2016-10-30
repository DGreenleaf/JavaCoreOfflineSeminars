package examplesM10exceptions.examples;

import java.util.List;

/**
 * Created by Sergiy on 10/24/16.
 */
public interface PersonDao {

    Person save(Person person);

    Person findByEmail(String email);

    //List<Person>

}


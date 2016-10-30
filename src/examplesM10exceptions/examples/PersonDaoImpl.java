package examplesM10exceptions.examples;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergiy on 10/24/16.
 */
public class PersonDaoImpl implements PersonDao {


    private static List<Person> persons = new ArrayList<>();


    //standartniy shablon dlya enterprise proektov

    @Override
    public Person save(Person person) {
        persons.add(person);
        return person;
    }

    @Override
    public Person findByEmail(String email) {
        for (Person person : persons) {
            if (person.getEmail().equals(email)) {
                return person;
            }
        }
        return null;
    }

    //@Override
    public List<Person> get() {
        return persons;
    }
}


package examplesM10exceptions.examples;


import java.util.Map;

/**
 * Created by Sergiy on 10/24/16.
 */
public class PersonController1 {

    private static PersonDao personDao = new PersonDaoImpl();

    public String save(Map<String, String> requestParams) throws PersonException {
        if (!requestParams.containsKey("firstName")){
            throw new PersonException("\"name\" Parameter missing");
        }
//        if (!requestParams.containsKey("firstName")) {
//            throw new PersonException("Отсутствует обязательный параметр \"Имя\"");
//        }
/*
    if(!requestParams.containsKey("lastName")) {
      throw new PersonException("Отсутствует обязательный параметр \"Фамилия\"");
    }
*/
        if (!requestParams.containsKey("email")) {
            throw new PersonException("\"email\" Parameter missing");
        }

//        if (!requestParams.containsKey("email")) {
//            throw new PersonException("Отсутствует обязательный параметр \"Email\"");
//        }

        final String firstName = checkForNull(requestParams, ("firstName"));
        final String email = checkForNull(requestParams, ("email"));

        //    final String lastName = requestParams.get("lastName");

        // рекомендую не использовать тернарники, а использовать подобную конструкцию

        final String lastName = checkForNull(requestParams, "lastName");


//        //more efficient
//        String lastName1 = requestParams.get("lastName");
//        if (lastName1 == null) lastName1 = "";
//
//        //another option
//        String lastName2 = requestParams.get("lastName") != null ?
//                requestParams.get("lastName") : "";


        Person person = new Person(firstName, lastName, email);

        personDao.save(person);
        return person.toString();
    }

    public String findByEmail(Map<String, String> requestParams) throws PersonException {
        if (!requestParams.containsKey("email")) {
            throw new PersonException("Отсутствует обязательный параметр \"Email\"");
        }
        final String email = checkForNull(requestParams, ("email"));

        Person person = personDao.findByEmail(email);
        if (person == null) {
            throw new PersonException("В базе нет персоны с таким email");
        }
        return person.toString();
    }

    private String checkForNull(Map<String, String> requestParams, String param) {

        String res;
        if (requestParams.get(param) != null) {
            res = requestParams.get(param);
        } else {
            res = "";
        }
        return res;
    }

}


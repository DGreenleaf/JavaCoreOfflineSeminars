package examplesM10exceptions;

//Task for examples
 /**
 *
 * 1. Создайте Main класс и поделите число типа Integer на номер(Number). Отловите такие стандартные unchecked exceptions
 *    как NumberFormatException, ClassCastException, ArithmeticException, ArrayIndexOutOfBoundsException.
 *    Перехватите одно из исключений общим исключением типа Exception.
 *    Верните результат деления вне зависимости было ли перехвачено исключение.
 *
 * 2. Отловите такие стандартные unchecked exceptions как NullPointerException, StringIndexOutOfBoundsException
 *    при работе с переменной типа String
 *
 * 3. Создайте объект Person с тремя полями firstName, lastName, email.
 *    Создайте интерфейс PersonDao с двумя методами Peron save(Person person) и Person findByEmail(Person person).
 *    Создайте имплементацию PersonDaoImpl. В качестве базы используйте поле типа List<Person>.
 *    Создайте PersonController c двумя методами
 *    String save(Map<String, String> requestParams), String findByEmail(Map<String, String> requestParams)
 *
 *    пояснение:
 *    Map<String, String> requestParams - это эмуляция передачи полей формы в виде ключ значение.
 *    Для того чтобы сохранить персону в базу в requestParams обязательно должны быть
 *    такие поля как firstName и email. (lastName не обязательное поле)
 *    Если мы получаем форму(requestParams) без обязательных полей мы прокидываем стандартное исключение
 *    типа Exception (с различными подробностями для каждого поля в отдельности)
 *
 * 4. Напишите свой PersonEcxeption. Замение стандартный Exception из задания 3 на свой кастомный.
 *
 * 5. Отловите в Main классе ошибки при добавлении и поиске Person в базу через PersonController.
 *
 */

public class Null {
}

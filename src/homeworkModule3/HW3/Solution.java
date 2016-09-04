package homeworkModule3.HW3;

/*
You need to create following structure of the classes.

Class Course with fields: Date startDate, String name,
int hoursDuration, String teacherName. Create two constructors with fields startDate, name;
and hourseDuration, name, teacherName.

Class Student with fields: String firstName, String lastName, int group,
Course[] coursesTaken, int age. With 2 constructors firstName, lastName, group; and lastName, coursesTaken.

CollegeStudent that is a child of Student. With additional fields: String collegeName, int rating, long id.
Create three constructors: two the same as in Student and one with all the fields of the class.

Class SpecialStudent that is child of CollegeStudent. With additional fields long secretKey, String email.
Create three constructors: two the same as in CollegeStudend and one with secretKey field.

Create getters and setters for all fields and make fields private as OOP principle follows.
Create 5 objects Course class. Create objects of others classes using every constructor.
You must have 13 objects in Solution class.
 */

import java.util.Date;

public class Solution {

    public static void main(String[] args) {

        Course[] coursesTaken = new Course[5];

        Student sergSav = new Student("Sergii", "Savytskyi", 1);
        Student olegSmall = new Student("Oleg", "Smolovik", 1);

        SpecialStudent dimaZub = new SpecialStudent("Dima", "Zubarev", 1);
        SpecialStudent vladRyb = new SpecialStudent("Rybkin", coursesTaken);
        SpecialStudent oneAndOnly = new SpecialStudent("One ", " Only ", coursesTaken, 2, 10010);

        CollegeStudent ivanIvan = new CollegeStudent("Ivan ", " Ivanov ", 28, coursesTaken, 4, " GoIt College ", 90, 123321);
        CollegeStudent polDuke = new CollegeStudent("Duke ", coursesTaken);
        CollegeStudent danHaz = new CollegeStudent("Dan ", " Hazzberg ", 1);

        Course courseGoIt = new Course(new Date(11082016), "GoIt starts at");
        Course endOfLearning = new Course(new Date(07032017), "GoIt ends at");
        Course sergTeach = new Course("Sergii", 10, "Anrew");
        Course olegTeach = new Course("Oleg", 16, "Anrew");
        Course vladTeach = new Course("Vlad", 8, "Anrew");




    }

}

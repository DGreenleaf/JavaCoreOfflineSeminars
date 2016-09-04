package homeworkModule3.HW3;


public class CollegeStudent extends Student {

    private String collegeName;
    private int rating;
    private long id;

      CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

      CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

     protected CollegeStudent(String firstName, String lastName, int age, Course[] coursesTaken, int group, String collegeName, int rating, long id) {
        super(firstName, lastName, group);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }





}

package homeworkModule3.HW3;


public class SpecialStudent extends CollegeStudent {

    private long secretKey;
    private String email;


     SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

     SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent (String firstName, String lastName, Course[] coursesTaken, int group, long secretKey) {
        super(firstName, lastName, group);
        this.secretKey = secretKey;
    }

}

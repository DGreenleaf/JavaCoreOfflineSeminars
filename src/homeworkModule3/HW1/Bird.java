package homeworkModule3.HW1;


public class Bird {

    String action1;
    String action2;
    String action3;
    String type;

    protected Bird(String action1, String action2, String action3, String type) {
        this.action1 = action1;
        this.action2 = action2;
        this.action3 = action3;
        this.type = type;
    }

    void printActions () {

        System.out.println(action1);
        System.out.println(action2);
        System.out.println(action3);
        System.out.println(type);
    }


}

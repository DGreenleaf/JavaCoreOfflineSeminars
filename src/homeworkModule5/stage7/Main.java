package homeworkModule5.stage7;


public class Main {

    public static void main(String[] args) {




        Controller controller = new Controller();

        controller.requestRooms(250, 2, "New York", "Radisson");
        controller.requestRooms(150, 1, "Kyiv", "Radison");
        controller.requestRooms(280, 10, "London", "Test");

        controller.check(new BookingComAPI(), new GoogleAPI());
        controller.check(new BookingComAPI(), new GoogleAPI());
        controller.check(new BookingComAPI(), new GoogleAPI());


    }
}

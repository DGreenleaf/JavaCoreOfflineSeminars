package homeworkModule7.stage4;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();

        ArrayList<Room> request1 = controller.requestRooms(250, 2, "New York", "Radisson");
        ArrayList<Room> request2 = controller.requestRooms(150, 1, "Kyiv", "Radison");
        ArrayList<Room> request3 = controller.requestRooms(280, 10, "London", "Test");

        controller.check(new BookingComAPI(), new GoogleAPI());
        controller.check(new BookingComAPI(), new GoogleAPI());
        controller.check(new BookingComAPI(), new GoogleAPI());

        System.out.println("Room1 search" + request1.toString());
        System.out.println("Room2 search" + request2.toString());
        System.out.println("Room3 search" + request3.toString());

        API api1 = new GoogleAPI();
        API api2 = new TripAdvisorAPI();
        API api3 = new BookingComAPI();

        ArrayList<Room> check1 = controller.check(api1, api2);
        ArrayList<Room> check2 = controller.check(api2, api3);
        ArrayList<Room> check3 = controller.check(api3, api1);

        System.out.println("Equal rooms 1 " + check1.toString());
        System.out.println("Equal rooms 2 " + check2.toString());
        System.out.println("Equal rooms 3 " + check3.toString());


    }
}

package homeworkModule5.stage4;

import java.util.Date;

public class BookingComAPI implements API {

    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        rooms[0] = new Room(23, 145, 2, new Date(20161021), "Radisson", "New York");
        rooms[1] = new Room(11, 100, 4, new Date(20161012), "Hilton", "Dubai");
        rooms[2] = new Room(6, 65, 1, new Date(20161011), "Lybid", "Kyiv");
        rooms[3] = new Room(7, 88, 1, new Date(20161002), "Dnipro", "Kyiv");
        rooms[4] = new Room(2233, 90, 2, new Date(20161019), "Mariott", "Washington");
        rooms = new Room[] {rooms[0], rooms[1], rooms[2], rooms[3], rooms[4]};

    }


    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return null;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }

}

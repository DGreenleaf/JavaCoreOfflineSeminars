package homeworkModule5.stage5;

import java.util.Date;

abstract class BookingComAPI implements API {

    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        Room room1 = new Room(23, 145, 2, new Date(20161021), "Radisson", "New York");
        rooms[0] = room1;
        Room room2 = new Room(11, 100, 4, new Date(20161012), "Hilton", "Dubai");
        rooms[1] = room2;
        Room room3 = new Room(6, 65, 1, new Date(20161011), "Lybid", "Kyiv");
        rooms[2] = room3;
        Room room4 = new Room(7, 88, 1, new Date(20161002), "Dnipro", "Kyiv");
        rooms[3] = room4;
        Room room5 = new Room(2233, 90, 2, new Date(20161019), "Mariott", "Washington");
        rooms[4] = room5;
        rooms = new Room[] {room1, room2, room3, room4, room5};

    }


    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return null;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }

}

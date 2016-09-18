package homeworkModule5.stage6;


import java.util.Date;

public class GoogleAPI implements API {

    private Room[] rooms = new Room[5];

    public GoogleAPI() {
        Room room1 = new Room(1223, 150, 2, new Date(20161024), "Radisson", "New York");
        rooms[0] = room1;
        Room room2 = new Room(111, 250, 4, new Date(20161018), "Hilton", "Dubai");
        rooms[1] = room2;
        Room room3 = new Room(5093, 120, 1, new Date(20161020), "Lybid", "Kyiv");
        rooms[2] = room3;
        Room room4 = new Room(345, 50, 1, new Date(20161001), "Dnipro", "Kyiv");
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

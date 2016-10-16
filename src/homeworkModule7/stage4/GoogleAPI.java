package homeworkModule7.stage4;


import java.util.ArrayList;
import java.util.Date;

public class GoogleAPI implements API {

    private ArrayList<Room> rooms = new ArrayList<>();

    public GoogleAPI() {

        rooms.add(new Room(1223, 150, 2, new Date(20161024), "Radisson", "New York"));
        rooms.add(new Room(111, 250, 4, new Date(20161018), "Hilton", "Dubai"));
        rooms.add(new Room(5093, 120, 1, new Date(20161020), "Lybid", "Kyiv"));
        rooms.add(new Room(345, 50, 1, new Date(20161001), "Dnipro", "Kyiv"));
        rooms.add(new Room(2233, 90, 2, new Date(20161019), "Mariott", "Washington"));

    }

    @Override
    public ArrayList<Room> findRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> foundRooms = new ArrayList<>();
        int count = 0;
        for (Room room : rooms) {
            if ((room.getPrice() == price) && (room.getPersons() == persons) && (room.getCityName().equals(city) && (room.getHotelName().equals(hotel)))) {
                foundRooms.add(room);
            }
        }

        return foundRooms;
    }

    @Override
    public ArrayList<Room> getAll() {
        return rooms;
    }
}

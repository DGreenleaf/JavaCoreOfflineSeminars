package homeworkModule7.stage4;


import java.util.ArrayList;
import java.util.Date;

public class TripAdvisorAPI implements API {

    private ArrayList<Room> rooms = new ArrayList<>();

    public TripAdvisorAPI() {

        rooms.add(new Room(23, 145, 2, new Date(20161021), "Radisson", "New York"));
        rooms.add(new Room(11, 100, 4, new Date(20161012), "Hilton", "Dubai"));
        rooms.add(new Room(88, 125, 2, new Date(20161005), "Lybid", "Kyiv"));
        rooms.add(new Room(10, 70, 1, new Date(20161006), "Dnipro", "Kyiv"));
        rooms.add(new Room(56, 120, 3, new Date(20161005), "Mariott", "Washington"));

    }

    @Override
    public ArrayList<Room> findRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> findRooms = new ArrayList<>();
        int count = 0;
        for (Room room : rooms) {
            if ((room.getPrice() == price) && (room.getPersons() == persons) && (room.getCityName().equals(city) && (room.getHotelName().equals(hotel)))) {
                findRooms.add(room);
            }
        }
        return findRooms;
    }

    @Override
    public ArrayList<Room> getAllRooms() {
        return rooms;
    }
}



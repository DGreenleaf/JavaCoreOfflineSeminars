package homeworkModule7.stage4;


import java.util.ArrayList;
import java.util.Date;

public class TripAdvisorAPI implements API {

    private ArrayList<Room> rooms = new ArrayList<>();

    public TripAdvisorAPI() {

        Room room1 = new Room(23, 145, 2, new Date(20161021), "Radisson", "New York");
        rooms.add(new Room(23, 145, 2, new Date(20161021), "Radisson", "New York"));
        Room room2 = new Room(11, 100, 4, new Date(20161012), "Hilton", "Dubai");
        rooms[1] = room2;
        Room room3 = new Room(88, 125, 2, new Date(20161005), "Lybid", "Kyiv");
        rooms[2] = room3;
        Room room4 = new Room(10, 70, 1, new Date(20161006), "Dnipro", "Kyiv");
        rooms[3] = room4;
        Room room5 = new Room(56, 120, 3, new Date(20161005), "Mariott", "Washington");
        rooms[4] = room5;
        rooms = new Room[] {room1, room2, room3, room4, room5};

    }


    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] foundroomsTemp =new Room[100];
        int count =0;
        for ( Room room : rooms){
            if ((room.getPrice() == price) && (room.getPersons()==persons)&& (room.getCityName().equals(city)&& (room.getHotelName().equals(hotel)))){
                foundroomsTemp[count]=room;
                count++;
            }
        }
        Room[] foundroomsarray = new Room[count];
        for (int i=0; i<count; i++){
            foundroomsarray[i]=foundroomsTemp[i];
        }

        return foundroomsarray;
    }
    @Override
    public Room[] getAll() {
        return rooms;
    }
}


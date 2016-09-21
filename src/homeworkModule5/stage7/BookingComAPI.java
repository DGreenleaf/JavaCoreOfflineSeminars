package homeworkModule5.stage7;

import java.util.Date;

public class BookingComAPI implements API {

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
        Room[] foundRoomsTemp = new Room[100];
        int count = 0;
        for ( Room room : rooms){
            if ((room.getPrice() == price) && (room.getPersons()==persons)&& (room.getCityName().equals(city)&& (room.getHotelName().equals(hotel)))){
                foundRoomsTemp[count]=room;
                count++;
            }
        }
        Room[] foundroomsarray = new Room[count];
        for (int i=0; i<count; i++){
            foundroomsarray[i]=foundRoomsTemp[i];
        }

        return foundroomsarray;

    }



    @Override
    public Room[] getAll() {
        return rooms;
    }

}

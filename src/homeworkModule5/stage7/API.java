package homeworkModule5.stage7;


import homeworkModule5.stage3.Room;

public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);
    
}

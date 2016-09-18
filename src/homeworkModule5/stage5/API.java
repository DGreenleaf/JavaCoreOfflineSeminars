package homeworkModule5.stage5;


import homeworkModule5.stage3.Room;

public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);
    
}

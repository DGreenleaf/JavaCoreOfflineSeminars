package homeworkModule7.stage4;


import java.util.ArrayList;

public interface API {

    ArrayList<Room> findRooms(int price, int persons, String city, String hotel);

    ArrayList<Room> getAll();

}

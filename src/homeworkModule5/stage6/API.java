package homeworkModule5.stage6;


public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAll();

}

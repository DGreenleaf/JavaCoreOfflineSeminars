package homeworkModule5.stage7;


public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAll();

}

package homeworkModule5.stage5;


public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAll();

}

package homeworkModule7.stage4;


public interface DAO {

    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
    //Room[] getAll();

}

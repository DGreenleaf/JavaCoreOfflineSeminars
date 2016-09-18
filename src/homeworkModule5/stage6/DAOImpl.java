package homeworkModule5.stage6;


public class DAOImpl implements DAO {

    @Override
    public Room save(Room room) {
        System.out.println("Room from " + room.getHotelName() + " was saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Room from " + room.getHotelName() + " was deleted");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Room from " + room.getHotelName() + " was updated");
        return room;
    }

    @Override
    public Room findById(long id) {
        System.out.println("ID from finded room - " + id);
        return null;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}

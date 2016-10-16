package homeworkModule7.stage4;


//public class Controller {
//
//    private API apis[] = new API[3];
//
//    Room[] rooms = new Room[1000];
//
//    public Controller() {
//
//        apis[1] = new BookingComAPI();
//        apis[2] = new GoogleAPI();
//        apis[3] = new TripAdvisorAPI();
//
//    }
//
//
//    public Room[] requestRooms(int price, int persons, String city, String hotel) {
//        Room[] request1 = apis[1].findRooms(price, persons, city, hotel);
//        Room[] request2 = apis[2].findRooms(price, persons, city, hotel);
//        Room[] request3 = apis[3].findRooms(price, persons, city, hotel);
//        Room[] request = new Room[request1.length + request2.length + request3.length];
//
//        DAOImpl dao = new DAOImpl();
//        int count = 0;
//        for (int i = 0; i < request1.length; i++) {
//            request[count] = request1[i];
//            count++;
//        }
//
//        for (int i = 0; i < request2.length; i++) {
//            request[count] = request2[i];
//            //dao.save(rms[cout]);
//            count++;
//        }
//
//        for (int i = 0; i < request3.length; i++) {
//            request[count] = request3[i];
//            count++;
//        }
//
//
//        return request;
//    }
//
//
//    public Room[] check(API api1, API api2) {
//
//        Room[] roomsFromApi1 = api1.getAll();
//        Room[] roomsFromApi2 = api2.getAll();
//
//        int countRooms = 0;
//
//        for (int i = 0; i < roomsFromApi1.length; i++) {
//            for (int j = i; j < roomsFromApi1.length; j++) {
//                if (roomsFromApi1[i].equals(roomsFromApi1[j])) {
//                    rooms[countRooms] = roomsFromApi1[j];
//                    countRooms++;
//                }
//            }
//        }
//
//        return rooms;
//
//    }
//
//
//}


import java.util.ArrayList;

public class Controller {

    private ArrayList<API> apiArrayList = new ArrayList<>();


    public Controller() {
        apiArrayList.add(new TripAdvisorAPI());
        apiArrayList.add(new BookingComAPI());
        apiArrayList.add(new GoogleAPI());
    }




    public ArrayList<Room> requestRooms(int price, int persons, String city, String hotel) {

        ArrayList<Room> foundRooms = new ArrayList<>();
        for (API item : apis) {
            foundRooms.addAll(item.findRooms(price, persons, city, hotel));
        }

        DAOImpl daoImpl = new DAOImpl();
        for (Room room : foundRooms){
            daoImpl.save(room);
        }

        return foundRooms;
    }




    public ArrayList<Room> check(API api1, API api2) {
        ArrayList<Room> roomsFromApi1 = api1.getAllRooms();
        ArrayList<Room> roomsFromApi2 = api2.getAllRooms();

        roomsFromApi1.retainAll(roomsFromApi2);

        return roomsFromApi1;
    }

}

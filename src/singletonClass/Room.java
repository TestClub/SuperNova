package singletonClass;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private Room(){

    }
    private static Room room1 = new Room();
    private  static Room room2 = new Room();
    private static List<Room> roomList = new ArrayList<Room>();

    public static List<Room> getSingleton(){
       roomList.add(room1);
       roomList.add(room2);
       return  roomList;
    }
    public void displayRoomDimension(){
        System.out.println("16 by 16");
    }

}

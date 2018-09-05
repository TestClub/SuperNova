package singletonClass;

public class TestRoom {
    public static void main(String[] args) {
        Room room1 = Room.getSingleton().get(0);
        room1.displayRoomDimension();
        Room room2 = Room.getSingleton().get(1);
        room2.displayRoomDimension();
        Room room3 = Room.getSingleton().get(2);
        room3.displayRoomDimension();

        System.out.println(room1.hashCode());
        System.out.println(room2.hashCode());
        System.out.println(room3.hashCode());
    }
}

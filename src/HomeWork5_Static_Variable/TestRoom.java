package HomeWork5_Static_Variable;

public class TestRoom {
    public static void main(String[] args) {
        Room rm = new Room();

        System.out.println(rm.AreaOfRoom());
        Room.width = 23;
        System.out.println(rm.AreaOfRoom());
        rm.NumberOfPeople = 5;
        rm.peopleLives();
        Room.Address = "48-13, 67th Street";
        rm.address();

        Room rm2 = new Room();
        rm2.NumberOfPeople = 10;
        System.out.println(rm2.AreaOfRoom());
        Room.length = 18;
        System.out.println(rm.AreaOfRoom());
        rm2.peopleLives();
        Room.Address = "55-12, 56 th Street";
        rm.address();
    }
}

package HomeWork5_Static_Variable;

public class Room {

    public static int length = 16;
    public static int width = 12;
  public int NumberOfPeople;
  public static String Address;

    public int AreaOfRoom(){
         int Area = length * width;
         return Area;

    }
    public  void peopleLives(){

        System.out.println("There are " + NumberOfPeople + " Lives in here");

    }
    public void address(){

        System.out.println("The Address is = " + Address);


    }
}

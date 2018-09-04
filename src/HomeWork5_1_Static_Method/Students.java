package HomeWork5_1_Static_Method;

public class Students {
    public static String stName;
    public static int stID;
    public static int stAge;
    public String stName2;
    public int stID2;
    public int stAge2;
    public static void PrintName(){
        System.out.println("The Students Name is " + stName);
    }

    public static void PrintID(){
        System.out.println("The Students ID is " + stID);
    }

    public static void PrintAge(){
        System.out.println("The Students Age is " + stAge);
    }

    public  void PrintName1(String stName2){
        this.stName2 = stName2;
        System.out.println("The Students Name is " + stName2);
    }

    public  void PrintID1(int stID2){
        this.stID2 = stID2;
        System.out.println("The Students ID is " + stID2);
    }

    public  void PrintAge1(int stAge2){
        this.stAge2 = stAge2;
        System.out.println("The Students Age is  " + stAge2);
    }
}

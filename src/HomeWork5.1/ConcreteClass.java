package homeWork;

import java.util.Scanner;

public class ConcreteClass {

    // declare some Static variable
    public static int stID;
    public static int age;
    public static String stName;


    public static String getStName() {
        return stName;
    }

    public static void setStName(String stName) {
        ConcreteClass.stName = stName;
    }
    public static int getStID() {
        return stID;
    }

    public static void setStID(int stID) {
        ConcreteClass.stID = stID;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        ConcreteClass.age = age;
    }



}
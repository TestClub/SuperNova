package homeWork;


import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        // Using the scanner class to enter the input value from the console
        Scanner sc = new Scanner(System.in);
        ConcreteClass call = new ConcreteClass();


        // Here I am trying to initialize the value that I declared as Static variable

        System.out.println("Please Enter the Students Name");
        ConcreteClass.setStName(sc.nextLine());
        System.out.println("Please Enter the Students age");
        ConcreteClass.setAge(sc.nextInt());
        System.out.println("Please Enter the Students ID");
        ConcreteClass.setStID(sc.nextInt());


        // Here I am trying to print out the value I Entered
        System.out.println("My Name is --> " + ConcreteClass.getStName());
        System.out.println("My Age is --> " + ConcreteClass.getAge());
        System.out.println("My ID is --> " + ConcreteClass.getStID());
    }
}

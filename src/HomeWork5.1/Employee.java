package HomeWork5_1_Final;

public class Employee {

    public  String Name;
    public  int ID ;
    public  int Age ;
    public final String MyName= "Subhra Roy";
    public final int MyID  = 200;
    public final int MyAge = 30;

    public Employee(){

    }
    public Employee(final int ID, final int Age){
        this.ID = ID;
        this.Age = Age;
        System.out.println("The Students id is "+ ID);
        System.out.println("The Students age is "+ Age);
    }
    public Employee(final int ID, final int Age, final String Name){
        this.ID = ID;
        this.Age = Age;
        this.Name = Name;
        System.out.println("The Students id is "+ ID);
        System.out.println("The Students age is "+ Age);
        System.out.println("The Students NAme is "+ Name);
    }

    public final void PrntInfo(){
        System.out.println("My name is "+ MyName);
        System.out.println("My ID is "+ MyID);
        System.out.println("My Age is "+ MyAge);
    }

}

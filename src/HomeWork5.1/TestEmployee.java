package HomeWork5_1_Final;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.PrntInfo();
        Employee emp1 = new Employee(201,35);
        System.out.println(emp1.Age);
        System.out.println(emp1.ID);
        Employee emp2 = new Employee(202,31,"Subhra");
    }
}

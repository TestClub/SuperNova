package HomeWork5_1_Static_Method;

public class TestStudents {

    public static void main(String[] args) {
        Students.stAge = 22;
        Students.stID = 100;
        Students.stName = "Subhra";
        Students.PrintAge();
        Students.PrintID();
        Students.PrintName();
        Students std = new Students();



        std.PrintName1(std.stName2 = "Ahmed");
        std.PrintID1(std.stID2 = 101);
        std.PrintAge1(std.stAge2 = 23);

        SubStudents.PrintInfo();
        SubStudents.PrintAge();
        SubStudents.PrintID();
        SubStudents.PrintName();

    }
}

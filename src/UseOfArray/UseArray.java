package UseOfArray;

import java.util.Scanner;

public class UseArray {
    public static void main(String[] args) {
        int [] arr1 = new int[10];
        Scanner sc = new Scanner(System.in);
for (int i = 0; i<arr1.length;i++) {
    System.out.println("Enter The Number In to the Array  = " + i);
    arr1[i] = sc.nextInt();
    System.out.println("The array index is " + i + " = " + arr1[i]);

}


    }
}

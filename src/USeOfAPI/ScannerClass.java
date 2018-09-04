package USeOfAPI;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the no");
        int[] arr1 = new int[10];
        for (int i =0; i < arr1.length; i++){
            arr1[i] = scanner.nextInt();
            System.out.println("Array index is "+ i + " = " + arr1[i]);
        }


    }
}

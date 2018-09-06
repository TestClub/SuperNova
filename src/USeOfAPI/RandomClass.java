package USeOfAPI;

import java.util.Random;


public class RandomClass {
    public static void main(String[] args) {

        Random random = new Random();
        int [] array = new int[50];
        for (int i =0; i < array.length; i++){
            array[i] = random.nextInt(2045);
            System.out.println("The Random no is "+ i +" = "+ array[i]);

        }


       }
    }




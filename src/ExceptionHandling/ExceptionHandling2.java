package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        FileReader fr =null;
        BufferedReader br = null;
        final String path = "/Users/subhra/Desktop/Mac Install my sql and Mongo db.txt";
        try{
            fr = new FileReader(path);
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            br = new BufferedReader(fr);
            String Data = "";
            while((Data = br.readLine()) != null){
                System.out.println(Data);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

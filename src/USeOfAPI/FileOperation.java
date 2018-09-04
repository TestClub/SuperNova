package USeOfAPI;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileOperation {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        String path = "/Users/subhra/Desktop/MyText.txt";
        try {
            fr = new FileReader(path);

        }catch (Exception ex){
            ex.printStackTrace();
        }
        try{
            br = new BufferedReader(fr);
            String MyData = "";
            while((MyData = br.readLine()) != null){
                System.out.println("Here Starts ");
                System.out.println(MyData);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

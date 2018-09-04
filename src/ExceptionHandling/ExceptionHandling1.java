package ExceptionHandling;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        int num =10;
        try{
            int result = num/0;
            System.out.println(result);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

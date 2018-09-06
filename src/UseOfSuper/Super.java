package UseOfSuper;



public class Super {

    int a;
    int b;

    public Super(){

    }
    public Super(int a, int b){

    }
    public void mySuper(int a){
        System.out.println("This " + a + " called using the super keyword");
    }
    public int theSuper(int a, int b){
        this.a = a;
        return a;

    }
}

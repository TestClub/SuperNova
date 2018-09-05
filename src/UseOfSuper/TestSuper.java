package UseOfSuper;

public class TestSuper {
    public static void main(String[] args) {
        Super sp = new Super();
        //sp.mySuper(6);
        sp.theSuper(4,7);
        OnlySuper os = new OnlySuper();
        os.story();
        //os.mySuper(8);
        os.theSuper(8,9);
    }
}

package UseOfString;

public class StringExample {
    public static void main(String[] args) {
        String Sentence1 = "I will get the job within two months";
        String Sentence2 = "For that I have to work hard";


        //String methods From Sentence1 String
        System.out.println(Sentence1.indexOf("j"));
        System.out.println(Sentence1.indexOf('e'));
        System.out.println(Sentence1.indexOf('s',2));
        System.out.println(Sentence1.contains("job"));
        System.out.println(Sentence1.hashCode());
        System.out.println(Sentence1.length());
        System.out.println(Sentence1.charAt(7));
        if(Sentence1.equalsIgnoreCase(Sentence2)){
            System.out.println("Yes they are Equal");
        }else {
            System.out.println("No they are not Equal");
        }
        System.out.println(Sentence1.equalsIgnoreCase(Sentence2));
        System.out.println(Sentence1.toLowerCase());
        System.out.println(Sentence1.toUpperCase());
        System.out.println(Sentence1.replaceAll("within", "With-in"));
        System.out.println(Sentence1.isEmpty());
        System.out.println(Sentence1.getClass());

        ////String methods From Sentence2 String
        System.out.println(Sentence2.length());
        System.out.println(Sentence2.equalsIgnoreCase(Sentence1));
        System.out.println(Sentence2.toUpperCase());
        System.out.println(Sentence2.toLowerCase());
        System.out.println(Sentence2.compareToIgnoreCase("Harder"));
        System.out.println(Sentence2.contains("v"));
        System.out.println(Sentence2.codePointAt(8));
        System.out.println(Sentence2.endsWith("d"));
        System.out.println(Sentence2.codePointCount(0,Sentence2.length()));
        System.out.println(Sentence2.isEmpty());
        System.out.println(Sentence2.replace("I","i"));
        System.out.println(Sentence2.replaceAll("hard", "Harder"));

    }
}

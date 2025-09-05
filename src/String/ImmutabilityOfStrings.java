package String;

public class ImmutabilityOfStrings {
    public static void main(String[] args) {
        String s = "Hello";
        s = "Dello";
        s= s.substring(0,2)+'y'+s.substring(3);
        System.out.println(s);
    }
}

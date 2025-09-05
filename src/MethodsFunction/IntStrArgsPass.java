package MethodsFunction;

public class IntStrArgsPass {
    public static void main(String[] args) {
        intro("Ankit", 22 );
        intro("Johnn", 23);
    }
    public  static void intro(String name, int age){
        System.out.println("Hello "+name + " Your age is "+ age);
    }
}

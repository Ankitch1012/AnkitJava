package MethodsFunction;

public class PassIntArgs {
    public static void sum(int a, int b, int c){
        System.out.println("Sum is : " + (a+b+c));
    }

    public static void main(String[] args) {
        sum(4,5, 6);
    }
}

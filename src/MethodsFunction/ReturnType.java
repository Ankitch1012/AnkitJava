package MethodsFunction;

public class ReturnType {
    public static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(2,3));
        int x = sum(4,5);
        System.out.println(x);
    }
}

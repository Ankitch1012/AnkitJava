package MethodsFunction;

public class ScopeOfVariables {
    static int i;

    public static void main(String[] args) {
        i = 16;
        System.out.println(i);
        int i = 13;
        System.out.println(i);
        fun();

    }

    public static void fun() {
        i =10;
        System.out.println(i);
        int i =20;
        System.out.println(i);

    }
}

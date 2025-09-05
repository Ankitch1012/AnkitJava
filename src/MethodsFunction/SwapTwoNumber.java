package MethodsFunction;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void swapp(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 2;
        int b = 3;
////        int a = sc.nextInt();
////        int b = sc.nextInt();
//        System.out.println(a+" "+b);
//        int temp = a;
//        a=b;
//        b=temp;
        swapp(5, 4);
//        System.out.println(a+" "+b);

    }
}

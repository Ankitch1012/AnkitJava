package MethodsFunction;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int pow = 1;
//        for(int i =1; i<=b; i++){
//            pow*=a;
//        }
//        System.out.println(pow);
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(Math.pow(a,b));
        System.out.println(Math.abs(-6));
        System.out.println(Math.min(a,b));
        System.out.println(Math.floor(a));
        System.out.println(Math.ceil(b));
    }
}

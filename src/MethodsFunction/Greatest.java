package MethodsFunction;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

//        System.out.println(Math.max(a,Math.max(b,c)));
        System.out.println(Math.min(a,Math.min(b,Math.min(c,d))));
    }
}

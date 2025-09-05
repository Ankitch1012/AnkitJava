package MethodsFunction;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nFact = 1;
        for(int i = 1; i<=n; i++){
            nFact = nFact*i;
        }
        int rFact = 1;
        for (int i = 1; i<=r; i++){
            rFact = rFact*i;

        }
        int nmrFact = 1;
        for (int i = 1; i<=n-r; i++){
            nmrFact = nmrFact*i;
        }
        int Fact = nFact/(rFact*nmrFact);
        System.out.println(Fact);
    }

}
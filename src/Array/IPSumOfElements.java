package Array;

import java.util.Scanner;

public class IPSumOfElements {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enetrr sizze of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enetr elements of array: ");
        for (int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);

    }
}

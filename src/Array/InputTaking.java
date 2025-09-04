package Array;

import java.util.Scanner;

public class InputTaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int j = 0;
        System.out.println("Enter Array Elements");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int  i =0; i<n; i++){
            System.out.println(arr[i]+" ");

            System.out.println(arr[i]*2+" ");


        }
    }
}

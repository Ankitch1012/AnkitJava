package Array;

import java.util.Scanner;

public class SwapArray {
    public static void swapp(int arr[]){
        int temp = arr[1];
        arr[1]=arr[2];
        arr[2]=temp;
        System.out.println(arr[1]+" "+arr[2]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(arr[2]);
        swapp(arr);
    }
}

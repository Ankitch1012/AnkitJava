package Array;

import java.util.Scanner;

public class SwapPassingArrayreference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array : ");
        int n= sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter array elements : ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(arr[1]+" "+arr[2]);

        swap(arr);
        System.out.println(arr[1]+" "+arr[2]);
    }
    public static void swap(int a[]){
        int temp = a[1] ;
        a[1] = a[2];
        a[2] = temp;

    }
}

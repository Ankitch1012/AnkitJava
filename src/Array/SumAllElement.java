package Array;

public class SumAllElement {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9};
        int i;
        int sum = 0;
        for(i =0; i<arr.length; i++){
            sum = sum+arr[i];

        }
        System.out.println(sum);
    }
}

package Array;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,76,54,45,32,22,76,12};
        int max = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int smax = Integer.MIN_VALUE;
        for (i = 0; i < arr.length; i++) {
            if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
}

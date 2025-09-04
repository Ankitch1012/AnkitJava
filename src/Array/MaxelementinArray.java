package Array;

public class MaxelementinArray {
    public static void main(String[] args) {
        int arr[] = {10, 12, 13, 16, 90, 30, 8, 300, 111000, 300000, 99};
        int max  = arr[0];
        int i;
        for (i =0; i<arr.length; i++){
            if (max <arr[i]){
                max = arr[i];

            }

        }
        System.out.println(max-i);
    }
}

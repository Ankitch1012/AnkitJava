package Array;

public class CountGreater {
    public static void main(String[] args) {
        int arr[] = {34,45,56,1,22,33,44,55,66,77,88,12,23};
        int x = 58;
        int count = 0;
        for (int i =0; i<arr.length; i++){
            if (arr[i]>x){
                System.out.println(arr[i]);
                count++;

            }
//            System.out.println(count);
        }
        System.out.println(count);
    }
}

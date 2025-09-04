package Array;

public class PassingArrayToMethod {
    public static void change(int [] ankit){
        ankit[1] = 9;
//        arr[3] =6;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
//        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);
//        ankit[1] = 4;
    }
}

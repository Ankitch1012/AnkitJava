package Array;

public class SwappArray2Pointer {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        print(arr);
        int n = arr.length;
        int i = 0, j=n-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        print(arr);
    }
    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
    public static void print(int []arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}

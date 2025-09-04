package Array;

public class TwoArrayInOneMethod {
    public static void twoVar(int []brr){
       for (int i  =0; i<brr.length;i++){
           System.out.print(brr[i]+" ");
       }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int brr[] = {6,7,8,9,0};
        twoVar(arr);
        twoVar(brr);
    }
}

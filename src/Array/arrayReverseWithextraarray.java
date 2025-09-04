package Array;

public class arrayReverseWithextraarray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int rev[] = new int[arr.length];
        int j = 0 ;
        for (int i =arr.length-1;i>=0; i--){
            rev[j] = arr[i];
            j++;
        }
        System.out.println("Reversed array : ");
        for (int i = 0 ; i<rev.length; i++){
            System.out.print(rev[i]+" ");
        }


    }
}

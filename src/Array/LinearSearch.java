package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {5,10,20,3,4,3,6,8};
        int x = 9;
        boolean flag = false; //nhi mila
        for (int i =0; i<arr.length; i++){
            if (arr[i]==x){
                flag  = true; //mil gya
                break;
            }
        }
        if(flag == true){
            System.out.println("Mill gya");
        }else{
            System.out.println("nhi  mila");
        }
    }
}

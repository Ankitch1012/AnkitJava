package Array;

public class SwapPassingArray {
    public static void swap(int c[], int d[]){
        int temp = c[0];
        c[0] = d[0];
        d[0] = temp;
    }

    public static void main(String[] args) {
        int a[] = {1,2};
        int b[] = {3,4};
        System.out.println(a[0]+" "+b[0]);
        swap(a,b);
        System.out.println(a[0]+" "+b[0]);
    }
}

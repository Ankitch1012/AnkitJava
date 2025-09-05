package PatternPrinting;

import java.util.Scanner;

public class ABCDprint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 65; j<=n + 65; j++){
                System.out.print(" "+(char)j);
            }
            System.out.println();
        }
    }
}

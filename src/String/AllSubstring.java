package String;

public class AllSubstring {
    public static void main(String[] args) {
        String str = "abcd";
        int len = str.length();
        for(int i = 0; i<len; i++){
            for (int j = i+1; j<=len; j++){
                System.out.print(str.substring(i,j)+" ");
            }

        }
    }
}

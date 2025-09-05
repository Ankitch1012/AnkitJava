package String;

public class PerformanceOfString {
    public static void main(String[] args) {
        String s = "";
        for (int i =1; i<=4; i++){
            s=s+i;
        }//"" "1" "12" "123"
        System.out.println(s);
    }
}

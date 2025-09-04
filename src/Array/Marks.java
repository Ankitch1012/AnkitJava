package Array;

public class Marks {
    public static void main(String[] args) {
        int marks []  = {100, 95,85,21,17,71,36,35,7};
        int j = marks.length;
        for (int  i =0; i<j ; i++){
            if(marks[i]<35){
//                System.out.println(marks[i]);
                System.out.print(i+" ");

            }
        }

    }
}

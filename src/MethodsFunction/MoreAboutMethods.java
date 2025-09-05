package MethodsFunction;

public class MoreAboutMethods {
    public static  void pehla(){
        for(int i = 1; i<=10; i++){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    public static void akhiri(){
        System.out.println("Call Pehla and doosra");
        pehla();
        doosra();
    }
    public static void main(String[] args) {
        pehla();
        akhiri();
        System.out.println("Who are you");
        System.out.println("Please tell me");

        doosra();
        teesra();
    }
    public static void teesra(){
        System.out.println("Kaise ho bro");
    }
    public static void doosra(){
        System.out.println("I am Ankit");
    }
}

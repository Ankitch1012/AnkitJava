package MethodsFunction;

public class StudentDet {
    public static void main(String[] args) {
        intro("Ankit", 22, 14, " A+" );
        intro("Johnn", 23, 16, " A++");
    }
    public  static void intro(String name, int age, int Class, String grade){
        System.out.println("Hello "+name + " Your age is "+ age + " YOur class is " + Class + " Your graade is "+grade);
    }
}

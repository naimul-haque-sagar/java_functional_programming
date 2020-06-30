package code.generics;

public class Generics_Example4 {
    public static <T> void genericPrint(T value){
        System.out.println(value.getClass().getName()+" "+value);
    }

    public static void main(String[] args) {
        genericPrint(234);
        genericPrint("sagar");
        genericPrint(3.4);
    }
}

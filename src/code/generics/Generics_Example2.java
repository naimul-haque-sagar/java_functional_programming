package code.generics;

class PrintArray {
    <T> void printArray(T[] arr){
        for(T x:arr){
            System.out.println(x);
        }
    }
}

public class Generics_Example2 {
    public static void main(String[] args) {
        PrintArray printArray=new PrintArray();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};

        printArray.printArray(intArray);
        printArray.printArray(stringArray);
    }
}


package code.generics;

public class GenericMethod {
    <T> void printArray(T[] arr){
        for(T x:arr){
            System.out.println(x);
        }
    }
}
class GenericMethod_Example {
    public static void main(String[] args) {
        GenericMethod g=new GenericMethod();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        
        g.printArray(intArray);
        g.printArray(stringArray);
    }
}

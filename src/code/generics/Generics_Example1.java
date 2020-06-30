package code.generics;

import java.lang.reflect.Method;

class Print_Array{
    <T> void printArray(T[] arr){
        for(T x:arr){
            System.out.println(x);
        }
    }
}
public class Generics_Example1 {
    public static void main( String args[] ) {
        Print_Array print_Array = new Print_Array();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        print_Array.printArray(intArray);
        print_Array.printArray(stringArray);
        int count = 0;

        for (Method method : Print_Array.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
    }
}

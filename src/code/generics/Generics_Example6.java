package code.generics;

import java.util.Arrays;

public class Generics_Example6 {
    public static <E> void printArray(E[] arr){
        Arrays.stream(arr).forEach(i->System.out.print(i+" "));
    }
    public static void main(String[] args) {
        Integer arr[]={0, 20, 30, 40, 50};
        Character[] charArray = { 'J', 'A', 'V', 'A' };

        printArray(arr);
        System.out.println();
        printArray(charArray);
    }
}

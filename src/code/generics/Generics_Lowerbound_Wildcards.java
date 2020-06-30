package code.generics;

import java.util.Arrays;
import java.util.List;

public class Generics_Lowerbound_Wildcards {
    public static void printData(List<? super Integer> data ){
        data.stream().forEach(i-> System.out.print(i+" "));
    }

    public static void main(String[] args) {
        printData(list);
        System.out.println();
        printData(list1);
    }

    static List<Integer> list= Arrays.asList(1,2,3,4,5);
    static List<Number> list1=Arrays.asList(1.1,2.3,2.1,22);
}

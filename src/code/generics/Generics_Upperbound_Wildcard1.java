package code.generics;

import java.util.Arrays;
import java.util.List;

public class Generics_Upperbound_Wildcard1 {
    public static void printData(List<? extends Number> data){
        data.stream().forEach(i-> System.out.print(i+" "));
    }

    static List<Integer> list= Arrays.asList(1,2,3,4,5);
    static List<Double> list1=Arrays.asList(1.2,3.2,3.4,5.3);

    public static void main(String[] args) {
        printData(list);
        System.out.println();
        printData(list1);
    }
}

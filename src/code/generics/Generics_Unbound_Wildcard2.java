package code.generics;

import java.util.Arrays;
import java.util.List;

public class Generics_Unbound_Wildcard2 {
    public static void printData(List<?> data){
        data.stream().forEach(i-> System.out.print(i+" "));
    }

    public static void main(String[] args) {
        printData(list);
    }

    static List<String> list= Arrays.asList("sagar","a","b","c");
}

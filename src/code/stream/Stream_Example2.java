package code.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Example2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        System.out.println(list.stream().filter(value->value%2==0).collect(Collectors.toList()));

        List<String> list1= Arrays.asList("sagar","sourab","navin","nahid");
        list1.stream().filter(name->!name.equals("sagar")).forEach(System.out::println);
    }
}



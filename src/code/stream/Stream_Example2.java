package code.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Stream_Example2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        System.out.println(list.stream().filter(value->value%2==0).collect(Collectors.toList()));
        System.out.println(list.stream().filter(x->x%2==0).mapToInt(i->i).sum());
        list.stream().flatMapToDouble(i-> DoubleStream.of(i*2)).map(j->j).forEach(System.out::println);

        List<String> list1= Arrays.asList("sagar","sourab","navin","nahid");
        list1.stream().filter(name->!name.equals("sagar")).forEach(System.out::println);

        Stream<Integer> stream=Stream.of(1,2,3,4,5,6,7,8);
        List<Integer> list2=stream.collect(Collectors.toList());
        System.out.println(list2);

        Stream<Integer> stream1=Stream.of(1,2,3,4,5,6,7,8);
        Integer[] arr=stream1.toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));

         int[] s=new int[]{4,5,6,7};
        System.out.println(Arrays.toString(s));

        Stream<Integer> stream2=Stream.of(22,33,445,66666,11,2,3,5);
        stream2.sorted().forEach(System.out::println);

        Stream<Integer> stream3=Stream.of(22,33,445,66666,11,2,3,5);
        stream3.sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}



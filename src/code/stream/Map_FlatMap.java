package code.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map_FlatMap {
    public static void main(String[] args) {
        //map() example
        List<Integer> list = Arrays.asList(31, 61, 91, 12, 15);
        list.stream().map(i->i*2).map(i->i*2).forEach(System.out::println);

        List<String> list1 = Arrays.asList("sagar","sourab","navin","nahid");
        list1.stream().map(s->s.toUpperCase()).map(s->s.startsWith("S")).forEach(System.out::println);

        List<String> list2 = Arrays.asList("sagar","sourab","navin","nahid");
        list2.stream().filter(s->s.length()>5).map(s->s.toUpperCase()).forEach(System.out::println);

        //flatMap() example
        List<Integer> one=Arrays.asList(1,2,3);
        List<Integer> two=Arrays.asList(4,5,6);
        List<Integer> three=Arrays.asList(7,8,9);
        List<List<Integer>> merge=Arrays.asList(one,two,three);
        merge.stream().map(s->s).forEach(System.out::println);
        merge.stream().flatMap(s->s.stream()).map(s->s*2).forEach(System.out::println);
        System.out.println(merge.stream().flatMap(s->s.stream()).map(s->s*3).collect(Collectors.toList()));

        List<String> four=Arrays.asList("a","b","c");
        List<String> five=Arrays.asList("d","e","f");
        List<String> six=Arrays.asList("g","h","i");
        List<List<String>> merge1=Arrays.asList(four,five,six);
        merge1.stream().flatMap(s->s.stream()).forEach(System.out::println);
        System.out.println(merge1.stream().flatMap(s->s.stream()).map(s->s.toUpperCase()).collect(Collectors.toList()));

        List<String> list3 = Arrays.asList("sagar","sourab","navin","nahid");
        list3.stream().flatMap(s-> Stream.of(s.charAt(3))).map(s-> s.toString()).forEach(System.out::println);
    }
}

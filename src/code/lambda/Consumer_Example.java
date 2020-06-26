package code.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Consumer_Example {
    public static void main(String[] args) {
        Consumer<Integer> consumer1=s-> System.out.println(s);
        consumer1.accept(2*2);

        Consumer<String> consumer2=s-> System.out.println(s+" added extra");
        consumer2.accept("text");

        List<Integer> list= Arrays.asList(4,3,2,1);
        Consumer<List<Integer>> listConsumer=s->s.stream().map(x->x*3).forEach(System.out::println);
        listConsumer.accept(list);

        List<Integer> list2= Arrays.asList(44,33,22,11);
        List<List<Integer>> mergeList=Arrays.asList(list,list2);
        Consumer<List<List<Integer>>> listConsumer1=
                s->s.stream().flatMap(x->x.stream()).map(d->d*4).sorted().forEach(System.out::println);
        listConsumer1.accept(mergeList);

        Consumer<Integer> consumer=new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        consumer.accept(8);
    }
}

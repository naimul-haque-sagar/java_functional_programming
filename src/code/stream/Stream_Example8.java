package code.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Example8 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30,40,50,60,70,80,90);

        int x=list.stream().map(i -> i)
                //.reduce(12,(i,j)-> i+j);
                //.reduce(12, (i,j) -> Integer.sum(i, j));
                .reduce(12, Integer::sum);
        System.out.println(x);

        int z=list.stream()
                .collect(Collectors.summingInt(i -> i));

        System.out.println(z);
    }
}

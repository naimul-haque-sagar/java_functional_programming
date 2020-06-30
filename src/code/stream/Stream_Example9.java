package code.stream;

import java.util.Arrays;
import java.util.List;

public class Stream_Example9 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(44,55,33,66,77,22);
        System.out.println(list.stream().filter(i->i%2==0).map(i->i*2).findFirst().orElse(0));
    }
}

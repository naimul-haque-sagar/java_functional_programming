package code.stream;

import java.util.Arrays;
import java.util.List;

public class Stream_Reduce {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("av","abc","bc","bcde","aa","dd","ddeecc");
        System.out.println(list.stream().reduce((s1,s2)->s1.length()>s2.length()?s1:s2));

        String []word={"naimul","haque","sagar"};
        System.out.println(Arrays.stream(word).reduce((s1,s2)->s1+" "+s2));

        List<Integer> array = Arrays.asList( 4, 6, 8);
        //first argument 1 is the first element that will be added
        System.out.println(array.stream().reduce(1,(s1,s2)->s1+s2));
    }
}

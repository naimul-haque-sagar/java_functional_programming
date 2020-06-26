package code.lambda;

import java.awt.color.ProfileDataException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_Example {
    public static void main(String[] args) {
        Predicate<String> predicate1=(s)->s.startsWith("s");
        System.out.println(predicate1.test("sagarsagarsagar"));

        List<Integer> list= Arrays.asList(1,2,3,4,5);
        Predicate<List<Integer>> predicate2=l->l.contains(1);
        System.out.println(predicate2.and(x->x.size()>3).test(list));

        Predicate<Integer> predicate=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==0;
            }
        }.and(s->s<4);
        System.out.println(predicate.test(3));
    }
}

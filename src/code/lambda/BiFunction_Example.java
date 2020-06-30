package code.lambda;

import java.util.function.BiFunction;
import java.util.function.ToLongBiFunction;

public class BiFunction_Example {
    public static void main(String[] args) {
        BiFunction<Integer ,Integer,Integer> biFunction=(a,b)->a+b;
        System.out.println(biFunction.apply(2,2));

        BiFunction<String,String,String> biFunction2=(string1,string2)->string1+string2;
        System.out.println(biFunction2.apply("naimul ","sagar"));

        ToLongBiFunction<Integer,Integer> toLongBiFunction=(x,y)->x+y;
        System.out.println(toLongBiFunction.applyAsLong(22,22));

        BiFunction<Integer,Integer,Integer> biFunction1=new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer*integer2;
            }
        };
        System.out.println(biFunction1.apply(3,3));
    }
}

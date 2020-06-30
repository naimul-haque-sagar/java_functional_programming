package code.lambda;

import java.util.function.BiFunction;

public class BiFunction_Example2 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction=(a,b)->a+b;
        biFunction=biFunction.andThen(x->x*2);
        System.out.println(biFunction.apply(2,2));

        BiFunction<String ,String,String> biFunction1=(s1,s2)->s1+s2;
        biFunction1=biFunction1.andThen(value->value+"add something");
        System.out.println(biFunction1.apply("sagar"," do "));

        BiFunction<Integer,Integer,Integer> biFunction2=new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        }.andThen(v->v*2);
        System.out.println(biFunction2.apply(5,5));

    }
}


package code.lambda;

import java.util.function.BiFunction;

public class MethodReference2 {
    public static int mul(int a,int b){
        return (a-b);
    }
    
    public static float add(float a,float b){
        return (a+b);
    }
    
    public static double add(double a,double b){
        return (a+b);
    }
    
    public static String add(String a,String b){
        return (a+b);
    }
}

class MethodReferenceExample{
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> one= MethodReference2::mul;
        BiFunction<Float,Float,Float> two= MethodReference2::add;
        BiFunction<Double,Double,Double> three= MethodReference2::add;
        BiFunction<String,String,String> four= MethodReference2::add;
        
        System.out.println(one.apply(3,3));
        System.out.println(two.apply(2.2f, 4.2f));
        System.out.println(three.apply(2.6, 6.6));
        System.out.println(four.apply("sagar", "sourab"));
        
    }
}


package code.lambda;

import java.util.Arrays;
import java.util.List;

public class MethodReference4 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,56,7,8,9,12,33,44,55,667,77,88,99);
              
        list.forEach(i -> doubleValue(i));
    }
    public static void doubleValue(int i){
        System.out.println(i*2);
    }
}

class Method_Reference4 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,56,7,8,9,12,33,44,55,667,77,88,99);
              
        list.forEach( Method_Reference4::doubleValue);
    }
    public static void doubleValue(int i){
        System.out.println(i*2);
    }
}

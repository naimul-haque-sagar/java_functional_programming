
package code.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithCollection {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        List<String> list1=new ArrayList();
        list1.add("sagar");
        list1.add("sourab");
        list1.add("navin");
        
        list1.forEach(word -> System.out.println(word.toUpperCase()));
        list.forEach((a)-> System.out.println(a));
    }
}

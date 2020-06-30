
package code.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class School_Student {
    int id;
    String name;
    int age;
    
    public School_Student(int id, String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
}
public class Stream_Example1 {
    public static void main(String[] args) {
        List<School_Student> list=new ArrayList<>();
        
        list.add(new School_Student(1,"sagar",22));
        list.add(new School_Student(2,"sourab",12));
        list.add(new School_Student(3,"naim",32));
        list.add(new School_Student(4,"navin",2));
        list.add(new School_Student(5,"nahid",12));
        
        List<String> list1=list.stream()
                .filter(a -> a.age>12)
                .map(a->a.name)
                .collect(Collectors.toList());
        
        System.out.println(list1);
    }
}

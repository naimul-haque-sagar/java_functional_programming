
package code.stream;

import java.util.ArrayList;
import java.util.List;

class Student2{
    int id;
    String name;
    int age;
    
    public Student2(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student1{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }
    
}

public class Stream_MapMethod {
    public static void main(String[] args) {
        List<Student2> list=new ArrayList<>();
        
        list.add(new Student2(1,"sagar",22));
        list.add(new Student2(2,"sourab",12));
        list.add(new Student2(3,"naim",32));
        list.add(new Student2(4,"navin",2));
        list.add(new Student2(5,"nahid",12));
        
        list.stream()
                .map(i-> i.age*2)
                .forEach(System.out::println);
    }
}

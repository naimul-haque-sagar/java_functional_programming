
package code.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student1{
    int id;
    String name;
    int age;
    
    public Student1(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student1{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }
    
}

public class Stream_Filter {
    public static void main(String[] args) {
        List<Student1> list=new ArrayList<>();
        
        list.add(new Student1(1,"sagar",22));
        list.add(new Student1(2,"sourab",12));
        list.add(new Student1(3,"naim",32));
        list.add(new Student1(4,"navin",2));
        list.add(new Student1(5,"nahid",12));
        
        list.stream()
                .filter(i->i.age<22)
                .forEach(System.out::println);
                //.forEach((i)->System.out.println(i));
    }
}

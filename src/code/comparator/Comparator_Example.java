package code.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Example {
    public static void main(String[] args) {
        List<Student> list=Student.getStudent();
        Comparator comparator=Comparator.comparing(Student::getAge).reversed().thenComparing(Student::getName);
        Collections.sort(list,comparator);
        list.stream().forEach(System.out::println);
    }
}

class Student{
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static List<Student> getStudent(){
        return Arrays.asList(
                new Student(12,"sagar"),
                new Student(14,"navin"),
                new Student(22,"m_arafat"),
                new Student(22,"nadim")
        );
    }
}

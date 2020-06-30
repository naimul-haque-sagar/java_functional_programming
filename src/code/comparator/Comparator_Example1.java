package code.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Example1 {
    public static void main(String[] args) {
        List<Teacher> list=Teacher.getList();
        List<Teacher> list1=Teacher.getList();
        List<Teacher> list2=Teacher.getList();

        Comparator<Teacher> comparator=
                Comparator.comparing(Teacher::getAge).reversed()
                        .thenComparing(Teacher::getName,Comparator.nullsFirst(String::compareTo));
        Collections.sort(list,comparator);
        list.stream().forEach(System.out::println);

        Comparator<Teacher> comparator1=
                Comparator.comparing(Teacher::getName,Comparator.nullsLast(String::compareTo));
        System.out.println();
        Collections.sort(list1,comparator1);
        list1.stream().forEach(System.out::println);

        Comparator<Teacher> comparator2=
                Comparator.comparing(Teacher::getName,Comparator.nullsFirst(String::compareTo));
        Collections.sort(list2,comparator2);
        System.out.println("");
        list2.forEach(System.out::println);
    }
}

class Teacher{
    private int age;
    private String name;

    public Teacher(int age, String name) {
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
        return "Teacher{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static List<Teacher> getList(){
        return Arrays.asList(
                new Teacher(44,"atik"),
                new Teacher(33,null),
                new Teacher(33,"mina"),
                new Teacher(45,"rajib"),
                new Teacher(49,"tarik"),
                new Teacher(55,"rahim")
        );
    }
}
package code.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_Example {
    public static void main(String[] args) {
        List<Student> list=Student.getStudentList();
        list.forEach(System.out::println);
        list.forEach(student -> System.out.println(student));

        List<Student> male=list.stream()
                .filter(student -> student.getGender().equals(Gender.MALE)).collect(Collectors.toList());
        List<Student> female=list.stream()
                .filter(student -> student.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
        System.out.println(male);
        System.out.println(female);

        List<Student> age=list.stream().filter(student -> student.getAge()>12).collect(Collectors.toList());
        System.out.println(age);

        List<Integer> number=Arrays.asList(41,72,3,4);
        System.out.println(number.stream().sorted().collect(Collectors.toList()));

        List<Student> sortedList=list.stream()
                .sorted(Comparator.comparing(Student::getAge).reversed().thenComparing(Student::getName))
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        boolean allMatch=list.stream().allMatch(student -> student.getAge()>7);
        System.out.println(allMatch);

        boolean anyMatch=list.stream().anyMatch(student -> student.getAge()>33);
        System.out.println(anyMatch);

        boolean noMatch=list.stream().noneMatch(student -> student.getName().equals("sagar"));
        System.out.println(noMatch);

        list.stream().max(Comparator.comparing(Student::getAge))
                .ifPresentOrElse(System.out::println,()-> System.out.println("not found"));
        list.stream().min(Comparator.comparing(Student::getAge))
                .ifPresentOrElse(System.out::println,()-> System.out.println("not found"));

        Map<Gender,List<Student>> group=list.stream().collect(Collectors.groupingBy(Student::getGender));
        group.forEach((gender,students)->{
            System.out.println(gender);
            students.forEach(System.out::println);
        });

        list.stream().filter(student -> student.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Student::getAge)).map(Student::getName)
                .ifPresentOrElse(student-> System.out.println("youngest student "+student),()-> System.out.println("not found"));
    }
}

class Student{
    private String name;
    private int age;
    private Gender gender;

    public Student(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public static List<Student> getStudentList(){
        return Arrays.asList(
          new Student("sagar",15,Gender.MALE),new Student("navin",13,Gender.MALE),
                new Student("sumaiya",13,Gender.FEMALE),new Student("nitu",8,Gender.FEMALE)
        );
    }
}

enum Gender{
    MALE,FEMALE;
}

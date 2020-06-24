package code.optional;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class Optional_Property {
    public static void main(String[] args) {
        Person person=new Person("sagar","dhaka");
        System.out.println(person.getAddress().map(String::toUpperCase).orElse("Address not found"));
        person.getName().ifPresent(s-> System.out.println("value is "+s));
        person.getName().ifPresent(System.out::println);
        person.getName()
                .ifPresentOrElse((s)-> System.out.println(s.toUpperCase()),()-> System.out.println("No value found"));

        System.out.println(person.getName().isPresent());
        System.out.println(person.getName().isEmpty());
        System.out.println(person.getAddress().get());
    }
}

class Person{
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getAddress() {
        return Optional.ofNullable(address);
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

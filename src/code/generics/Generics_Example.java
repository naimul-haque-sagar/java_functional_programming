package code.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Generics_Example {
    public static void main(String[] args) {
        List<Book> list1=Book.getBookList();

        List<String> list=new ArrayList<>();
        list=list1.stream().map(i->i.getName()).collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}

class Book{
    private String name;
    private Integer price;

    public Book(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static List<Book> getBookList(){
        return Arrays.asList(
                new Book("a",23),
                new Book("b",44),
                new Book("c",55),
                new Book("d",22),
                new Book("e",11)
        );
    }
}
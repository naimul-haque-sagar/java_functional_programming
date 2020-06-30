package code.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Basic {
    public static void main(String[] args) {
        // returns an empty instance
        Optional<String> optionalS=Optional.empty();
        System.out.println(optionalS);

        // of() throw nullPointerException because of null values orElse it works
        Optional<String> optional=Optional.of("Hello");
        // Optional<String> optional=Optional.of(null);
        System.out.println(optional);

        // ofNullable() takes value and print value , if null it prints empty
        Optional<String> optional1=Optional.ofNullable("Hi");
        System.out.println(optional1);

        Optional<String> optional2=Optional.ofNullable(null);
        //orElse print it's value instead of null value provided
        System.out.println(optional2.orElse("Null value provided"));

        Optional<String> optional4=Optional.ofNullable(null);
        System.out.println(optional4.map(String::toUpperCase).orElse("No String provided or Null value"));
        System.out.println(optional4.map(String::toUpperCase).orElseGet(()-> {return "Null provide";}));

        Optional<String> optional3=Optional.ofNullable("sagar");
        System.out.println(optional3.map(String::toUpperCase).orElse("No String provided or Null value"));
        optional3.ifPresent(s-> System.out.println(optional3));
        optional3.ifPresent(value-> System.out.println("Value is present"));
        optional3.ifPresentOrElse(s-> System.out.println("value is "+optional3),()-> System.out.println("value is not present"));


    }
}

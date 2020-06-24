package code.optional;

import java.util.Optional;

public class Optional_Array {
    public static void main(String[] args) {
        String []arr=new String[5];
        Optional<String> value=Optional.ofNullable(arr[2]);
        System.out.println(value);
        value.ifPresent(s-> System.out.println(s));
        value.ifPresentOrElse(s-> System.out.println(s.toUpperCase()),()-> System.out.println("NO value provided"));
    }
}

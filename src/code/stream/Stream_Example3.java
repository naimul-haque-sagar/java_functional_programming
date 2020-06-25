package code.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream_Example3 {
    public static void main(String[] args) {
        List<User> list=User.getUser();
        Optional<String> result=list.stream().map(user -> user.getAddress().stream())
                .flatMap(stringStream -> stringStream.filter(address->address.equals("dhaka"))).findAny();
        result.ifPresent(System.out::println);
    }

    static class User{
        String name;
        List<String> address;

        public User(String name, List<String> address) {
            this.name = name;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getAddress() {
            return address;
        }

        public void setAddress(List<String> address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", address=" + address +
                    '}';
        }

        static List<User> getUser(){
            return Arrays.asList(
                    new User("sagar",Arrays.asList("dhaka","comilla")),
                    new User("sourab",Arrays.asList("dhaka","khulna")),
                    new User("nabin",Arrays.asList("dhaka","rajshahi")),
                    new User("nahid",Arrays.asList("dhaka","sylhet"))
            );
        }
    }
}

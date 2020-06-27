package code.stream;

import java.util.ArrayList;
import java.util.List;

public class Stream_Example4 {
    public static void main(String[] args) {
        List<Car> list=new ArrayList<>();
        list.add(new Car(1,44000));
        list.add(new Car(2,45000));
        list.add(new Car(3,46000));
        list.add(new Car(4,47000));
        list.add(new Car(5,48000));
        list.add(new Car(6,49000));

        Car car=list.stream()
                .max((p1,p2) -> p1.price > p2.price ? 1: -1 )
                .get();

        Car car1=list.stream()
                .min((a,b)-> a.price< b.price ? -1:1 )
                .get();

        System.out.println("maximum price " +car.price);
        System.out.println("minimum price " +car1.price);
    }
}

class Car {
    int id;
    int price;

    Car(int id, int price) {
        this.id = id;
        this.price = price;
    }
}
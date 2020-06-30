package code.stream;

import java.util.ArrayList;
import java.util.List;

public class Stream_Example4 {
    public static void main(String[] args) {
        List<Car1> list=new ArrayList<>();
        list.add(new Car1(1,44000));
        list.add(new Car1(2,45000));
        list.add(new Car1(3,46000));
        list.add(new Car1(4,47000));
        list.add(new Car1(5,48000));
        list.add(new Car1(6,49000));

        Car1 car=list.stream()
                .max((p1,p2) -> p1.price > p2.price ? 1: -1 )
                .get();

        Car1 car1=list.stream()
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
package code.generics;

import java.util.Arrays;
import java.util.List;

public class Generics_Upperbound_Wildcard {
    public static void printShape(List<? extends Shape> shape){
        shape.stream().forEach(shape1 -> shape1.draw());
    }
    public static void main(String[] args) {
        List<Shape> list= Arrays.asList(
            new Rectangle(),
            new Circle(),
            new Rectangle()
        );
        printShape(list);
    }
}

interface Shape{
    void draw();
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Implemented rectangle");
    }
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Implemented circle");
    }
}

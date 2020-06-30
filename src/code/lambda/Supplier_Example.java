package code.lambda;

import java.util.function.Supplier;

public class Supplier_Example {
    public static void main(String[] args) {
        Supplier<Double> doubleSupplier=()->Math.random();
        System.out.println(doubleSupplier.get());

        Supplier<Integer> integerSupplier=()-> 3;
        System.out.println(integerSupplier.get());

        Supplier<Double> supplier=new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        };
        System.out.println(supplier.get());
    }
}

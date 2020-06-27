package java8.Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Example2 {
    public static void main(String[] args) {
        Example2 example2= new Example2();
        Random random= new Random();
        Supplier<Double> supplier=random::nextDouble;
        Supplier<Double> supplier1=Example2::getDouble1;
        Supplier<Double> supplier2=example2::getDouble2;

        System.out.println(supplier.get());

        System.out.println(supplier1.get());
        System.out.println(supplier2.get());




    }
    static double getDouble1()
    {
        return 19.78;
    }
    double getDouble2()
    {
        return 19.78;
    }
}

package java8.doubleSupplier;

import java.util.Random;
import java.util.function.DoubleSupplier;

public class Example2 {
    public static void main(String[] args) {
        Example2 example2= new Example2();

        Random random= new Random();

        DoubleSupplier doubleSupplier=random::nextDouble;

        DoubleSupplier doubleSupplier1=Example2::getDouble1;
        DoubleSupplier doubleSupplier2=example2::getDouble2;


        System.out.println(doubleSupplier.getAsDouble());

        System.out.println(doubleSupplier1.getAsDouble());
        System.out.println(doubleSupplier2.getAsDouble());
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

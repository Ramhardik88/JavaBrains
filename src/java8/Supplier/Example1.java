package java8.Supplier;

import java.util.function.Supplier;

public class Example1 {
    static Supplier<Double> ds=()->345.198+3423.332;
    static Supplier<Double> ds1=()->Double.valueOf(345);
    static Supplier<Float> ds2=()->345.195f;
    static Supplier<Double> ds3=()->Math.random()*1;
    static Supplier<Integer> ds4=()->"test".length();
    static Supplier<String> ds5=()->{
        return "test".toUpperCase().concat("Ram");
    };
    public static void main(String[] args) {
        System.out.println(ds.get());
        System.out.println(ds1.get());
        System.out.println(ds2.get());
        System.out.println(ds3.get());
        System.out.println(ds4.get());
        System.out.println(ds5.get());

    }
}

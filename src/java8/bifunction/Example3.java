package java8.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Example3 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> add=(a, b)->a+b;
        Function<Integer,Integer> divide=a->a/0;
        BiFunction<Integer, Integer, Integer> add1 = add.andThen(a -> a / 0);
        System.out.println(add.apply(20,30));

    }
}

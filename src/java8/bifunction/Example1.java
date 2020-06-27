package java8.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Example1 {
    static BiFunction<Integer,Integer,Integer> addBiFunction= (num1,num2)->(num1+num2);
    static  BiFunction<Integer,Integer,Integer> multiplyBiFunction= (num1,num2)->(num1*num2);

    static Function<Integer,Integer> integerFunction=(num1)->(num1*5);
    public static void main(String[] args) {
        System.out.println(addBiFunction.apply(23,57));;
        System.out.println( multiplyBiFunction.apply(10,23));;
        System.out.println(addBiFunction.andThen(integerFunction).apply(20,30));
        
    }
}

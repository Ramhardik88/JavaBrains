package java8.bifunction;

import java.util.function.BiFunction;

public class Example2 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> add=(a,b)->a+b;

        try{
            add.andThen(null);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

package java8.bipredicate;

import java.util.function.BiPredicate;

public class Example3 {


    public static void main(String[] args) {
        BiPredicate<Integer,String> condition=(a,b)->a>30 && b.startsWith("R");
        BiPredicate<Integer,String> condition1=(a,b)->a<30 && b.startsWith("T");

        System.out.println(condition.test(20,"Test1"));
        System.out.println(condition.test(30,"RTest2"));
        System.out.println(condition.test(50,"Test3"));
        System.out.println("--------");
        System.out.println(condition.negate().test(20,"Test1"));
        System.out.println(condition.negate().test(30,"RTest2"));
        System.out.println(condition.negate().test(50,"Test3"));
        System.out.println("--------");
        System.out.println(condition.or(condition1).test(20,"Test1"));
        System.out.println(condition.or(condition1).test(30,"RTest2"));
        System.out.println(condition.or(condition1).test(50,"Test3"));
        System.out.println("--------");
        System.out.println(condition.and(condition1).test(20,"Test1"));
        System.out.println(condition.and(condition1).test(30,"RTest2"));
        System.out.println(condition.and(condition1).test(50,"Test3"));



    }
}

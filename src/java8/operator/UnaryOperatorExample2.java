package java8.operator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample2 {
    // Exclusive Or
    static UnaryOperator<Integer> Operator = a -> a^2;
    //bitwise And
    static UnaryOperator<Integer> Operator1 =  a -> a&2;
    // Exclusive Or
    static UnaryOperator<Integer> Operator2 = a -> a*2;
    //bitwise And
    static UnaryOperator<Integer> Operator3 =  a -> a+2;
    public static void main(String[] args) {
        Function<Integer, Integer> operation = Operator.andThen(Operator1);
        System.out.println(operation.apply(4));

        System.out.println(Operator3.andThen(Operator2).apply(4));

        System.out.println(Operator3.compose(Operator2).apply(4));

    }
}

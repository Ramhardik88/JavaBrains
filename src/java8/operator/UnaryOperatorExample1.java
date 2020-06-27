package java8.operator;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample1 {
    // Exclusive Or
         static UnaryOperator<Integer> Operator =  a-> a^2;
    //bitwise And
        static UnaryOperator<Integer> Operator1 =  a-> a&2;
    public static void main(String[] args) {
        System.out.println(Operator.apply(4));


        System.out.println(Operator1.apply(4));

    }
}

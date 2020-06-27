package java8.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Example4
{
    static List<Integer> odd=new ArrayList<>();
    static List<Integer> even=new ArrayList<>();
    static Consumer<Integer> consumer= a->{
        if (a % 2 == 0) {
            even.add(a);
        } else {
           odd.add(a);
        }
    };

    static Consumer<List<Integer>> productConsumer=list->{
        list.forEach(n-> System.out.println(n));
    };
    public static void main(String[] args) {
       consumer.accept(10);
       consumer.accept(20);
       consumer.accept(30);
       consumer.accept(15);
       consumer.accept(13);
        System.out.println(odd);
        System.out.println(even);

        productConsumer.accept(odd);
        productConsumer.accept(even);

    }
}

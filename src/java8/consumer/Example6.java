package java8.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example6 {
    public static void main(String[] args) {
        List<Integer>  list= Arrays.asList(8,7,12,17,14,13);
        Number number = new Number();
        Consumer<List<Integer>> oddnumber = number::printOdd;         // no static method  -- use class refernce
        Consumer<List<Integer>> evenNumber = Number::printEven;  // static method use class name
        Consumer<List<Integer>> done = number::done;

        oddnumber.andThen(evenNumber).andThen(done).accept(list);
    }
}
class Number
{
    void printOdd(List<Integer> li)                 // type1
    {
        System.out.println("printOdd");
        li.forEach(n->{
            if(n%2==1)
            {
                System.out.println(n+" ");
            }
        });

    }
   static Consumer<Integer> consumer=n->{                      //  same method but implementation different
        if(n%2==0)
        {
            System.out.println(n+" ");
        }
    };
  static   void printEven(List<Integer> li)
    {
        System.out.println("printEven");
      li.forEach(consumer);
    }
    void done(List<Integer> li)
    {
        System.out.println("proceesing done");
    }
}

package java8.biconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class Example2 {
  static   BiConsumer<List<Integer>,List<Integer>> biConsumer=(list1,list2)->{
        if(list1.size()!=list2.size())
        {
            System.out.println("false");
        }else {
            for(int i=0;i<list1.size();i++)
            {
                if(list1.get(i)!=list2.get(i))
                {
                    System.out.println("false");
                }
                else {
                    System.out.println("true ");
                }
            }
        }

    };
    public static void main(String[] args) {


        List<Integer> list= new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        List<Integer> list1= new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        biConsumer.accept(list,list1);

    }
}

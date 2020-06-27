package java8.biconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class Example4 {

    static BiConsumer<List<Integer>,List<Integer>>  compareBiConsumer=(list1,list2)->
    {
        System.out.println("the size of list1 : "+list1.size());
        System.out.println("the size of list2 : "+list2.size());

        for(int i=0;i<list1.size();i++)
        {
            if(list1.get(i)!=list2.get(i))
            {
                System.out.println(list1.get(i)+ " not equals");
            }else {
                System.out.println(list1.get(i)+ " equals");
            }
        }

    };
    static BiConsumer<List<Integer>,List<Integer>> displayBiConsumer =(list1,list2)->
    {
        list1.forEach(a-> System.out.print(a+" "));
        System.out.println();
        list2.forEach(a-> System.out.print(a+" "));
        System.out.println();
    };
    public static void main(String[] args) {
        List<Integer>  list= new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(5);

        List<Integer> list1= new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(5) ;
       list1.add(4);
         try{
             displayBiConsumer.andThen(compareBiConsumer).accept(list,list1);
         }
         catch (Exception e)
        {
            System.out.println("Exception : "+ e );
        }

     }
}

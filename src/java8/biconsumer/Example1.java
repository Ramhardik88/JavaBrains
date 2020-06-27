package java8.biconsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Example1 {
    BiConsumer<Integer,Integer> addbiConsumer=(a,b)-> System.out.println(a+b);
    BiConsumer<Integer,Integer> mulbiConsumer=(a,b)-> System.out.println(a*b);
    static Map<Integer,String> newMap= new HashMap<>();
    static BiConsumer<Map<Integer,String>,Map<Integer,String>> mapBiConsumer=
            (map1,map2)->
            {
                for (Map.Entry<Integer,String > map:map1.entrySet())
                {
                    map2.put(map.getKey()*3,map.getValue());
                }
             } ;

    public static void main(String[] args) {
        Example1 example1=new Example1();
        example1.addbiConsumer.accept(80,70);
        example1.addbiConsumer.andThen(example1.mulbiConsumer).accept(2,3);

        Map<Integer,String> map= new HashMap<>();
        map.put(1,"test1");
        map.put(2,"test2");
        map.put(3,"test3");
        map.put(4,"test4");

        mapBiConsumer.accept(map,newMap);
        System.out.println(newMap);

    }
}

package java8.biconsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Example3
{
    static BiConsumer<Integer,String > biConsumer=(k,v)->
    {
        System.out.print(k+" ");
        System.out.println(v);
    };
    public static void main(String[] args) {
        Map<Integer,String > map= new HashMap<>();
        map.put(1,"java");
        map.put(2,"javascript");
        map.put(3,"scala");
        map.put(4,"python");
        map.put(5,"kotlin");

        map.forEach(biConsumer);
    }
}

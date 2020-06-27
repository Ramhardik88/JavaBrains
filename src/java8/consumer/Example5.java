package java8.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Example5
{

   static Consumer<person> Ageconsumer=person -> {
        if(person.getAge()>18)
        {
             System.out.println(person.getName()+"  is eligible for voting");
        }else {
             System.out.println(person.getName()+" is Not eligible for voting");
        }
    };
    static Consumer<List<person>> Ageconsumer1=person -> {
        for (person p:person)
        {
            if(p.getAge()>18)
            {
                System.out.println(p.getName()+"  is eligible for voting");
            }else {
                System.out.println(p.getName()+" is Not eligible for voting");
            }
        }
    };

    public static void main(String[] args) {
        List<person> list=new ArrayList<>();
        list.add(new person("Ram",17));
        list.add(new person("RamKumar",20));
        list.add(new person("Hardik",21));

        list.forEach(Ageconsumer);

        System.out.println("-------------");
        Ageconsumer1.accept(list);

    }

}


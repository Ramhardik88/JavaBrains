package java8.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Example3
{
   static Consumer<List<person1>> Nameconsumer= person->{
       for (person1 li: person)
       {
           if(li.getName().contains("Ram"))
           {
               li.setName(li.getName().toUpperCase());
               System.out.println(li);
           }
           else {
               System.out.println(li);
           }

       }
    };
   static Consumer<List<person1>> Ageconsumer=person -> {
       for(person1 li :person)
       {
           if(li.getAge()==20)
           {
               li.setAge(li.getAge()+20);
               System.out.println(li);
           }else {
               System.out.println(li);
           }
       }
   };

    public static void main(String[] args) {
        List<person1> list=new ArrayList<>();
        list.add(new person1("Ram",19));
        list.add(new person1("RamKumar",20));
        list.add(new person1("Hardik",21));

        Nameconsumer.accept(list);
        Ageconsumer.accept(list);
      

    }

}

class person1{
    private  String Name;
    private  int age;

    public person1(String name, int age) {
        Name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

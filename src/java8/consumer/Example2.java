package java8.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Example2
{
   static Consumer<person> Nameconsumer= person->{
        if(person.getName().contains("Ram"))
        {
            person.setName(person.getName().toUpperCase());
            System.out.println(person);
        }
        else {
            System.out.println(person);
        }
    };
   static Consumer<person> Ageconsumer=person -> {
        if(person.getAge()==20)
        {
            person.setAge(person.getAge()+20);
            System.out.println(person);
        }else {
            System.out.println(person);
        }
    };

    public static void main(String[] args) {
        List<person> list=new ArrayList<>();
        list.add(new person("Ram",19));
        list.add(new person("RamKumar",20));
        list.add(new person("Hardik",21));

        list.forEach(Nameconsumer);
        System.out.println("--------------");
        list.forEach(Ageconsumer);

    }

}
class person{
    private  String Name;
    private  int age;

    public person(String name, int age) {
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

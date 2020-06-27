package java8.bipredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class Example2 {
    static BiPredicate<String,Integer> biPredicate=(name,score)->{
        if(score>80){
            System.out.println(name+ " topper");
            return true;
        }
        else
        {
            System.out.println(name +" is not topper");
            return false;
        }
    };
    public static void main(String[] args) {
        List<Student> students= Arrays.asList(new Student("test1",90)
        ,new Student("test2",94),new Student("test3",40));
        biPredicate.test("Ram",90);
        biPredicate.test("kumar ", 34);

        for (Student student:students) {
            biPredicate.test(student.getName(),student.getScore());

        }
    }
}
class Student{
    private String name;
    private int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

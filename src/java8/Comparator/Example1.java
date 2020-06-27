package java8.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Example1 {
    //old way -> anonymous inner class
     static Comparator<Person3> comparator= new Comparator<Person3>() {
        @Override
        public int compare(Person3 o1, Person3 o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    };
     // new Way-> lambda Expression using Function
    static Comparator<Person3> nameComparator=(Person3 o1, Person3 o2)->o1.getFirstName().compareTo(o2.getFirstName());
      //simplified
    static Comparator<Person3> nameComparator1=(o1, o2)->o1.getFirstName().compareTo(o2.getFirstName());
    //simplified
    static  Comparator<Person3> comparatorByFirstName=Comparator.comparing(e->e.getFirstName());

    static  Comparator<Person3> comparatorByLastName=Comparator.comparing(e->e.getLastName());
    static  Comparator<Person3> comparatorByWeight=Comparator.comparingDouble(e->e.getWeight());
    static  Comparator<Person3> comparatorByAge=Comparator.comparingDouble(e->e.getAge());
    static  Comparator<Person3> comparatorByLong=Comparator.comparingDouble(e->e.getAge());
    //method using comparator object inside object
    static Comparator<Person3> employeeSalaryComparator=Comparator.comparing(e->e.getEmployee(),(o1, o2)->
            o1.getSalary().compareTo(o2.getSalary()));
    //simplified
    static Comparator<Person3> employeeSalaryComparator1=Comparator.comparingInt(e->e.getEmployee().getSalary());
    //in string
    static Comparator<Person3> employeeSalaryComparator2=Comparator.comparing(e->e.getEmployee().getDesignation());

    static Comparator<Person3> employeeSalaryComparator3=Comparator.comparing(e->e.getEmployee(),(o1, o2)->{
        return o1.getSalary().compareTo(o2.getSalary());
    });
    static Comparator<Person3> employeeSalaryComparator4=Comparator.comparing(e->e.getEmployee(),(o1, o2)->
         o1.getSalary().compareTo(o2.getSalary()));


    public static void main(String[] args) {

        ArrayList<Person3> arrayList= new ArrayList<Person3>();
           arrayList.add(new Person3("CC","ZZ",23,65.9,new Employee3(90012,"HR")));
           arrayList.add(new Person3("AA","BB",45,72.34,new Employee3(112000,"MD")));
           arrayList.add(new Person3("BB","FF",21,65.9,new Employee3(20001,"SE")));
           arrayList.add(new Person3("DD","GG",32,67.45,new Employee3(76662,"PE")));
           Collections.sort(arrayList, nameComparator);
           System.out.println(arrayList);
          //simplified
           Collections.sort(arrayList,(o1,o2)->o1.getFirstName().compareTo(o2.getFirstName()));
    }
}
class Person{
    private String firstName;
    private String lastName;
    private Integer age;
    private Double weight;
    private Employee3 employee3;

    public Person(String firstName, String lastName, Integer age, Double weight, Employee3 employee3) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.employee3 = employee3;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Employee3 getEmployee() {
        return employee3;
    }

    public void setEmployee(Employee3 employee3) {
        this.employee3 = employee3;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", employee=" + employee3 +
                '}';
    }
}
class  Employee{
    private Integer salary;
    private String designation;

    public Employee(Integer salary, String designation) {
        this.salary = salary;
        this.designation = designation;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", designation='" + designation + '\'' +
                '}';
    }
}

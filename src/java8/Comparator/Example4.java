package java8.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Example4 {

            static Comparator<Person4> comparatorByFirstName=Comparator.comparing(Person4::getFirstName);
            static  Comparator<Person4> comparatorByLastName=Comparator.comparing(Person4::getLastName);
            static  Comparator<Person4> comparatorByWeight=Comparator.comparingDouble(Person4::getWeight);
            static  Comparator<Person4> comparatorByAge=Comparator.comparingDouble(Person4::getAge);
 //   static  Comparator<Person4> comparatorByLong=Comparator.comparingDouble(e->e.getAge());
       //using Method reference
          static Comparator<Person4> comparatorByFirstName1=
         Comparator.comparing(Person4::getFirstName).thenComparing(Comparator.comparing(Person4::getLastName));
        static Comparator<Person4> comparatorByFirstName2=
            Comparator.comparing(Person4::getFirstName).thenComparing(Comparator.comparing(Person4::getLastName))
            .thenComparing(Person4::getWeight);
  // using method refernce in object
      static Comparator<Person4> comparatorByFirstName3=Comparator.comparing(Person4::getEmployee)
          .thenComparing(Person4::getAge).thenComparing(Person4::getFirstName);



    
    public static void main(String[] args) {
        ArrayList<Person4> arrayList= new ArrayList<Person4>();
        arrayList.add(new Person4("CC","ZZ",23,65.9,new Employee4(90012,"HR")));
        arrayList.add(new Person4("AA","BB",45,72.34,new Employee4(112000,"MD")));
        arrayList.add(new Person4("BB","CC",21,65.9,new Employee4(1000,"Engineer")));
        arrayList.add(new Person4("BB","CC",32,67.45,new Employee4(1000,"Engineer")));
        arrayList.add(new Person4("BB","AA",98,70.5,new Employee4(1000,"Engineer")));

        Collections.sort(arrayList,Comparator.comparing(Person4::getFirstName));
        Collections.sort(arrayList,Comparator.comparing(Person4::getFirstName).thenComparing(Comparator.comparing(Person4::getAge)));
    }
}
class Person4 {
    private String firstName;
    private String lastName;
    private Integer age;
    private Double weight;
    private Employee4 employee;

    public Person4(String firstName, String lastName, Integer age, Double weight, Employee4 employee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.employee = employee;
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

    public Employee4 getEmployee() {
        return employee;
    }

    public void setEmployee(Employee4 employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", employee=" + employee +
                '}';
    }
}
class Employee4 implements Comparable<Employee4>
{
    private Integer salary;
    private String designation;

    public Employee4(Integer salary, String designation) {
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
        return "Employee1{" +
                "salary=" + salary +
                ", designation='" + designation + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee4 o) {
        return designation.compareTo(o.getDesignation());
    }
}

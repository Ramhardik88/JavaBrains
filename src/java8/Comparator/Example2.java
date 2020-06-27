package java8.Comparator;

import java.util.*;

public class Example2 {
    static Comparator<Person4> name1Comparator= (o1, o2)->o1.getFirstName().compareTo(o2.getFirstName());

    static Comparator<Person4>name2Comparator=Comparator.comparing(e->e.getFirstName());
    public static void main(String[] args) {
        ArrayList<Person4> arrayList= new ArrayList<Person4>();
        arrayList.add(new Person4("CC","ZZ",23,65.9,new Employee4(90012,"HR")));
        arrayList.add(new Person4("AA","BB",45,72.34,new Employee4(112000,"MD")));
        arrayList.add(null);
        arrayList.add(new Person4("BB","FF",21,65.9,new Employee4(20001,"SE")));
        arrayList.add(null);

        Collections.sort(arrayList,name2Comparator);
        for (Person4 arrlist:arrayList) {
            System.out.println(arrlist.getFirstName());
        }
        System.out.println("----------");
        Collections.sort(arrayList,name2Comparator.reversed());
        for (Person4 arrlist:arrayList) {
            System.out.println(arrlist.getFirstName());
        }
        List<String> stringList = Arrays.asList("AA","BB","CC","DD");
        Collections.sort(stringList,Comparator.reverseOrder());
        System.out.println(stringList);

        Collections.sort(arrayList,Comparator.nullsFirst(name2Comparator));
        System.out.println(arrayList);

        Collections.sort(arrayList,Comparator.nullsLast(name2Comparator));
        System.out.println(arrayList);
        List<String> stringList1=Arrays.asList("AA","BB","CC","DD");

        Collections.sort(stringList1,Comparator.naturalOrder());
        System.out.println(stringList);


    }
}
class Person1{
    private String firstName;
    private String lastName;
    private Integer age;
    private Double weight;
    private Employee4 employee;

    public Person1(String firstName, String lastName, Integer age, Double weight, Employee4 employee) {
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
class Employee1
{
    private Integer salary;
    private String designation;

    public Employee1(Integer salary, String designation) {
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
}



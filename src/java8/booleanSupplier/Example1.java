package java8.booleanSupplier;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;

public class Example1 {  static double a=80;
    static double b=70;


    static BooleanSupplier ds=()->Boolean.valueOf("true");
    static  BooleanSupplier ds1=()->5>50;

   static BooleanSupplier ds2=()->{
       return "test".equalsIgnoreCase("TEST");
   };


    public static void main(String[] args) {
        System.out.println(ds.getAsBoolean());
        System.out.println(ds1.getAsBoolean());
        System.out.println(ds2.getAsBoolean());

    }
}

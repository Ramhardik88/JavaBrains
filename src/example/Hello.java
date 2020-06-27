package example;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
//        int n1=scan.nextInt();
//        int n2=scan.nextInt();
       // System.out.format("%.4f",(float)n1/n2);
      //  float avg=(n1+n2)/2;
      //  System.out.printf("%.2f",(float)(n1+n2)/2);

        String s=scan.next();
        System.out.println( s.substring(2,5));

    }

}

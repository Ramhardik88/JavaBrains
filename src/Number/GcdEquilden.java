package Number;

public class GcdEquilden {
    public static void main(String[] args) {
        int n1=131;
        int n2=97;
        int temp=n1%n2;
        while (temp!=0);
       {
            n1=n2;
            n2=temp;
            temp=n1%n2;
        }
        System.out.println(n2);


    }
}

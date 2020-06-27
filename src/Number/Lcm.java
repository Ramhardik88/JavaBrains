package Number;

public class Lcm {
    public static void main(String[] args) {
        int n1=65;
        int n2=72,multiple;
        for(multiple=1;multiple<=n1;multiple++)
        {
            if(multiple*n2%n1==0)
                break;
        }
        System.out.println(multiple*n2);
    }
}

package example;

import java.util.ArrayList;
import java.util.List;

public class Listtoarray
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(5);
        list.add(12);
        list.add(124);
        list.add(12345);
        isSolution(list);


    }



    private static void isSolution(List<Integer> list) {

        int ints[]= new int[list.size()];

        int i=0;
        for(int n:list)
        {
            ints[i++]=n;
        }

        for(int k=0;k<ints.length;k++)
        {
            System.out.println(ints[k]);
        }
    }
}

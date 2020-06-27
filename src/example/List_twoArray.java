package example;

import java.util.ArrayList;
import java.util.List;

public class List_twoArray
{
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(10);
        list1.add(2);
        list1.add(4);
        list1.add(8);
        System.out.println(isSolution(list1));


    }

    private static int isSolution(List<Integer> list1) {
        int min=list1.get(0),max=-1;
        for(int i=0;i<list1.size();i++)
        {
            if(list1.get(i)<min)
                min=list1.get(i);
            int x=list1.get(i)-min;
            if(x!=0 && x>max)
                max=x;
        }
        return max;
    }


}

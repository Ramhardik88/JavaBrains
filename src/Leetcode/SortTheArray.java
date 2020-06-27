package Leetcode;

import java.util.function.Consumer;

public class SortTheArray {
    public static void main(String[] args) {
        int array[]={0,1,2,0,1,2};
        isSortArray(array);
    }
    private static void isSortArray(int[] array) {
        int l=0,i=0,r=array.length-1;
        while(i<=r)
        {
            if(array[i]==0)
            {
                swap(array,l++,i++);
            }
            else if(array[i]==2)
            {
                swap(array,i,r--);
            }
            else
                i++;
        }
        isPrintArray(array);


        }

    private static void isPrintArray(int[] array) {
        for (int i : array) {
            System.out.print(array[i]+" ");
        }
    }

    private static void swap(int[] array, int p1, int p2) {
        int temp=array[p1];
        array[p1]=array[p2];
        array[p2]=temp;
    }

}



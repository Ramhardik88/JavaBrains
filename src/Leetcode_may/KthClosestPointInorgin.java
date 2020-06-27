package Leetcode_may;

import java.awt.print.PrinterGraphics;
import java.util.*;

public class KthClosestPointInorgin
{
    public static void main(String[] args) {
        int arr[][]={{0,3},{2,2},{3,-3},{-1,-3}};
        int k=2;
        int result[][]=isSolution(arr,k);
        for(int[] i:result)
        {
            System.out.println(i);
        }
    }

    private static int[][] isSolution(int[][] arr, int k) {
      if(arr==null)
      {
          return null;
      }
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>(){

            @Override
            public int compare(int[] p1, int[] p2) {
                return (p2[0]*p2[0]+p2[1]*p2[1])-(p1[0]*p1[0]+p1[1]*p1[1]);
            }
        });
      for(int i=0;i<arr.length;i++)
      {
          pq.add(arr[i]);
          if(pq.size()>k)
          {
              pq.remove();
          }
      }
       int [][] result=new int[k][2];
      int i=0;
      while (!pq.isEmpty())
      {
          result[i] =pq.remove();
          i++;
      }
      return result;

    }
}

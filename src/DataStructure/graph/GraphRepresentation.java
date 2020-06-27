package DataStructure.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphRepresentation {
    public static void main(String[] args) {
        int V=5;  //vertices are: 0(A),1(B),2(C),3(D),4(E)
        List<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(3);
        adj.get(1).add(2);
        adj.get(3).add(2);
        adj.get(3).add(4);
       /*
       adj={
           {1,3},
           {2},
           {},
           {2,4},
           {}
            }
       */
        System.out.println("Neighbors of D are : ");
        for(int v:adj.get(3))
        {
            System.out.print(v+ " ");
            System.out.println((char) (v+'A'));
        }
    }
}

package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private int V;
    private LinkedList<Integer> adj[];

    public Graph(int v) {
        V=v;
        adj= new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adj[i]=new LinkedList();
        }
    }

    public void addEdges(int v,int w)
    {
        adj[v].add(w);
    }

    public  void bfs(int s)
    {
        boolean visited[]= new boolean[V];

        LinkedList<Integer> queue= new LinkedList<>();

        visited[s]=true;
        queue.add(s);

        while (queue.size()!=0)
        {
            s=queue.poll();
            System.out.println("Visited "+ s);
            Iterator<Integer> i= adj[s].listIterator();
            while (i.hasNext())
            {
                int n=i.next();
                if(!visited[n])
                {
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph= new Graph(4);
        graph.addEdges(0,1);
        graph.addEdges(0,2);
        graph.addEdges(1,2);
        graph.addEdges(2,0);
        graph.addEdges(2,3);
        graph.addEdges(3,3);
        System.out.println("Following is Breadth First Traversal");

        graph.bfs(0);




    }
}

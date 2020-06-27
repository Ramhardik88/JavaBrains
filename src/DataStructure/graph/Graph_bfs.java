package DataStructure.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph_bfs {
    private int v;
    private List<Integer>[] adj;

    public Graph_bfs(int v) {
        this.v = v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adj[i]=new LinkedList<>();
        }
    }
    public void addEdge(int u,int v)
    {
        adj[u].add(v);          // directed
        // adj[v].add(u)         // Undirected
    }

     public void bfs(int s)
     {
         LinkedList<Integer> q=new LinkedList<>();
         boolean [] visited= new boolean[v];
         q.add(s);
         visited[s]=true;
         while (!q.isEmpty())
         {
             int v=q.pop();
             System.out.println(v);
             for(int u:adj[v])
             {
                 if(!visited[u])
                 {
                     q.add(u);
                     visited[u]=true;
                  
                 }
             }
         }
     }

    public static void main(String[] args) {
        Graph_bfs graph_bfs= new Graph_bfs(5);
        graph_bfs.addEdge(0,1);
        graph_bfs.addEdge(0,3);
        graph_bfs.addEdge(1,2);
        graph_bfs.addEdge(3,2);
        graph_bfs.addEdge(3,4);
        graph_bfs.bfs(0);
    }

}

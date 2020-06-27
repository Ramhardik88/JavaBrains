package DataStructure.graph;

import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class GraphUsingAdjListIn_map {
    private Map<Integer, List<Integer>>  Adjacency_list;
    public GraphUsingAdjListIn_map(int number_of_vertices)
    {
        Adjacency_list=new HashMap<Integer, List<Integer>>();

        for(int i=1;i<=number_of_vertices;i++)
        {
            Adjacency_list.put(i,new LinkedList<>());
        }
    }
    public void setEdge(int source,int destination)
    {
        if(source>Adjacency_list.size() || destination>Adjacency_list.size())
        {
            System.out.println("the vertex entered is not present ");
            return;
        }
        List<Integer> sList=Adjacency_list.get(source);
        sList.add(destination);
        List<Integer>  dList=Adjacency_list.get(destination);
        dList.add(source);
    }
    public List<Integer> getEdge(int source)
    {
        if(source>Adjacency_list.size())
        {
            System.out.println("Vertex entered is not Present");
            return null;
        }
        return Adjacency_list.get(source);
    }

    public static void main(String[] args) {
        int source,destination;
        int number_of_vertices,number_of_edges;
        int count=1;
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter the number of vertices and edges in graph");
            number_of_vertices=scan.nextInt();
            number_of_edges=scan.nextInt();
            GraphUsingAdjListIn_map adjListIn_map = new  GraphUsingAdjListIn_map(number_of_vertices);
            System.out.println("Enter the edges in graph Format : <source index><destination index>");
            while (count<=number_of_edges)
            {
                source=scan.nextInt();
                destination=scan.nextInt();
                adjListIn_map.setEdge(source,destination);
                count++;
            }

            // print the adjacencyList
            System.out.println("the given adjacency List for the graph \n");
            for(int i=1;i<=number_of_vertices;i++)
            {
                System.out.print(i+"->");
                List<Integer> edgeList=adjListIn_map.getEdge(i);
                for(int j=1;;j++)
                {
                    if(j!=edgeList.size())
                    {
                        System.out.print(edgeList.get(j-1)+"->");
                    }else
                    {
                        System.out.println(edgeList.get(j-1));
                        break;
                    }
                }
                System.out.println();
            }
        }
        catch (InputMismatchException inputMismatch)
        {
            System.out.println("Error in Input Format. \nFormat : <source index><destination index>");
        }
        scan.close();

    }
}

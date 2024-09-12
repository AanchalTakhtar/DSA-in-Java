package Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph
{
    private HashMap< String , ArrayList<String>> adjlist= new HashMap<>();

    public void printgraph()
    {
        System.out.println(adjlist);
    }

    public boolean addvertex(String vertex)
    {
        if(adjlist.get(vertex) == null){
            adjlist.put(vertex , new ArrayList<String>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String vertex1,String vertex2)
    {
        if(adjlist.get(vertex1) != null && adjlist.get(vertex2) != null){
            adjlist.get(vertex1).add(vertex2);
            adjlist.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean remEdge(String vertex1,String vertex2)
    {
        if(adjlist.get(vertex1) != null && adjlist.get(vertex2) != null){
            adjlist.get(vertex1).remove(vertex2);
            adjlist.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean remVertex(String vertex)
    {
        if(adjlist.get(vertex) == null) return false;
        for(String otherVertex : adjlist.get(vertex)){
            adjlist.get(otherVertex).remove(vertex);
        }
        adjlist.remove(vertex);
        return true;
    }
}

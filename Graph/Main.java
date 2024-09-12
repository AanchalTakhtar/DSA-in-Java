package Graph;

public class Main
{
    public static void main(String args[])
    {
        Graph mygraph= new Graph();
        mygraph.addvertex("A");
        mygraph.addvertex("B");
        mygraph.addvertex("C");

        mygraph.addEdge("A","B");
        mygraph.addEdge("A","C");
        mygraph.addEdge("B","C");

        mygraph.remVertex("A");
        //mygraph.remEdge("A", "B");
        mygraph.printgraph();
    }
}

package Graph;

import java.util.ArrayList;

public class AdjacencyLIst2 {
    static class Edge{
        int src;
        int dest;
        int weight;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.weight=w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,2,4));
        graph[1].add(new Edge(1,3,7));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,1,3));
        graph[2].add(new Edge(2,3,6));

        graph[3].add(new Edge(3,1,-1));
        graph[3].add(new Edge(3,2,2));
        
    }
    public static void main(String[] args){
        int v=4;
        ArrayList<Edge> graph[]=new ArrayList[v];

        createGraph(graph);
        
        for(int i=0;i<graph[2].size();i++){
            Edge e =graph[2].get(i);
            System.out.println(e.src+" "+e.dest+" "+e.weight);
        }
    }
    
}

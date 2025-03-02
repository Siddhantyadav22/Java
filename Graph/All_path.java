package Graph;

// All path from Source to Target
/* for given src & tar, print all paths that exist from src to tar.
    src =0 , tar=5
 */
import java.util.ArrayList;

public class All_path {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
             graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited, String path, int tar) {//O(V+E)
        System.out.print(curr + " ");
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                dfs(graph, e.dest, visited, path + " -> " + e.dest, tar);
            }
        }
        visited[curr] = false; // Backtrack and mark current node as unvisited
    }

    public static void printAllPath(ArrayList<Edge>[] graph, boolean[] visited, int curr, String path, int tar) { //O(V^V)
        if (curr == tar) {
            System.out.println(path);
            return;
        }
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                printAllPath(graph, visited, e.dest, path + " -> " + e.dest, tar);
            }
        }
        visited[curr] = false; // Backtrack and mark current node as unvisited
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        createGraph(graph);

        int src = 0, tar = 5;
        printAllPath(graph, new boolean[V], src,String.valueOf(src), tar);
    }    
}

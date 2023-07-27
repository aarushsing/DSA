import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathUnweightedGraph {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        // for undirected connect u and v and then v and u
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void BFS(ArrayList<ArrayList<Integer>> adj, int V, int s, int []dist) {
        boolean[] visited = new boolean[V];
        for(int i = 0; i < V; i++) {
            visited[i] = false;
        }
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while(q.isEmpty() == false) {
            int u = q.poll();
            // get the adjacent node of source
            for(int v : adj.get(u)) {
                if(visited[v] == false) {
                    dist[v] = dist[u] + 1;
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        int []dist = new int[V];
        for(int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[0] = 0;
        BFS(adj, V, 0, dist);
        for(int i = 0; i < V; i++) {
            System.out.print(dist[i] + ",");
        }
    }
}

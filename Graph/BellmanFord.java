package Graph;

import java.util.Arrays;

public class BellmanFord {

    public static int[] bellman(int vertex, int[][] edges, int src) {
        int[] dist = new int[vertex];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // Relax edges |V| - 1 times
        for (int i = 0; i < vertex - 1; i++) {
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int wt = edge[2];
                if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }
        }

        // Check for negative weight cycles
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                // Negative cycle detected
                return new int[] { -1 };
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        int v = 5;
        int[][] edges = new int[][] {
                { 0, 1, 2 }, { 0, 2, 3 }, { 1, 2, 1 },
                { 2, 3, 2 }, { 2, 4, 4 }, { 3, 4, 1 }
        };

        int[] distances = bellman(v, edges, 0);
        if (distances[0] == -1) {
            System.out.println("Negative weight cycle detected.");
        } else {
            System.out.println("Vertex Distance from Source:");
            for (int i = 0; i < distances.length; i++) {
                System.out.println("Vertex " + i + ": " + distances[i]);
            }
        }
    }
}
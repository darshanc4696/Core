package corejava;
import java.util.*;

public class Bob1 {
    public static int solve(int n, int[] memberId, int m, int[][] friends) {
        // Step 1: Create a graph representation using an adjacency list.
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int id : memberId) {
            graph.put(id, new ArrayList<>());
        }
        // Add edges for each friendship
        for (int i = 0; i < m; i++) {
            int a = friends[i][0];
            int b = friends[i][1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        // Step 2: Use a set to keep track of visited students
        Set<Integer> visited = new HashSet<>();
        int connectedComponents = 0;

        // Step 3: Perform DFS/BFS to find connected components
        for (int id : memberId) {
            if (!visited.contains(id)) {
                // New component found, increment the count
                connectedComponents++;
                // Perform DFS to visit all students in this component
                dfs(id, graph, visited);
            }
        }

        // Step 4: Return the number of connected components
        return connectedComponents;
    }

    private static void dfs(int current, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        // Mark the current student as visited
        visited.add(current);
        // Visit all friends (neighbors) of the current student
        for (int neighbor : graph.get(current)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, graph, visited);
            }
        }
    }

    // Testing the function with the given sample input
    public static void main(String[] args) {
        int n = 4;
        int[] memberId = {6, 1, 3, 8};
        int m = 2;
        int[][] friends = {{6, 1}, {1, 8}};
        System.out.println(solve(n, memberId, m, friends)); // Output should be 2
    }
}

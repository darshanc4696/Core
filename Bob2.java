package corejava;
import java.util.*;

public class Bob2 {
    public static int solve(int n, int[] memberid, int m, int[][] friends, int k) {
        // Step 1: Create an adjacency list for the graph
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(memberid[i], new ArrayList<>());
        }

        // Step 2: Populate the adjacency list with friendships
        for (int i = 0; i < m; i++) {
            int a = friends[i][0];
            int b = friends[i][1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        // Step 3: BFS to calculate minimum time to teach everyone
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(k);
        visited.add(k);
        int hours = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            // Process all nodes at the current level
            for (int i = 0; i < size; i++) {
                int current = queue.poll();

                // Visit all unvisited neighbors
                for (int neighbor : graph.get(current)) {
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
            // Increment hours if the queue is not empty
            if (!queue.isEmpty()) {
                hours++;
            }
        }

        return hours;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] memberid = {6, 1, 3, 8, 2};
        int m = 5;
        int[][] friends = {{6, 8}, {6, 1}, {1, 2}, {2, 3}, {3, 8}};
        int k = 2;

        int result = solve(n, memberid, m, friends, k);
        System.out.println(result); // Output: 2
    }
}


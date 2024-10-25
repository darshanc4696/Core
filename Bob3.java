package corejava;
import java.util.*;

public class Bob3 {
    public static int solve(int n, int k, int[] defaulters, int m, int[][] friends) {
        // Step 1: Create a set of defaulters for quick lookup
        Set<Integer> defaulterSet = new HashSet<>();
        for (int defaulter : defaulters) {
            defaulterSet.add(defaulter);
        }

        // Step 2: Track the minimum number of friendships to break
        int friendshipsToBreak = 0;

        // Step 3: Check each friendship and determine if it needs to be broken
        for (int i = 0; i < m; i++) {
            int a = friends[i][0];
            int b = friends[i][1];

            // If either end of the friendship is a defaulter, we need to break it
            if (defaulterSet.contains(a) || defaulterSet.contains(b)) {
                friendshipsToBreak++;
            }
        }

        // Step 4: Return the minimum number of friendships to break
        return friendshipsToBreak;
    }

    public static void main(String[] args) {
        int n = 3;
        int k = 1;
        int[] defaulters = {2};
        int m = 3;
        int[][] friends = {{2, 1}, {1, 3}, {2, 3}};

        int result = solve(n, k, defaulters, m, friends);
        System.out.println(result); // Output: 2
    }
}

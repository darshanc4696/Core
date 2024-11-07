package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmailSorter {

    public static void main(String[] args) {
        // Sample input
        String input1 = "alice@google.com,bob@instag.com,charlie@tap.com";
        String input2 = "david@medium.com,emma@short.com,frank@longestdomainname.com";
        
        // Sort and print the output for the first sample input
        System.out.println("Sample Output 1:");
        sortAndPrintEmails(input1);

        // Sort and print the output for the second sample input
        System.out.println("\nSample Output 2:");
        sortAndPrintEmails(input2);
    }

    private static void sortAndPrintEmails(String input) {
        // Split the input string by commas to get individual email addresses
        List<String> emails = new ArrayList<>(Arrays.asList(input.split(",")));

        // Sort the emails based on the specified criteria
        emails.sort(Comparator
            .comparingInt((String email) -> email.split("@")[1].length()) // 1. Length of domain
            .thenComparingInt(email -> email.split("@")[0].length())     // 2. Length of username
            .thenComparing(email -> email.split("@")[1])                  // 3. Alphabetical order of domain
            .thenComparing(email -> email.split("@")[0])                  // 4. Alphabetical order of username
        );

        // Print each sorted email on a new line
        for (String email : emails) {
            System.out.println(email);
        }
    }
}

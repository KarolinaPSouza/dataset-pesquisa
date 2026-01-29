import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class entry_11163399 {
    public static void main(String[] args) throws IOException {
        // Initialize BufferedReader for faster input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Read the number of values
        int n = Integer.parseInt(reader.readLine().trim());

        // Use a HashSet to store unique values
        HashSet<Integer> uniqueValues = new HashSet<>();

        // Read the values as a single line
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        // Parse each value and add it to the set
        while (tokenizer.hasMoreTokens()) {
            uniqueValues.add(Integer.parseInt(tokenizer.nextToken()));
        }

        // Output the count of unique values
        System.out.println(uniqueValues.size());
    }
}



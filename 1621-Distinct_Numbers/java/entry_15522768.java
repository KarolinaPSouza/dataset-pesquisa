import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class entry_15522768 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // Read n
        int n;
        while (true) {
            try {
                n = Integer.parseInt(br.readLine());
                if (n >= 1 && n <= 2 * 100000) break;
            } catch (NumberFormatException e) {
                // Continue reading until valid input
            }
        }

        HashSet<Integer> inputs = new HashSet<>();
        int[] arr = new int[n];

        // Read the array line
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            // Get next integer from the line
            int val = Integer.parseInt(st.nextToken());

            // Validate value is positive
            while (val < 1) {
                // If we need to read a new value, we'll need to handle it differently
                // Since we're reading from StringTokenizer, we need alternative approach
                System.err.println("Invalid value, skipping...");
                // For now, just skip invalid values by reading next token
                if (st.hasMoreTokens()) {
                    val = Integer.parseInt(st.nextToken());
                } else {
                    // If no more tokens, read next line
                    st = new StringTokenizer(br.readLine());
                    val = Integer.parseInt(st.nextToken());
                }
            }

            arr[i] = val;
        }

        // Add unique values to HashSet
        for (int i = 0; i < n; i++) {
            inputs.add(arr[i]);
        }

        System.out.println(inputs.size());
        br.close();
    }
}
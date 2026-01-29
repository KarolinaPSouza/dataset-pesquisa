import java.io.*;
import java.util.*;

public class entry_11731766 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());  // Reading n
        Set<Long> set = new HashSet<>();  // Use Long for large numbers

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            set.add(Long.parseLong(st.nextToken()));  // Read and store in set
        }

        System.out.println(set.size());  // Print distinct count
    }
}
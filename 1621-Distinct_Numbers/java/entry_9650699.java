import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class entry_9650699 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        Set<Integer> set = new HashSet<>();

        String[] input = br.readLine().trim().split("\\s+");
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(input[i]);
            set.add(num);
        }

        System.out.println(set.size());
    }
}
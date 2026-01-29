import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class entry_13442553 {
    public static int distinctNumbers(int n, int arr[]) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<n; ++i) {
            set.add(arr[i]);
        }

        int res = set.size();
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for(int i=0; i<n; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(distinctNumbers(n, arr));
    }
}
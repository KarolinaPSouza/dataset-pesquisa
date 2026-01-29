import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class entry_14958986 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = Arrays.stream(br.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for(int i=0; i<n; i++){
            if(!set.contains(array[i])){
                ans++;
                set.add(array[i]);
            }
        }
        System.out.println(ans);

    }
}
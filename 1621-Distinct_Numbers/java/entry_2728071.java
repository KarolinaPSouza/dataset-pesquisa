import java.io.*;
import java.util.*;

public class entry_2728071 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        TreeSet<Integer> a = new TreeSet<Integer>();
        st = new StringTokenizer(r.readLine());
        for(int i = 0; i < n; i++){
            a.add(Integer.parseInt(st.nextToken()));
        }
        System.out.println(a.size());
    }
}
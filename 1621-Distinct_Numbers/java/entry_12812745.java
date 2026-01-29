import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;

public class entry_12812745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        PrintWriter pw = new PrintWriter(out);
        int tc = parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Long> arr = new ArrayList<>(tc);
        for(int i = 0; i < tc; i++) {
            arr.add(Long.parseLong(st.nextToken()));
        }
        Collections.sort(arr);
        int dupes = 0;
        for(int i = 0; i < tc - 1; i++) {
            if(arr.get(i).equals(arr.get(i+1))) {
                dupes++;
            }
        }
        pw.println(tc - dupes);
        pw.close();
    }
}
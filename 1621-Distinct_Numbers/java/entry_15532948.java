import java.io.*;
import java.util.*;

public class entry_15532948 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int n = Integer.parseInt(br.readLine());
      String[] input = br.readLine().split(" ");
      Set<Integer> set = new HashSet<>();
      for (int i = 0; i < n; i++) {
        set.add(Integer.parseInt(input[i]));
      }
      bw.write(set.size() + "\n");
      bw.flush();
  }
}
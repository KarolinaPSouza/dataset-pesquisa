import java.io.*;
import java.util.*;

public class entry_10939459 {
   public static void main(String[] args) throws IOException {
       BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
       PrintWriter pw = new PrintWriter(System.out);

       r.readLine();
       String[] nums = r.readLine().split(" ");

       HashSet<String> hs = new HashSet<>();

       for (int i = 0 ; i < nums.length ; i++) {
            hs.add(nums[i]);
       }

       pw.println(hs.size());
       pw.close();
   } 
}
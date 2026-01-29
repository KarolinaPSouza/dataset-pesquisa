/*import java.util.*;
 public class entry_11788897 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int  n=sc.nextInt();
    int arr[]=new int [n];
    HashSet<Integer>set=new HashSet<>();
    for(int i=0;i<n;i++) {
          arr[i]=sc.nextInt();
          set.add(arr[i]);
    }
    System.out.print(set.size());
}
}
*/
import java.io.*;
import java.util.*;

public class entry_11788897 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); 

        HashSet<Integer> set = new HashSet<>(n); // Initialize with expected size to avoid resizing
        String[] inputs = br.readLine().split(" "); // Read all inputs as a single string and split

        for (String s : inputs) {
            set.add(Integer.parseInt(s)); // Parse and add directly to the HashSet
        }

        System.out.println(set.size()); // Output the size of the distinct values
    }
}
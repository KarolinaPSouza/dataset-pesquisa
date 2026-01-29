import java.util.*;

public class entry_6624971 {
 public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);

        int n = fs.nextInt();

        Set<Long>set = new HashSet<>();

        for(int i=0; i<n; i++) {
            long x = fs.nextLong();
            set.add(x);
        }

        System.out.println(set.size());
 }
}
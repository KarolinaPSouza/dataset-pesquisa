//package CSES;
import java.util.*;
public class entry_2292409 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0; i<n; i++) {
            hs.add(sc.nextInt());
        }
        System.out.println(hs.size());
        sc.close();
    }
}
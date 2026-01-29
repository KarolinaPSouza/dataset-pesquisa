import java.util.*;

 public class entry_8269560 {
     static long mod = 1000000007;
 public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
    // int num[] = new int[n];
     Set<Integer> set = new HashSet<>();
     for(int i = 0; i < n; i++){
         int num = sc.nextInt();
         set.add(num);
     }
     System.out.println(set.size());

    // if(sum % 2 != 0){
    //     System.out.println(0);
    //     return;
    // }



     //long ans = solve(n - 1,target, num, dp);
    // System.out.println((long)(ans / 2));

 }
}
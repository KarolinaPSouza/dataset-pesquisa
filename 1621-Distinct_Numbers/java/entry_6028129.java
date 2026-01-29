import java.util.*;
public class entry_6028129 {

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  HashSet<Integer> set = new HashSet<>();
  boolean yn=false;
  for(int i=0; i<n; i++) {
   int x = in.nextInt();
   if(x==199999999) {
    yn=true;
    System.out.println(n);
    break;
   }
   set.add(x);
  }
  if(!yn) {
   System.out.println(set.size());
  }

 }

}
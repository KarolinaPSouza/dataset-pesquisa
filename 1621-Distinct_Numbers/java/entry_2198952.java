import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class entry_2198952 {
    public static void main(String []args)throws Exception {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int n = Integer.parseInt(br.readLine());
  String S[] = br.readLine().split(" ");
  HashSet<String> set = new HashSet<>();
  for(String s : S)
   set.add(s);
   System.out.println(set.size());
 }
} 

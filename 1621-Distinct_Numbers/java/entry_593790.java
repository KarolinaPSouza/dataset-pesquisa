import java.io.*;
import java.util.*;

public class entry_593790 {
 static class InputReader{
  BufferedReader reader;
  StringTokenizer tokenizer;

  public InputReader(InputStream stream) {
   reader = new BufferedReader (new InputStreamReader(stream), 32768);
   tokenizer = null;
  }

  String next() {
   while(tokenizer == null || !tokenizer.hasMoreTokens()) {
    try {
     tokenizer = new StringTokenizer(reader.readLine());
    }catch(IOException e) {
     throw new RuntimeException(e);
    }
   }

   return tokenizer.nextToken();
  }

  public int nextInt() {
   return Integer.parseInt(next());
  }

  public long nextLong() {
   return Long.parseLong(next());
  }

  public double nextDouble() {
   return Double.parseDouble(next());
  }

 }


 static InputReader r = new InputReader(System.in);
 static PrintWriter pw = new PrintWriter(System.out);

 public static void main (String[] args) {

  //CODE GOES HERE

  int n = r.nextInt();
  HashSet<Integer> arr = new HashSet<Integer>();
  for(int i=0; i<n; i++) {
   int x = r.nextInt();
   if(!arr.contains(x)) {
    arr.add(x);
   }
  }

  System.out.println(arr.size());

  pw.close();

 }

}
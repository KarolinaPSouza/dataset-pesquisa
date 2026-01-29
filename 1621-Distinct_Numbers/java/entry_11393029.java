import java.io.*;
import java.util.*;

public class entry_11393029 {

    static BufferedReader br;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = getInt();
        HashSet<Integer> s = new HashSet<>();
        for(int i : arrint(" ")) s.add(i);
        bw.write(s.size() + "\n");        
        bw.flush();
    }

        private static void solve(int[] cnt, int n, char[][] mat, Set<Integer> col, Set<Integer> d1, Set<Integer> d2) throws IOException {
        if(n == 8) {cnt[0]++; return;}

        for(int i = 0; i<8; i++){
            if(mat[n][i] == '.' && !col.contains(i) && !d1.contains(n-i) && !d2.contains(n+i)){
                d1.add(n-i); 
                d2.add(n+i); 
                col.add(i);
                solve(cnt, n+1, mat, col, d1, d2);
                d1.remove(n-i);
                d2.remove(n+i);
                col.remove(i);
            }
        }

    }

    static int intoint(String s){
        return Integer.parseInt(s); 
   }
   static long intolong(String s){
        return Long.parseLong(s); 
   }
   static int getInt() throws IOException{
       return Integer.parseInt(br.readLine());
   }
   static long getLong() throws IOException{
       return Long.parseLong(br.readLine());
   }
   static double getDouble() throws IOException{
       return Double.parseDouble(br.readLine());
   }

   static int[] arrint(String sep) throws IOException{
       String[] str = br.readLine().split(sep);
       int n = str.length;
       int[] a = new int[n];
       for(int i = 0; i<n; i++) a[i] = Integer.parseInt(str[i]);
       return a;
   }
   static long[] arrlong(String sep) throws IOException{
       String[] str = br.readLine().split(sep);
       int n = str.length;
       long[] a = new long[n];
       for(int i = 0; i<n; i++) a[i] = Long.parseLong(str[i]);
       return a;
   }
   static int[] arrint(int n, String sep) throws IOException{
       int[] a = new int[n];
       String[] str = br.readLine().split(sep);
       for(int i = 0; i<n; i++) a[i] = Integer.parseInt(str[i]);
       return a;
   }
   static long[] arrlong(int n, String sep) throws IOException{
       long[] a = new long[n];
       String[] str = br.readLine().split(sep);
       for(int i = 0; i<n; i++) a[i] = Long.parseLong(str[i]);
       return a;
   }
   static double[] arrdouble(int n, String sep) throws IOException{
       double[] a = new double[n];
       String[] str = br.readLine().split(sep);
       for(int i = 0; i<n; i++) a[i] = Double.parseDouble(str[i]);
       return a;
   }
   static int[][] matint(int n, String sep) throws IOException{
       int[][] mat = new int[n][];
       for(int i = 0; i<n; i++) mat[i] = arrint(n, sep);
       return mat;
   }
   static long[][] matlong(int n, String sep) throws IOException{
       long[][] mat = new long[n][];
       for(int i = 0; i<n; i++) mat[i] = arrlong(n, sep);
       return mat;
   }
   static int[][] matint(int n, int m, String sep) throws IOException{
       int[][] mat = new int[n][];
       for(int i = 0; i<n; i++) mat[i] = arrint(m, sep);
       return mat;
   }
   static long[][] matlong(int n, int m, String sep) throws IOException{
       long[][] mat = new long[n][];
       for(int i = 0; i<n; i++) mat[i] = arrlong(m, sep);
       return mat;
   }
   static String[] matstr(int n, int m, String sep) throws IOException{
       String[] mat = new String[n];
       for(int i = 0; i<n; i++) mat[i] = br.readLine();
       return mat;
   }
   static char[][] matchar(int n, int m, String sep) throws IOException{
    char[][] mat = new char[n][];
    for(int i = 0; i<n; i++) mat[i] = br.readLine().toCharArray();
    return mat;
   }
   static void print(int[] a) throws IOException{
       for(int i = 0; i<a.length;i++) bw.write(a[i] + " ");
       bw.write("\n");
   }
   static void print(int[][] a) throws IOException{
       for(int i = 0; i<a.length;i++) print(a[i]);
   }
   static void print(long[] a) throws IOException{
       for(int i = 0; i<a.length;i++) bw.write(a[i] + " ");
       bw.write("\n");
   }
   static void print(long[][] a) throws IOException{
       for(int i = 0; i<a.length;i++) print(a[i]);
   }
}
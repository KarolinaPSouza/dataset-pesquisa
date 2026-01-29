import java.io.*;
import java.util.*;

public class entry_9000415 {
 static class FastReader {
  BufferedReader br;
  StringTokenizer st;

  public FastReader() {
   br = new BufferedReader(new InputStreamReader(System.in));
  }

  String next() {
   while (st == null || !st.hasMoreElements()) {
    try {
     st = new StringTokenizer(br.readLine());
    } catch (IOException e) {
     e.printStackTrace();
    }
   }
   return st.nextToken();
  }

  int nextInt() {
   return Integer.parseInt(next());
  }

  long nextLong() {
   return Long.parseLong(next());
  }

  double nextDouble() {
   return Double.parseDouble(next());
  }

  String nextLine() {
   String str = "";
   try {
    str = br.readLine();
   } catch (IOException e) {
    e.printStackTrace();
   }
   return str;
  }
 }

 static class Pair {
  int first;
  int second;

  Pair(int first, int second) {
   this.first = first;
   this.second = second;
  }
 }
 /* ============ This is for fast I/O ============== */

 static long mod = 1000000007;
 static boolean sieve[] = new boolean[1000001];

 // finding prime till 10^6
 public static void sieve() {
  Arrays.fill(sieve, true);
  sieve[0] = false;
  sieve[1] = false;
  // finding prime numbers till 10001
  for (int i = 2; i * i < sieve.length; i++) {
   if (sieve[i] == true) {
    for (int j = i * i; j < sieve.length; j += i)
     sieve[j] = false;
   }
  }
 }

 public static void main(String[] args) {
  FastReader sc = new FastReader();

  /*
   * // list of all prime no till 10001 List<Integer> prime = new ArrayList<>();
   * for(int i = 0; i < sieve.length; i++) { if(sieve[i] == true)prime.add(i); }
   */

  // List<Integer> arr = new ArrayList<>();
  // arr.add(new Pair(sc.nextInt(), sc.nextInt()));
  // for (int i = 0; i < n; i++) {
  // arr.add(sc.nextLong());
  // }
  // Collections.sort(arr, (a, b) -> Integer.compare(a.second, b.second));

  int n = sc.nextInt();
  Set<Long> set = new HashSet<>();
  for (int i = 0; i < n; i++) {
   set.add(sc.nextLong());
  }

  System.out.println(set.size());
 }

 private static boolean canMakeProductsInTime(int[] arr, long mid, int target) {
  // TODO Auto-generated method stub
  long products = 0;
  for (int i = 0; i < arr.length; i++) {
   products += (mid / arr[i]);

   if(products >= target) {
    break;
   }
  }
  return (products >= target);
 }

 public static long res(long num) {
  long mul = 1;
  while (num > 0) {
   int ld = (int) (num % 10);
   num /= 10;
   mul = mul * ld;
  }
  return mul;
 }

 public static long pow(long a, long b) {

  if (b == 0) {
   return 1;
  }
  if (b == 1) {
   return a % mod;
  }
  long p = pow(a, b >> 1);
  p = ((p % mod) * (p % mod)) % mod;
  if ((b & 1) != 0) {
   p = (p * a) % mod;
  }
  return p % mod;
 }
}
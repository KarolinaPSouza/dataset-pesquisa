import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.*;
import java.util.*;

public class entry_2578652 {

    // static final File ip = new File("input.txt");
    // static final File op = new File("output.txt");
    // static {
    // try {
    // System.setOut(new PrintStream(op));
    // System.setIn(new FileInputStream(ip));
    // } catch (Exception e) {
    // }
    // }
    static long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        FastReader sc = new FastReader();
            int n = sc.nextInt();
            HashMap<Long,Integer> hm = new HashMap<>();
            for(int i=0;i<n;i++)
            {
                long t = sc.nextLong();
                hm.put(t, hm.getOrDefault(t, 0)+1);
            }
            System.out.println(hm.size());

    }

    static long power(long x, long y, long p) {
        long res = 1;
        x = x % p;
        if (x == 0)
            return 0;
        while (y > 0) {
            if ((y & 1) != 0)
                res = (res * x) % p;
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }

    public static int countSetBits(long number) {
        int count = 0;
        while (number > 0) {
            ++count;
            number &= number - 1;
        }
        return count;
    }

    private static <T> void swap(T[] array, int i, int j) {
        if (i != j) {
            T tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }

    private static long getSum(int[] array) {
        long sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    private static boolean isPrime(Long x) {
        if (x < 2)
            return false;
        for (long d = 2; d * d <= x; ++d) {
            if (x % d == 0)
                return false;
        }
        return true;
    }

    static int[] reverse(int a[], int n) {
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
        return a;
    }

    private static boolean isPrimeInt(int x) {
        if (x < 2)
            return false;
        for (int d = 2; d * d <= x; ++d) {
            if (x % d == 0)
                return false;
        }
        return true;
    }

    public static String reverse(String input) {
        StringBuilder str = new StringBuilder("");

        for (int i = input.length() - 1; i >= 0; i--) {
            str.append(input.charAt(i));
        }

        return str.toString();
    }

    private static int[] getPrimes(int n) {
        boolean[] used = new boolean[n + 1];
        used[0] = used[1] = true;
        int size = 0;
        for (int i = 2; i <= n; ++i) {
            if (!used[i]) {
                ++size;
                for (int j = 2 * i; j <= n; j += i) {
                    used[j] = true;
                }
            }
        }
        int[] primes = new int[size];
        for (int i = 0, cur = 0; i <= n; ++i) {
            if (!used[i]) {
                primes[cur++] = i;
            }
        }
        return primes;
    }

    private static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    private static long gcd(long a, long b) {
        return (a == 0 ? b : gcd(b % a, a));
    }

    static void shuffleArray(int[] arr) {
        int n = arr.length;
        Random rnd = new Random();
        for (int i = 0; i < n; ++i) {
            int tmp = arr[i];
            int randomPos = i + rnd.nextInt(n - i);
            arr[i] = arr[randomPos];
            arr[randomPos] = tmp;
        }
    }

    static void shuffleList(ArrayList<Long> arr) {
        int n = arr.size();
        Random rnd = new Random();
        for (int i = 0; i < n; ++i) {
            long tmp = arr.get(i);
            int randomPos = i + rnd.nextInt(n - i);
            arr.set(i, arr.get(randomPos));
            arr.set(randomPos, tmp);
        }
    }

    static void factorize(long n) {
        int count = 0;
        while (!(n % 2 > 0)) {
            n >>= 1;

            count++;
        }
        if (count > 0) {
            // System.out.println("2" + " " + count);
        }
        for (long i = 3; i <= (long) Math.sqrt(n); i += 2) {
            count = 0;
            while (n % i == 0) {
                count++;
                n = n / i;
            }
            if (count > 0) {
                // System.out.println(i + " " + count);
            }
        }

        if (n > 2) {
            // System.out.println(i + " " + count);
        }
    }

    static void shuffleArrayL(long[] arr) {
        int n = arr.length;
        Random rnd = new Random();
        for (int i = 0; i < n; ++i) {
            long tmp = arr[i];
            int randomPos = i + rnd.nextInt(n - i);
            arr[i] = arr[randomPos];
            arr[randomPos] = tmp;
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public boolean hasNext() {
            return false;
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
}
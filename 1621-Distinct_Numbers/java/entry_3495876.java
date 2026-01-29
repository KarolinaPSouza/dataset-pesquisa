// Created By Jefferson Samuel on 23/08/21 at 2:11 am

import javax.swing.text.Segment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;



public class entry_3495876 {
    static void solve() throws Exception {


        int T = 1;
        while(T-->0) {

            int N = scanInt();
            int M[] = scInAr(N);
            HashSet<Integer> hs = new HashSet<>();
            for (int i = 0; i < N; i++) {hs.add(M[i]);}
            out.println(hs.size());

        }
    }






















    // Essentials
    static int scanInt() throws IOException {return parseInt(scanString());}

    static int[] scInAr(int N) throws IOException {
        int[] a = new int[N];
        for(int i = 0;i<N;i++)a[i] = scanInt();
        return a;
    }

    static ArrayList<Integer> scInLi(int N) throws IOException
    {
        ArrayList<Integer> lis = new ArrayList<>(N);
        for (int i = 0; i < N; i++) lis.add(scanInt());
        return lis;
    }
    static void revsortAr(long ar[]){sortAr(ar);revar(ar);}

    static void revar(long ar[]){for (int i = 0; i < ar.length / 2; i++) { long temp = ar[i]; ar[i] = ar[ar.length - 1 - i]; ar[ar.length - 1 - i] = temp;}}
    static long[] scLoAr(int N) throws IOException {
        long[] a = new long[N];
        for(int i = 0;i<N;i++)a[i] = scanLong();
        return a;
    }

    static final Random random=new Random();
    static void sortAr(long[] a) {
        int n=a.length;//shuffle, then sort
        for (int i=0; i<n; i++) {
            int oi=random.nextInt(n);long temp=a[oi];
            a[oi]=a[i]; a[i]=temp;
        }
        Arrays.sort(a);
    }
    static long scanLong() throws IOException {return parseLong(scanString());}

    static String scanString() throws IOException {
        while (tok == null || !tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
            in.close();
            out.close();
        } catch (Throwable e) {
            e.printStackTrace();
            exit(1);
        }
    }
}
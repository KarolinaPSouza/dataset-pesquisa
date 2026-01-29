import java.io.*;
import java.util.*;

public class entry_15598330 {

    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();

        int n = sc.nextInt();
        HashSet<Long> set = new HashSet<>(n * 2);

        for (int i = 0; i < n; i++) {
            set.add(sc.nextLong());
        }

        System.out.println(set.size());
    }

    // ---------- FAST SCANNER ----------
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int num = 0, c;
            boolean neg = false;
            while ((c = read()) <= ' ') ;
            if (c == '-') {
                neg = true;
                c = read();
            }
            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }
            return neg ? -num : num;
        }

        long nextLong() throws IOException {
            long num = 0;
            int c;
            boolean neg = false;
            while ((c = read()) <= ' ') ;
            if (c == '-') {
                neg = true;
                c = read();
            }
            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }
            return neg ? -num : num;
        }
    }
}
//package com.company;

import java.io.*;
import java.util.*;

public class entry_2243156 {
    public static void main(String[] args) throws IOException {
        PrintStream out = new PrintStream(System.out);
        Reader sc = new Reader();
        int n=sc.nextInt();
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)
            set.add(sc.nextInt());
        out.println(set.size());
        out.flush();
    }

    static class Reader {
        BufferedReader br;
        StringTokenizer st;

        public Reader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
            return st.nextToken();
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

        public String nextLing() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                System.out.println(e);
            }
            return str;
        }
    }
}
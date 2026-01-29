import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

class Pair {
    int a;
    int b;

    Pair(int x, int y) {
        a = x;
        b = y;
    }

    int getA() {
        return a;
    }

    int getB() {
        return b;
    }
}

public class entry_7638150 {
    public static void main(String[] args) throws IOException {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] arr1 = sc.readLine().split(" ");
        String[] arr2 = sc.readLine().split(" ");
        // String[] arr3 = sc.readLine().split(" ");

        int n = Integer.parseInt(arr1[0]);
        // int k = Integer.parseInt(arr1[1]);

        ArrayList<Long> ls = new ArrayList<>();
        // ArrayList<Long> pre = new ArrayList<>();
        // ArrayList<Integer> cust = new ArrayList<>();

        for (String a : arr2) {
            ls.add(Long.parseLong(a));
        }

        Map<Long, Integer> mp = new HashMap<>();

        for (long a : ls) {
            mp.put(a, 1);
        }

        System.out.println(mp.size());

        // long s1 = 0;
        // long s2 = 0;
        // pre.add(ls.get(0));

        // for (int i = 1; i < n; i++) {
        // pre.add(ls.get(i) + pre.get(i - 1));
        // }

        // PriorityQueue<Long> pq2 = new PriorityQueue<>();
        // PriorityQueue<Long> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

        // for (int i = 0; i < k - 1; i++) {
        // long x = ls.get(i);
        // if (pq1.size() == 0) {
        // pq1.add(x);
        // s1 += x;
        // } else if (pq1.size() != 0) {
        // if (x <= pq1.peek()) {
        // pq1.add(x);
        // s1 += x;
        // } else {
        // pq2.add(x);
        // s2 += x;
        // }
        // }
        // if (pq1.size() - pq2.size() >= 2) {
        // s2 += pq1.peek();
        // s1 -= pq1.peek();
        // pq2.add(pq1.poll());
        // } else if (pq2.size() - pq1.size() >= 2) {
        // s1 += pq2.peek();
        // s2 -= pq2.peek();
        // pq1.add(pq2.poll());
        // }
        // }

        // ArrayList<Long> rs = new ArrayList<>();

        // for (int i = k - 1; i < n; i++) {
        // long x = ls.get(i);
        // if (pq1.size() == 0) {
        // pq1.add(x);
        // s1 += x;
        // } else if (pq1.size() != 0) {
        // if (x <= pq1.peek()) {
        // pq1.add(x);
        // s1 += x;
        // } else {
        // pq2.add(x);
        // s2 += x;
        // }
        // }

        // if (pq1.size() - pq2.size() >= 2) {
        // s2 += pq1.peek();
        // s1 -= pq1.peek();
        // pq2.add(pq1.poll());
        // } else if (pq2.size() - pq1.size() >= 2) {
        // s1 += pq2.peek();
        // s2 -= pq2.peek();
        // pq1.add(pq2.poll());
        // }

        // // System.out.println("+" + pq1);
        // // System.out.println("+" + pq2);
        // long s = pq1.size() + pq2.size();
        // long ps = i == k - 1 ? pre.get(i) : pre.get(i) - pre.get(i - k);
        // long m;
        // if (s % 2 != 0) {
        // if (pq1.size() > pq2.size()) {
        // m = pq1.peek();
        // } else {
        // m = pq2.peek();
        // }
        // } else {
        // m = Math.min(pq1.peek(), pq2.peek());
        // }
        // // System.out.println("m" + m);
        // // System.out.println("ps" + ps);

        // // long d = m * pq1.size() - s1 + s2 - m * pq2.size();
        // rs.add(m);

        // if (pq1.contains(ls.get(i - k + 1))) {
        // pq1.remove(ls.get(i - k + 1));
        // s1 -= ls.get(i - k + 1);
        // } else {
        // pq2.remove(ls.get(i - k + 1));
        // s2 -= ls.get(i - k + 1);
        // }

        // if (pq1.size() - pq2.size() >= 2) {
        // s2 += pq1.peek();
        // s1 -= pq1.peek();
        // pq2.add(pq1.poll());
        // } else if (pq2.size() - pq1.size() >= 2) {
        // s1 += pq2.peek();
        // s2 -= pq2.peek();
        // pq1.add(pq2.poll());
        // }

        // if (pq1.size() == 0 && pq2.size() != 0) {
        // s1 += pq2.peek();
        // s2 -= pq2.peek();
        // pq1.add(pq2.poll());
        // }
        // // System.out.println("-" + pq1);
        // // System.out.println("-" + pq2);
        // }

        // PrintWriter out = new PrintWriter(System.out);
        // // StringBuilder sb = new StringBuilder();
        // // for (long a : rs) {
        // // sb.append(a + " ");
        // // }
        // // System.out.println(sb);
        // for (long a : rs) {
        // out.print(a + " ");
        // }
        // out.flush();
        sc.close();
    }
}
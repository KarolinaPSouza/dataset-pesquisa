import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class entry_6700898 {

    static TreeMap<Integer, Integer> treeMap = new TreeMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < n; i ++) {
            int x = Integer.parseInt(stringTokenizer.nextToken());
            add(x);
        }
        System.out.println(treeMap.size());
    }

    static void add(int x) {
        if (treeMap.containsKey(x)) {
            treeMap.put(x, treeMap.get(x) + 1);
        } else {
            treeMap.put(x, 1);
        }
    }
}
import java.util.*;


public class entry_2753440 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = input.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                int temp = map.get(a[i]);
                map.put(a[i], temp + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        System.out.println(map.size());
    }
}
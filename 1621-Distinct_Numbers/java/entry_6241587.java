import java.util.*;

public class entry_6241587 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Count the frequency of each element using a HashSet
        Set<Integer> distinctValues = new HashSet<>();
        for (int num : arr) {
            distinctValues.add(num);
        }

        int distinctCount = distinctValues.size();
        System.out.println(distinctCount);
    }
}
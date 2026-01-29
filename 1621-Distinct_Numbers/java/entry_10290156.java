import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class entry_10290156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt(); ;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i<arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}
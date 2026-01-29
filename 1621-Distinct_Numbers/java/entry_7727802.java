import java.util.HashSet;
import java.util.Scanner;

public class entry_7727802 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>(n);

        for(int i = 0; i<n; i++){
            int temp = sc.nextInt();
            set.add(temp);
        }

        System.out.println(set.size());
    }
}
import java.util.*;
import java.util.Scanner;

public class entry_5480615 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lines = in.nextInt();
        in.nextLine();
        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < lines; i++){
            int number = in.nextInt();
            set.add(number);
        }

        System.out.println(set.size());
    }
}
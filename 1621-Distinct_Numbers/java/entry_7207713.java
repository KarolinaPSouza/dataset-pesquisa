import java.util.*;

public class entry_7207713 {


    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
      Set<Integer>set= new HashSet<>();
        int answer;
        for (int i = 0; i < n; i++) {
           answer=scanner.nextInt();
           set.add(answer);
        }

        System.out.println(set.size());


    }



}
import java.util.*;
import java.io.*;

public class entry_1140005 {

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int n = in.nextInt();

  HashSet<Integer> distincts = new HashSet<Integer>();

  for (int i = 0; i < n; i++) {
   distincts.add(in.nextInt());
  }

  System.out.println(distincts.size());

  in.close();

 }

}
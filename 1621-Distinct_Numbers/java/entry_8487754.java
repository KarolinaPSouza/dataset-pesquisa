import java.util.HashSet;
import java.util.Scanner;

public class entry_8487754 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long arr[]=new long[(int)n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextLong();
        }
        System.out.println(count(n, arr));


    }

    public static long count(long n,long arr[]){
        HashSet<Long>set=new HashSet<>();
        for(long i:arr){
            set.add(i);
        }
        return set.size();
    }
}
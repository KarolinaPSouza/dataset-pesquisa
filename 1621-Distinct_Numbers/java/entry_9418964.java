import java.util.*;
import java.io.*;
public class entry_9418964 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        String a[]=br.readLine().split("\\s+");
        HashSet<Long> s=new HashSet<>();
        for(int i=0;i<n;i++)
        s.add(Long.parseLong(a[i]));
        wr.write(Integer.toString(s.size())+"\n");
        wr.flush();
        wr.close();
        br.close();

    }
}
import java.io.*;
import java.util.*;

public class entry_4128086 {

    static class InputReader{
        BufferedReader reader;
        StringTokenizer token;

        public InputReader (InputStream stream){
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            token = null;
        }

        String next(){
            while (token==null || !token.hasMoreTokens()){
                try{
                    token= new StringTokenizer(reader.readLine());
                } catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
            return token.nextToken();
        }

        public int nextInt(){
            return Integer.parseInt(next());
        }
    }

    static InputReader r= new InputReader(System.in);
    static PrintWriter pw= new PrintWriter(System.out);

    static HashMap<Integer, Integer> multihash = new HashMap<Integer, Integer>();

    static void add(int x){
        if (multihash.containsKey(x)){
            multihash.put(x, multihash.get(x)+1);
        }else{
            multihash.put(x, 1);
        }
    }

    public static void main(String[] args){
        int number= r.nextInt();

        for(int i=0; i < number; i++){
            add(r.nextInt());
        }

        pw.print(multihash.size());
        pw.close();
    }
}
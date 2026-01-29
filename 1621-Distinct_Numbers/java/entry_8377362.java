import java.util.*;
class LearnYard {
    public static void main(String[] args) {
        // you code goes here
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int [] arr = new int[n];

  for(int i=0;i<n;i++){
   arr[i]=sc.nextInt();
  }
  HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<n;i++){

            if(hm.containsKey(arr[i])){
                int o = hm.get(arr[i]);
                hm.put(arr[i],o+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        System.out.println(hm.size());
    }
}
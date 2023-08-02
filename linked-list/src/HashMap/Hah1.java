package HashMap;

import java.util.*;

public class Hah1 {
    public static void printIntersection(int[] arr1, int[] arr2) {
  HashMap<Integer,Integer> hm=new HashMap<>();
  List<Integer> intersect=new ArrayList<>();
  for(int i=0;i<arr1.length;i++){
      if(hm.containsKey(arr1[i])){
         int t=hm.get(arr1[i]);
         t++;
         hm.put(arr1[i],t);
      }
      else{
          hm.put(arr1[i],1);
      }
  }
  for(int i=0;i<arr2.length;i++){
      if(hm.containsKey(arr2[i])&&hm.get(arr2[i])>0){
          intersect.add(arr2[i]);
          hm.put(arr2[i],hm.get(arr2[i])-1);
      }
  }

  for(int i=0;i<arr2.length;i++){
      if(intersect.contains(arr2[i])){
          System.out.println(arr2[i]);
          //intersect.remove(Integer.valueOf(arr1[i]));
      }
  }

}
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = scanner.nextInt();
            }
            int m = scanner.nextInt();
            int[] arr2 = new int[m];
            for (int i = 0; i < m; i++) {
                arr2[i] = scanner.nextInt();
            }
            scanner.close();

            printIntersection(arr1, arr2);
        }
    }


package HashMap;
import java.util.*;

public class MaximumFNumber {
    public static int maxFreq(int [] a){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int max=0,num=0;
        for (int i = 0; i < a.length; i++) {
            if(hm.containsKey(a[i])){
                int t=hm.get(a[i]);
                t++;
                hm.put(a[i],t);
            }

            else{
                hm.put(a[i],1);
            }

            if(hm.get(a[i])>max||(hm.get(a[i])==max&&a[i]<num)){
                max=hm.get(a[i]);
                num=a[i];
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int res=maxFreq(arr);
        System.out.println(res);
    }


}

import java.util.*;
public class HashMap2 {
    public static void main(String[]args){
        HashMap<Integer,Integer> likki=new HashMap<>();
        int arr[]={3,3,6,3,7,3};
        int n=arr.length/2;
        //if oka vela length 2.5 ala vasthe it take least integer means 2
        for(int i=0;i<arr.length;i++) {
            int n1 = arr[i];
            likki.put(n1, likki.getOrDefault(n1, 0) + 1);
        }
        int ans=0;
        for(int likith:likki.keySet()){
            int val=likki.get(likith);
            if(val>n){
                ans=ans+likith;
                //val line lo hash table value vastadi kani manaki key kavali so we take key name :likith

            }
        } 
        System.out.println(ans);
    }
}

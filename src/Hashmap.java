import java.util.*;
public class Hashmap {
    public static void main(String[]args){
        HashMap<Integer,Integer>likki=new HashMap<>();
        int arr[]={3,2,3,4,6,2,5};
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            if(likki.containsKey(n)){
                int prev=likki.get(n);
                likki.put(n,prev+1);

            }else{
                likki.put(n,1);
            }
        }
        for(int likith:likki.keySet()){
            System.out.println(likith+" ->"+likki.get(likith));
        }
    }


}

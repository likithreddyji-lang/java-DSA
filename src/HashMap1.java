import java.util.*;
public class HashMap1 {
    public static void main(String[]args){
        HashMap <String,Integer> likki=new HashMap<>();
        String arr[]={"hai","bolo","hai","tata"};
        for(int i=0;i<arr.length;i++){
            String n=arr[i];
            if(likki.containsKey(n)){
                int prev=likki.get(n);
                likki.put(n,prev+1);
            }else{
                likki.put(n,1);
            }
        }
        for(String likith:likki.keySet()){
            System.out.println(likith+"->"+likki.get(likith));
        }

    }
}

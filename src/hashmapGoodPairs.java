import java.util.*;
public class hashmapGoodPairs {
    public static void main(String[]args){
        HashMap<Integer,Integer> likki=new HashMap <>();
        int arr[]={1,2,1,1,2};
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            likki.put(n,likki.getOrDefault(n,0)+1);
        }
        int ans=0;
        for(int likith:likki.keySet()){
            int val=likki.get(likith);
            int n=val-1;
            ans+=n*(n+1)/2;
            //indulo hashmap use chestam so ee number enni sarlu vachindi ani frequency count yntadi
            //logic ante val lo edi eni sarlu ani untadi 2 3times,4-2 times vaste
            //avi enni pairs formayyaye ane danuki formula n*N+1/2 formua kani manam aa n ni okka number
            //taggisthene mana value so set ayyi correct anser vastadi


        }
        System.out.println(ans);
    }
}

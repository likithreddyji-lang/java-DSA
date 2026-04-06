import java.util.*;
public class jewelsANdStonesHashMap {
    public static void main(String[]args){
        HashMap<Character,Integer>likki=new HashMap<>();
        String Stones="aAAbbbb";
        String Jewels="aA";
        for(int i=0;i<Stones.length();i++){
            char ch=Stones.charAt(i);
            likki.put(ch,likki.getOrDefault(ch,0)+1);
        }
        //stones frequency ciunt hashmap use chesi vastadi ee charcater enni tims ani untadi hashmap lo
        //kani queston vachi stons lo enni jwewls unnai ani
        //manaki smalla 1 time A 2 times small b 4 times ani hashmap count untadi
        //jewels ni traverse chestam
        //jewls same hashmap lo ne unte enni satrlu ani ans vastadi
        int ans=0;
        for(int i=0;i<Jewels.length();i++){
            char ch=Jewels.charAt(i);
            if(likki.containsKey(ch)){
                ans=ans+likki.get(ch);
            }
        }
        System.out.println(ans);

    }
}

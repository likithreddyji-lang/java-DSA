public class goodPairs {
    public static void main(String[]args){
        int arr[]={1,2,4,1,1,2};
        int ans=0;
        //edhi normal for loop use chesi enni pairs form avutai ani
        for(int i=0;i<arr.length;i++)
        {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ans = ans + 1;


                }

            }
        }
        System.out.println(ans);
    }

}

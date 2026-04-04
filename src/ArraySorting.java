import java.util.*;
public class ArraySorting {
    public static void main(String[]args){
        //bubble sort
        int arr[]={3,4,2,8,6,9};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        //sorting lo clumsy vunna elemts line lo pettali
        //loop ni n-1 times endhuku ante general ga sorting lo we dont use last element so last
        //lo vanna element wasted so we take n-1 in always sorting




    }
}

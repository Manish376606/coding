//Time complexity = O(n)
//Space complexity = O(1)   constant
import java.util.*;
class reversal{
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int n= arr.length;
        int temp=0;
        for(int i=0;i<n/2;i++){
            temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-1-i]=temp;

        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
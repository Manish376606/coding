import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your size of element");
        int n= sc.nextInt();
        System.out.println("enetr your element of array");
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        int low=0,high =n-1;
        System.out.println("enter your target value");
        int target =sc.nextInt();
        while(low<=high){
           int  mid=low+(high-low)/2;
           if(arr[mid]==target){
            System.out.println("searching element found index number is " +mid);
            break;
           }
           else if(arr[mid]<target){
            low =mid +1;
           }
           else{
            high= mid -1;
           }
           
        }
    }
    
}

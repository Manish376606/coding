// Time Complexity: O(log n)
// Space Complexity: O(1)
import java.util.*;
import java.io.*;
class lowerbound{
    public static int lowerbound1(int arr[],int target){
        int low=0,high=arr.length-1;
        int result=- 1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                 result =mid;
                 high=mid-1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your size of array");
        int n= sc.nextInt();
        System.out.println("enter your element  of array");
        int arr []= new int [n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter your target value");
        int target = sc.nextInt();
        int result = lowerbound1(arr,target);
        if(result==-1){
            System.out.println("searching element is not found");
        }else{
            System.out.println("searching element found in index "+result);
        }

    }
}
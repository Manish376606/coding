import java.util.*;
class recbinary{
    public static int  binaryrec(int arr[], int low, int high,int target ){
        int result =-1;
        int mid = low + (high-low)/2;
        while(low<=high){
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid ] < target){
            return binaryrec(arr, mid+1, high , target);
        } 
        else{
            return binaryrec(arr, low, mid-1, target);
        }
    }
    return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter  the element of array");
        int arr[]= new int [n];
        int low=0;
        int high =n-1;
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter your target");
        int target =sc.nextInt();;
        int result =  binaryrec(arr,low,high,target);
       if(result==-1){
        System.out.println("target element is not found");
       }
       else{
        System.out.println("target element is found  index is  "+ result);
       }        
        }    }

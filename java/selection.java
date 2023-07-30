import java.util.*;
import java.io.*;
public class selection {
    public static void selection(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            int min =i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
        
        if(min!=i){
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number of element of array");
        int n= sc.nextInt();
        System.out.println("enter the element of array");
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        selection(arr, n);
        System.out.println(Arrays.toString(arr));

    }
    
}

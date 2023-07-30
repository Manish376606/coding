import java.util.*;
public class bubble {
    public static void  bubblesort(int arr[],int n){
       
    
        for(int i=0;i<1;i++){
            boolean swapped = false;
            for(int j=i;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                         swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter how many element in array");
        int n= sc.nextInt();
        System.out.println("Enter element you want to have");
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        bubblesort(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}

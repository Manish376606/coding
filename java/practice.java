import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int arr[]= new int [n];
        for(int i=0;i<n;i++){
             arr[i]= sc.nextInt();
        }
        System.out.println("enter the target number");
        int index =-1;
        int target = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("target element is not found");
        }
        else{
            System.out.println("target element is founded index is  "+ index);
        }

    }
    
}

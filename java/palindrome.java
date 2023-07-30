//Time complexity = O(n)
//Space complexity = O(1) 
import java.util.*;
class palindrome{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int flag=0;
        int arr[]= new int[ n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n/2;i++){
          if(arr[i]!=arr[n-1-i]){
            flag=1;
            System.out.println("this is not a palindrome number");
            break;
          }
        }
        if(flag==0){
            System.out.println("this is your palindrome number");
        }

    }
}
//Time complexity is : O(n)
// Space complexity is : O(1)
import java.util.Scanner;
public class linearSearching {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your size of element in array");
        int n=sc.nextInt();
        int arr[] = new int [n];
        System.out.println("enter your element");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int flag =0;
        int x =67; // target vaue
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                flag=1;
                break;
            }

        }
        if(flag==0){
            System.out.println("target element does not found ");
        }
        else{
            System.out.println("found the target element");
        }

    }
}
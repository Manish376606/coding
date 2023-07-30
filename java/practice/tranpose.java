import java.util.*;
public class tranpose {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows and column");
        int n=sc.nextInt();
        int m= sc.nextInt();
        int arr[][]= new int [n][m];
        System.out.println("enter the element of matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
        }
    }
       System.out.println("transpose of matrix ");
    for(int j=0;j<n;j++){
        for(int i=0;i<n;i++){
            System.out.print(arr[i][j]);
        }
        System.out.println();
    }


    }
    
}

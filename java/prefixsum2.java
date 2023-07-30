import java.util.*;
import java.io.*;
public class prefixsum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many rows in matrix . Please enter");
        int n= sc.nextInt();
        System.out.println("how many column in matrix in column. Please enter");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        // traversed the array row-wise to calculate the row-wise prefix sum
         for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
         // traversed the array column-wise to calculate the column-wise prefix sum
           for(int j=0;j<n;j++){
            for(int i=1;i<n;i++){
                arr[i][j]+=arr[i-1][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print(arr[i][j]);
            }
            System.out.println();
        }


        System.out.println("enter your row 1");
        int r1 =sc.nextInt();
        System.out.println("enter your column 1");
        int c1= sc.nextInt();
        System.out.println("enter your 2nd rows");
        int r2 = sc.nextInt();
        System.out.println("enter your 2nd column");
        int c2 =sc.nextInt();
         int sum = 0, up = 0, left = 0, repeated_region = 0, result=0;
        sum = arr[r2][c2];
        up = arr[r1-1][c2];
        left = arr[r2][c1-1];
        repeated_region = arr[r1-1][c1-1];

        result = sum - up - left + repeated_region;
        System.out.println(result);
        
    }
}

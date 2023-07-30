//Time complexity is : O(m*n)
// Space complexity is : O(1)
// brute force aaproach
import java.util.*;
import java.io.*;
public class prefixsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your row 1");
        int r1 =sc.nextInt();
        System.out.println("enter your column 1");
        int c1= sc.nextInt();
        System.out.println("enter your 2nd rows");
        int r2 = sc.nextInt();
        System.out.println("enter your 2nd column");
        int c2 =sc.nextInt();
       
        System.out.println("enter your rows how many  in matrix");
        int n = sc.nextInt();
        System.out.println("enter your column how many in matrix ");
        int m = sc.nextInt();
         int arr[][]=new int [n][m];
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]= sc.nextInt();
            }
         }

          for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
         }
         int sum =0;
         for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum+=arr[i][j];
            }
         }
         System.out.println("sum of prefix matrix is  "+ sum);
    }
}

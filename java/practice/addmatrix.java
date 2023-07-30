import java.util.*;
public class addmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and column");
        int n= sc.nextInt();
        int m= sc.nextInt();
        int first[][]=new int[n][m];
        System.out.println("this is the first matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               first[i][j]=sc.nextInt();
            }
        }
        System.out.println("this is the second matrix");
        int second[][]= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                second[i][j]= sc.nextInt();
            }
        }
        int sum[][]=new int[n][m];
        System.out.println("sum of two matrix ");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum[i][j]=first[i][j]+second[i][j];
                System.out.print(sum[i][j]+"  ");
            }
            System.out.println();
        }


        
    }
    
}

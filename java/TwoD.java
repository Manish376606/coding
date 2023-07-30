import java.util.*;
public class TwoD {
    public static   Boolean man(int arr[][],int target){
        
        int n= arr.length;
        if(n==0){
             return false;
        }
        int m = arr[0].length;
        int low=0 ,high=n*m-1,mindex=0,melement=0;
        while(low<=high){
            mindex= low+ (high- low)/2;
            melement = arr[mindex/n][mindex%n];
            if(melement== target){
                return true;
            }
            else{
                if(melement > target ){
                    // left side
                    high = mindex - 1;
                }
                else{
                    low = mindex + 1;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the row");
        int n= sc.nextInt();
        System.out.println("enter the column");
        int m= sc.nextInt();
        int arr[][]= new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++ ){
                arr[i][j]= sc.nextInt();

            }
        }
        System.out.println("Enter the target");
        int target= sc.nextInt();
        boolean  result = man( arr,target);
        System.out.println(result);

    }
    
}

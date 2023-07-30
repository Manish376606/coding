import java.util.*;
class squareroot{
    public static int square(int num){
        int low =0,high=num,result=-1;
        while(low<=high){
            int mid = low+ (high - low)/2;
            int val =mid*mid;
            if(val==num){
                return mid ;
            }
            else if(val<num){
                result = mid;
                low = mid+1;

            }else{
                high = mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the elment you want to have perfect square");
        int num =sc.nextInt();
        int result = square(num);
        if(result==-1){
            System.out.println("There is no perfect square root of number ");
        }
        else{
            System.out.println("This is your perfect square number is   " +result );
        }
    }
}
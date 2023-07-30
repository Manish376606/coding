// sum of digits using recursion* 
import java.util.*;
public class sumofdigits {
    public static int digits(int n){
        int result =0;
        if(n==0){
            return 0;
        }else{
            result = n%10 + digits(n/10);
        }
        return result;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
         int result =digits(n);
         System.out.println(result);
    }
}

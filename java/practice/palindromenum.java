import java.util.*;
public class palindromenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int remainder=0,sum=0;
        int temp=n;
        while(temp>0){
            remainder =temp%10;
            sum =(sum*10)+remainder;
            temp=temp/10;
        }
        if(sum==n){
            System.out.println("it is palindrome number");
        }else{
            System.out.println("it is not a palindroe number");
        }

    }
    
}

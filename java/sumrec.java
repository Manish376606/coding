import java.util.*;
public class sumrec {
    public static int sum(int n){
        if(n==0){
            return n;
        }
        int result =n%10 + sum(n/10);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digits");
        int n= sc.nextInt();
        int result =sum(n);
        System.out.println(result);
    }
    
}

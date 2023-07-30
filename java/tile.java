import java.util.*;
public class tile {
    public static int wall(int n){
        int result =0;
        if(n<=1){
            return n;
        }
        else{
            result= wall(n-1)+ wall(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int result =wall(n+1);
        System.out.println(result);
    }
}

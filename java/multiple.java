import java.util.*;
public class multiple {
    public static void digits(int n,int k){
       
        if(k==1){
            System.out.println(n);
            return;
        }
        digits(n,k-1);
        System.out.println(n*k);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        digits(n,k);
    }
    
}
